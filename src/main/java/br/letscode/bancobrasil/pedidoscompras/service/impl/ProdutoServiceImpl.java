package br.letscode.bancobrasil.pedidoscompras.service.impl;

import br.letscode.bancobrasil.pedidoscompras.exceptions.ValidacaoException;
import br.letscode.bancobrasil.pedidoscompras.model.Produto;
import br.letscode.bancobrasil.pedidoscompras.repository.ProdutoRepository;
import br.letscode.bancobrasil.pedidoscompras.service.ProdutoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    @Transactional
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    @Transactional
    public void excluir(Long idProduto) {
        produtoRepository.deleteById(idProduto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Produto getId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new ValidacaoException("ID nao encontrado"));
    }

}
