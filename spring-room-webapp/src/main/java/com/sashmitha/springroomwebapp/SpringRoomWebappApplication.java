package com.sashmitha.springroomwebapp;

import com.sashmitha.springroomwebapp.data.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRoomWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRoomWebappApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(RoomRepository roomRepository) {
        return args -> {
            roomRepository.findAll().forEach(System.out::println);
        };
    }

}
