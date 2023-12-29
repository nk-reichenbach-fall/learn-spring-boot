package com.mycompany.learnjavaspringboot.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mycompany.learnjavaspringboot.socialMediaRestApis.UserNotFoundException;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorDetail> handleAllException(Exception ex, WebRequest request) throws Exception {
        ErrorDetail errorDetails = new ErrorDetail(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));

        if (ex instanceof UserNotFoundException unfexc) {
            return new ResponseEntity<ErrorDetail>(errorDetails, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<ErrorDetail>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
