package com.example.magicalgirls.controller;

import com.example.magicalgirls.model.MagicalGirl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MagicalGirlController {

    private final List<MagicalGirl> girls = List.of(
            new MagicalGirl(1L, "Akari", "Control de la luz"),
            new MagicalGirl(2L, "Mina", "Manipulación del tiempo"),
            new MagicalGirl(3L, "Sora", "Viento y tormentas")
    );

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("girls", girls);
        return "index";
    }

    @GetMapping("/girl/{id}")
    public String detail(@PathVariable Long id, Model model) {
        MagicalGirl girl = girls.stream()
                .filter(g -> g.getId().equals(id))
                .findFirst()
                .orElse(null);

        model.addAttribute("girl", girl);
        return "detail";
    }
}
