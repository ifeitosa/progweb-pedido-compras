package br.letscode.bancobrasil.pedidoscompras.repository;

import br.letscode.bancobrasil.pedidoscompras.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
