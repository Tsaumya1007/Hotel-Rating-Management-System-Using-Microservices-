package com.saumyat.microservice.userService.exception;

public class RsourceNotFoundException extends RuntimeException{

    public RsourceNotFoundException(){
        super("Resouce not found on server !!");
    }
    public RsourceNotFoundException(String message){
        super(message);
    }
}
