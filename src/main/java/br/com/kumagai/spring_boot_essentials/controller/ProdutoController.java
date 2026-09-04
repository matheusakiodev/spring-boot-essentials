package br.com.kumagai.spring_boot_essentials.controller;

import br.com.kumagai.spring_boot_essentials.database.model.ProdutoEntity;
import br.com.kumagai.spring_boot_essentials.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Não utilizar o @Autowired pois nao garante a imutabilidade e deixa os testes unitários mais complicados, injetaremos a classe com lombok

@RestController
@RequestMapping("/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll() {
        return produtoService.findAll();
    }


}
