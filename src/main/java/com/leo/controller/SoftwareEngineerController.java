package com.amigoscode.controller;

import com.amigoscode.model.SoftwareEngineer;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
            new SoftwareEngineer(1, "Leo Medeiros", "Java, Node, React, TailwindCSS"),
            new SoftwareEngineer(2, "Pedro Medeiros", "Golang, Node, Spring Boot, TailwindCSS")
        );
    }
}