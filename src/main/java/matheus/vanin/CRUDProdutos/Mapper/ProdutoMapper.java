package matheus.vanin.CRUDProdutos.Mapper;

import matheus.vanin.CRUDProdutos.Domain.Produto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ProdutoMapper {
    public abstract ProdutoDto toDto(Produto entity);

    public abstract Produto toEntity(ProdutoDto dto);

    public abstract List<ProdutoDto> toDtoList(List<Produto> entity);

    public abstract List<Produto> toEntityList(List<ProdutoDto> dto);
}
