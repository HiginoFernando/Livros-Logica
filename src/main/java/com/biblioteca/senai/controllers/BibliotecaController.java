package com.biblioteca.senai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.senai.model.LivroModel;
import com.biblioteca.senai.service.BibliotecaService;

@RestController
@RequestMapping("/api/fiama")
public class BibliotecaController {

    private final BibliotecaService biblioteca;

    @Autowired
    public BibliotecaController(BibliotecaService biblioteca) {
        this.biblioteca = biblioteca;
    }

    @GetMapping("/{id}")
    public LivroModel getLivroInfo(@PathVariable int id) {
        return biblioteca.getLivroInfo(id);
    }

    @PutMapping("/{id}")
    public void updateLivroInfo(@PathVariable int id, @RequestBody LivroModel novoLivro) {
        if (id != novoLivro.getId()) {
            return;
        }
        biblioteca.updateLivroInfo(novoLivro);
    }
}
