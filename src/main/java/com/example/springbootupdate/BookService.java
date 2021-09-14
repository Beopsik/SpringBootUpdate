package com.example.springbootupdate;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Async
    public void hello(){
        System.out.println("hello "+Thread.currentThread().getName());
    }
}
