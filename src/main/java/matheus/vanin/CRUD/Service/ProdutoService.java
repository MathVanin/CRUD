package matheus.vanin.CRUD.Service;

import matheus.vanin.CRUD.Dto.ProdutoDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ProdutoService {
    List<ProdutoDto> listaTodosProdutos();

    void cadastraProdutos(List<ProdutoDto> novosProdutosDto);

    void atualizaProduto(ProdutoDto produtoDto);

    void inativaProduto(UUID uuidProduto);
}
