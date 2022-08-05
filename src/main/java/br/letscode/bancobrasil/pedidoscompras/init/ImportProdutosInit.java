package br.letscode.bancobrasil.pedidoscompras.init;

import br.letscode.bancobrasil.pedidoscompras.init.produtos.ImportaProdutos;
import br.letscode.bancobrasil.pedidoscompras.service.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ImportProdutosInit implements InitializingBean {

    final ProdutoService produtoService;
    final List<ImportaProdutos> importaProdutosList;

    public ImportProdutosInit(ProdutoService produtoService,
                              List<ImportaProdutos> importaProdutosList) {
        this.produtoService = produtoService;
        this.importaProdutosList = importaProdutosList;
    }

    @Override
    public void afterPropertiesSet() {
        log.info("Import produtos - INICIO");

        if (produtoService.isEmpty()) {
            this.importarProdutos();
        }

        log.info("Import produtos - FIM");
    }

    private void importarProdutos() {
        for (ImportaProdutos importaProdutos : importaProdutosList) {
            try {
                importaProdutos.importar();
                log.info("Produtos importados com sucesso " + importaProdutos.getClass().getSimpleName());
                break;
            } catch (Exception e) {
                log.error("Erro ao importar produtos", e);
            }
        }
    }

}
