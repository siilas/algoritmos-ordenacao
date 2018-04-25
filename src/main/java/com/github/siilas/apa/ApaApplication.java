package com.github.siilas.apa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.siilas.apa.controlador.CommandLineControlador;

@SpringBootApplication
public class ApaApplication implements CommandLineRunner {

    @Autowired
    private CommandLineControlador commandLineControlador;
    
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApaApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) {
        commandLineControlador.executar();
    }

}
