package com.example.yuaicoder.controller;


import com.example.yuaicoder.common.BaseResponse;
import com.example.yuaicoder.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @RequestMapping("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("ok");
    }
}
