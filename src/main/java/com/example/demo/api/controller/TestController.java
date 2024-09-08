package com.example.demo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TestDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @PostMapping("/validate")
    public ResponseEntity<?> testValidator(
        @Valid @RequestBody TestDto testDto
        // BindingResult bindingResult
    ) {
        // if (bindingResult.hasErrors()) {
        //     bindingResult.getFieldErrors().forEach(e -> {
        //         System.out.println(e.getDefaultMessage());
        //     });
        // }
        System.out.println(testDto.getFullName());
        System.out.println(testDto.getEmail());

        return ResponseEntity.ok(testDto);
    }
}
