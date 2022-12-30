package matheus.vanin.CRUDProdutos.Service;

import matheus.vanin.CRUDProdutos.Dto.ProdutoDto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoFrontDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {
    List<ProdutoFrontDto> listaTodosProdutos();

    void cadastraProdutos(List<ProdutoDto> novosProdutosDto);

    void atualizaProduto(ProdutoFrontDto produtoFrontDto);
}
