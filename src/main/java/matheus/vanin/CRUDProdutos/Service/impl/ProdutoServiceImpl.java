package matheus.vanin.CRUDProdutos.Service.impl;

import matheus.vanin.CRUDProdutos.Domain.Produto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoDto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoFrontDto;
import matheus.vanin.CRUDProdutos.Mapper.ProdutoMapper;
import matheus.vanin.CRUDProdutos.Repository.ProdutoRepository;
import matheus.vanin.CRUDProdutos.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ProdutoMapper produtoMapper;

    @Override
    public List<ProdutoFrontDto> listaTodosProdutos() {
        List<ProdutoFrontDto> listaProdutos =
                produtoMapper.produtoListToProdutotoRetornoDtoList(produtoRepository.findAll());
        return listaProdutos;
    }

    @Override
    public void cadastraProdutos(List<ProdutoDto> novosProdutosDto) {
        List<Produto> novosProdutos = produtoMapper.produtoToEntityList(novosProdutosDto);
        produtoRepository.saveAll(novosProdutos);
    }

    @Override
    public void atualizaProduto(ProdutoFrontDto produtoFrontDto) {
        Produto produtoConsultado = produtoRepository.findByUuidOrNotFoundEx(produtoFrontDto.getUuid());
        Produto produtoAtualizado = produtoMapper.frontDtoToEntity(produtoFrontDto);
        produtoAtualizado.setId(produtoAtualizado.getId());
        produtoRepository.save(produtoAtualizado);
    }
}
