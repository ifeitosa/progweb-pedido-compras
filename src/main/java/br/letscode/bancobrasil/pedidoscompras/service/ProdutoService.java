package br.letscode.bancobrasil.pedidoscompras.service;

import br.letscode.bancobrasil.pedidoscompras.model.Produto;

import java.util.List;

public interface ProdutoService {

    Produto salvar(Produto produto);

    void excluir(Long idProduto);

    List<Produto> listar();

    Produto getId(Long id);

}
