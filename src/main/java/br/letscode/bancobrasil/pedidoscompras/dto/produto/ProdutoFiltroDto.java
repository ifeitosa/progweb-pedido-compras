package br.letscode.bancobrasil.pedidoscompras.dto.produto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoFiltroDto {

    private String filtro;
    private int pageSize;

}
