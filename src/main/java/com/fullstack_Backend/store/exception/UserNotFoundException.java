package com.fullstack_Backend.store.exception;

public class UserNotFoundException extends  RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find ");
    }
}
