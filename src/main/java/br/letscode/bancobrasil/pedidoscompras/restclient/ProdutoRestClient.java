package br.letscode.bancobrasil.pedidoscompras.restclient;


import br.letscode.bancobrasil.pedidoscompras.dto.produto.ProdutoImportListDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "produtoRestClient",
        url = "https://dummyjson.com")
public interface ProdutoRestClient {

    @GetMapping(value = "/products/search")
    ProdutoImportListDto findAll(@RequestParam("q") String categoria);

}
