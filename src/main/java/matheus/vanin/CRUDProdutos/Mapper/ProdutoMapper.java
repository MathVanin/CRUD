package matheus.vanin.CRUDProdutos.Mapper;

import matheus.vanin.CRUDProdutos.Domain.Produto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoCadastroDto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoDto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoFrontDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ProdutoMapper {
    public abstract ProdutoDto toDto(Produto entity);

    public abstract Produto produtoToEntity(ProdutoDto dto);

    public abstract List<ProdutoDto> produtoListToDtoList(List<Produto> entity);

    public abstract List<Produto> produtoToEntityList(List<ProdutoDto> dto);

    public abstract ProdutoFrontDto produtoToRetornoDto(Produto entity);

    public abstract List<ProdutoFrontDto> produtoListToProdutotoRetornoDtoList(List<Produto> entity);

    public abstract Produto frontDtoToEntity(ProdutoFrontDto entity);

    public abstract List<Produto> listFrontDtoToEntityList(List<ProdutoFrontDto> entity);
    public abstract Produto produtoCadastroToEntity(ProdutoCadastroDto produtoCadastroDto);
}
