package br.letscode.bancobrasil.pedidoscompras.service;

import br.letscode.bancobrasil.pedidoscompras.model.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProdutoService {

    Produto salvar(Produto produto);

    void excluir(Long idProduto);

    List<Produto> listar(String nome);

    Produto getId(Long id);

}
