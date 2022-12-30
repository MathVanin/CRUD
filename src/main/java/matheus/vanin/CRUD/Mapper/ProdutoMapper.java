package matheus.vanin.CRUD.Mapper;

import matheus.vanin.CRUD.Domain.Produto;
import matheus.vanin.CRUD.Dto.ProdutoCadastroDto;
import matheus.vanin.CRUD.Dto.ProdutoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ProdutoMapper {
    public abstract ProdutoDto toDto(Produto entity);

    @Mapping(target = "ativo", expression = "java(true)")
    public abstract Produto produtoDtoToEntity(ProdutoDto dto);

    public abstract List<ProdutoDto> produtoListToDtoList(List<Produto> entity);

    public abstract List<Produto> produtoToEntityList(List<ProdutoDto> dto);

    public abstract Produto produtoCadastroToEntity(ProdutoCadastroDto produtoCadastroDto);
}
