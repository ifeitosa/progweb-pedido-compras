package br.letscode.bancobrasil.pedidoscompras.service;

import br.letscode.bancobrasil.pedidoscompras.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProdutoService {

    Produto salvar(Produto produto);

    void excluir(Long idProduto);

    Page<Produto> listar(String filtro, Pageable pageable);

    Produto getId(Long id);

    boolean isEmpty();

    void salvarLista(List<Produto> produtos);

}
