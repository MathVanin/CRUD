package matheus.vanin.CRUD.Service.impl;

import matheus.vanin.CRUD.Domain.Produto;
import matheus.vanin.CRUD.Dto.ProdutoDto;
import matheus.vanin.CRUD.Mapper.ProdutoMapper;
import matheus.vanin.CRUD.Repository.ProdutoRepository;
import matheus.vanin.CRUD.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ProdutoMapper produtoMapper;

    @Override
    public List<ProdutoDto> listaTodosProdutos() {
        List<ProdutoDto> listaProdutos =
                produtoMapper.produtoListToDtoList(produtoRepository.findAll());
        return listaProdutos;
    }

    @Override
    public void cadastraProdutos(List<ProdutoDto> novosProdutosDto) {
        List<Produto> novosProdutos = produtoMapper.produtoToEntityList(novosProdutosDto);
        produtoRepository.saveAll(novosProdutos);
    }

    @Override
    public void atualizaProduto(ProdutoDto produtoDto) {
        Produto produtoConsultado = produtoRepository.findByUuidOrNotFoundEx(produtoDto.getUuid());
        Produto produtoAtualizado = produtoMapper.produtoDtoToEntity(produtoDto);
        produtoAtualizado.setId(produtoAtualizado.getId());
        produtoRepository.save(produtoAtualizado);
    }

    @Override
    public void inativaProduto(UUID uuidProduto) {
        Produto produtoConsultado = produtoRepository.findByUuidOrNotFoundEx(uuidProduto);
        produtoConsultado.setAtivo(false);
        produtoConsultado.setDataAtualizacao(new Date());
        produtoRepository.save(produtoConsultado);
    }
}
