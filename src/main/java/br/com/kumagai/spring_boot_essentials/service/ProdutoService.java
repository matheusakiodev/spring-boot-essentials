package br.com.kumagai.spring_boot_essentials.service;

import br.com.kumagai.spring_boot_essentials.database.model.ProdutoEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProdutoService {

    //vamos mockar um banco de dados
    private static final List<ProdutoEntity> PRODUTOS = List.of(
            ProdutoEntity.builder()
                    .id(1)
                    .nome("Notebook")
                    .preco(new BigDecimal(5000))
                    .quantidade(10)
                    .build(),
            ProdutoEntity.builder()
                    .id(2)
                    .nome("Iphone")
                    .preco(new BigDecimal(7000))
                    .quantidade(10)
                    .build(),
            ProdutoEntity.builder()
                    .id(3)
                    .nome("Mouse")
                    .preco(new BigDecimal(500))
                    .quantidade(10)
                    .build()
    );

    public List<ProdutoEntity> findAll() {
        return PRODUTOS;
    }

}
