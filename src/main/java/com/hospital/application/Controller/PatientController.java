package com.hospital.application.Controller;

import com.hospital.application.API.ApiResponse;
import com.hospital.application.Dto.PatientRequest;
import com.hospital.application.Dto.PatientResponse;
import com.hospital.application.Entity.Patient;
import com.hospital.application.Service.PatientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {

    private final PatientService pr;

    @GetMapping("/all")
    public ResponseEntity<ApiResponse<List<PatientResponse>>> getAll (@RequestBody PatientRequest Req) {
        List<PatientResponse> pt = pr.getAll();
        ApiResponse ar = new ApiResponse(HttpStatus.CREATED.value(), true, "Patient is added successfully", LocalDateTime.now(), pt);
        return ResponseEntity.status(HttpStatus.CREATED).body(ar);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse<PatientResponse>>  add(@RequestBody PatientRequest Req) {
        PatientResponse pt=pr.add(Req);
        ApiResponse ar=new ApiResponse(HttpStatus.CREATED.value(), true,"Patient is added successfully", LocalDateTime.now(),pt);
        return ResponseEntity.status(HttpStatus.CREATED).body(ar);
    }

    
    @GetMapping("/single/{id}")
    public ResponseEntity<ApiResponse<PatientResponse>>  single(@PathVariable Long id) {
        PatientResponse pt=pr.getId(id);
        ApiResponse ar=new ApiResponse(HttpStatus.CREATED.value(), true,"Patient is added successfully", LocalDateTime.now(),pt);
        return ResponseEntity.status(HttpStatus.CREATED).body(ar);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ApiResponse<PatientResponse>>  update(@RequestBody PatientRequest par, @PathVariable Long id) {
        PatientResponse pt=pr.getId(id);
        ApiResponse ar=new ApiResponse(HttpStatus.CREATED.value(), true,"Patient is added successfully", LocalDateTime.now(),pt);
        return ResponseEntity.status(HttpStatus.CREATED).body(ar);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse<PatientResponse>> delete(@PathVariable Long id) {
        pr.delete(id);
        ApiResponse ar=new ApiResponse(HttpStatus.OK.value(),true,"Patient is deleted successfully", LocalDateTime.now(),pr);
       return ResponseEntity.status(HttpStatus.OK).body(ar);

    }
}