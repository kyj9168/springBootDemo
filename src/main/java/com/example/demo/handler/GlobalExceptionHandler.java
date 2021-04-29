package com.example.demo.handler;

import com.example.demo.domain.ResponseDto;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import static org.springframework.http.HttpStatus.OK;
@RestController
@ControllerAdvice(value = "com.example.demo.controller")
public class GlobalExceptionHandler {
    @ResponseBody
    @ResponseStatus(OK)
    @ExceptionHandler({Exception.class})
    public ResponseDto handlerException(Exception e) {
        return ResponseDto.builder()
                .status("fail")
                .data(e.getMessage())
                .build();
    }
}