package matheus.vanin.CRUDProdutos.Service;

import matheus.vanin.CRUDProdutos.Dto.ProdutoDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {
    List<ProdutoDto> listaTodosProdutos();

    void cadastraProdutos(List<ProdutoDto> novosProdutosDto);
}
