package com.saumyat.microservice.hotelService.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("given Hotel Id is not present at database");
    }
}
