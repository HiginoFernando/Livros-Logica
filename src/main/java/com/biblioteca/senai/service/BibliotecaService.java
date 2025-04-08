package com.biblioteca.senai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.biblioteca.senai.model.LivroModel;

@Service
public class BibliotecaService {
    private LivroModel livroCache;
    private List<LivroModel> livros = new ArrayList<>();

    public BibliotecaService() {
       
    }

    public LivroModel getLivroInfo(int livroId) {
        if (livroCache == null || livroCache.getId() != livroId) {
            for (LivroModel livro : livros) {
                if (livro.getId() == livroId) {
                    livroCache = livro;
                   
                }
            }
        }
        return livroCache;
    }

    public void updateLivroInfo(LivroModel novoLivro) {
        boolean atualizado = false;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == novoLivro.getId()) {
                livros.set(i, novoLivro);
                atualizado = true;
            
            }
        }
        if (!atualizado) {
            livros.add(novoLivro);
        }
        livroCache = novoLivro;
    }
}
