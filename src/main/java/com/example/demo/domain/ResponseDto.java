package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class ResponseDto{
    @Builder.Default
    private String status = "success";
    private Object data;
}





