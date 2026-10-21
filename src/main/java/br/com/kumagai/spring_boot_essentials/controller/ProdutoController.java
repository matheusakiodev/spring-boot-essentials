package br.com.kumagai.spring_boot_essentials.controller;

import br.com.kumagai.spring_boot_essentials.dto.ProdutoDto;
import br.com.kumagai.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.kumagai.spring_boot_essentials.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Não utilizar o @Autowired pois nao garante a imutabilidade e deixa os testes unitários mais complicados, injetaremos a classe com lombok

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor // usando o lombok para não ter que usar o autowired e instanciar um a um, os atributos private final já sao colocados dentro do construtor
public class ProdutoController {

    private final ProdutoService produtoService; // fazemos a injeçao por via do construtor usando o lombok

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {
        return produtoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduct(@RequestBody ProdutoDto produtoDto) {
        return produtoService.createProduct(produtoDto);
    }

}
