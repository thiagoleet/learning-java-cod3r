package me.thiagoleite.exerciciossb.controllers;

import jakarta.validation.Valid;
import me.thiagoleite.exerciciossb.model.entities.Produto;
import me.thiagoleite.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}
