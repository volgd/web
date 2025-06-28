package org.example.springboot.exception;

import org.example.springboot.commom.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice("com.example.springboot.controller")
public class GlobalExeceptionHandler {
        @ExceptionHandler(Exception.class)
        @ResponseBody                                         //返回json串
        public Result error(Exception e){
            return Result.error();
        }

}
