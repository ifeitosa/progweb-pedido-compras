package br.letscode.bancobrasil.pedidoscompras.controller;

import br.letscode.bancobrasil.pedidoscompras.model.Produto;
import br.letscode.bancobrasil.pedidoscompras.service.ProdutoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody @Valid Produto produto) {
        return ResponseEntity.ok(produtoService.salvar(produto));
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long idProduto) {
        produtoService.excluir(idProduto);
    }

    @GetMapping
    public ResponseEntity<Page<Produto>> listar(String filtro, Pageable pageable) {
        return ResponseEntity.ok(produtoService.listar(filtro, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.getId(id));
    }

}
