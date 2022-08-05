package br.letscode.bancobrasil.pedidoscompras.init.produtos;

import br.letscode.bancobrasil.pedidoscompras.model.Produto;
import br.letscode.bancobrasil.pedidoscompras.service.ProdutoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Order(20)
public class ImportaProdutosArquivo implements ImportaProdutos {

    final String fileProdutos;
    final ProdutoService produtoService;

    public ImportaProdutosArquivo(@Value("${importar.produtos.file}") String fileProdutos,
                                  ProdutoService produtoService) {
        this.fileProdutos = fileProdutos;
        this.produtoService = produtoService;
    }

    @Override
    public void importar() throws Exception {

        final List<Produto> produtoList = Files.lines(Path.of(fileProdutos))
                .skip(1)
                .map(linha -> {
                    final String[] linhaArray = linha.split(",");
                    return new Produto(
                            Long.valueOf(linhaArray[0]),
                            linhaArray[5],
                            linhaArray[2],
                            new BigDecimal(linhaArray[6]),
                            new BigDecimal(linhaArray[1]),
                            Integer.valueOf(linhaArray[3]),
                            linhaArray[4]
                    );
                })
                .collect(Collectors.toList());

        produtoService.salvarLista(produtoList);

    }

}
