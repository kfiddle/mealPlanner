package com.example.demo;


import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    UserRepository userRepo;


    @Override
    public void run(String... args) throws Exception {


        userRepo.saveAll(Arrays.asList(new User("Mrrrrrria"), new User("ZanyGold"), new User("YerMom")));


    }
}
