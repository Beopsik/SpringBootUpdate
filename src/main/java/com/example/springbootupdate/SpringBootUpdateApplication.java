package com.example.springbootupdate;

import com.example.demofamilymanprep.FamliyMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootUpdateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUpdateApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(){
        return new ApplicationRunner() {
            @Autowired
            FamliyMan famliyMan;

            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println("====================");
                System.out.println(famliyMan.getName());
                System.out.println("====================");
            }
        };
    }
    @Bean
    public FamliyMan famliyMan(){
        FamliyMan famliyMan=new FamliyMan();
        famliyMan.setName("beobsik");
        return famliyMan;
    }

}
