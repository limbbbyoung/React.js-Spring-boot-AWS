package com.example.demo.controller;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBodyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * TestController.java
 * Class 설명을 작성하세요.
 *
 * @author 임병영
 * @since 2022.11.23
 */

@RestController
@RequestMapping("/test") // 리소스
public class TestController {

    private String helloWorld = "Hello World! ID ";

    @GetMapping
    public String testController() {
        return "Hello World!";
    }

    @GetMapping("/{id}")
    public String testControllerWithPathVariables(@PathVariable(required = false) int id) {
        return helloWorld + id;
    }

    // /test 경로는 이미 존재하므로 /test/testRequestParam으로 지정했다.
    @GetMapping("/testRequestParam")
    public String testControllerRequestParam(@RequestParam(required = false) int id) {
        return helloWorld + id;

    }

    @GetMapping("/testRequestBody")
    public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
        return helloWorld + testRequestBodyDTO.getId() + " Message : "
                + testRequestBodyDTO.getMessage();
    }

    @GetMapping("/testResponseBody")
    public ResponseDTO<String> testControllerResponseBody() {
        List<String> list = new ArrayList<>();
        list.add("Hello World! i'm ResponseDTO");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        return response;

    }

    @GetMapping("/testResponseEntity")
    public ResponseEntity<?> testControllerResponseEntity() {
        List<String> list = new ArrayList<>();
        list.add("Hello World! I'm ResponseEntity. And you got 400!");
        ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
        // http status를 400으로 설정
        return ResponseEntity.badRequest().body(response);
    }

}
