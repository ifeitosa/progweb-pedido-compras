package br.letscode.bancobrasil.pedidoscompras.init.produtos;

import br.letscode.bancobrasil.pedidoscompras.dto.produto.ProdutoImportListDto;
import br.letscode.bancobrasil.pedidoscompras.model.Produto;
import br.letscode.bancobrasil.pedidoscompras.restclient.ProdutoRestClient;
import br.letscode.bancobrasil.pedidoscompras.service.ProdutoService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Order(10)
public class ImportaProdutosWS implements ImportaProdutos {

    final ProdutoRestClient produtoRestClient;
    final ProdutoService produtoService;

    public ImportaProdutosWS(ProdutoRestClient produtoRestClient, ProdutoService produtoService) {
        this.produtoRestClient = produtoRestClient;
        this.produtoService = produtoService;
    }

    @Override
    public void importar() throws Exception {

        ProdutoImportListDto produtoImportListDto =
                produtoRestClient.findAll("phone");

        List<Produto> produtoList =
                produtoImportListDto
                        .getProducts()
                        .stream().map(prod -> {
                                    return new Produto(
                                            prod.getId(),
                                            prod.getTitle(),
                                            prod.getDescription(),
                                            prod.getPrice(),
                                            prod.getDiscountPercentage(),
                                            prod.getStock(),
                                            prod.getThumbnail()
                                    );
                                }
                        )
                        .collect(Collectors.toList());

        produtoService.salvarLista(produtoList);

    }

}
