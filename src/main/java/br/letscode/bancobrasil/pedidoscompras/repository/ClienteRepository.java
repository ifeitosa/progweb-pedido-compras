package br.letscode.bancobrasil.pedidoscompras.repository;

import br.letscode.bancobrasil.pedidoscompras.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
