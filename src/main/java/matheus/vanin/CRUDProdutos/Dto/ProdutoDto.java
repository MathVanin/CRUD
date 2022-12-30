package matheus.vanin.CRUDProdutos.Dto;

import jakarta.annotation.Nonnull;
import lombok.Builder;

import java.util.UUID;

@Builder
public class ProdutoDto {
    @Nonnull
    Long id;
    @Nonnull
    UUID uuid;
    @Nonnull
    String codigoInterno;
    @Nonnull
    String nome;
    @Nonnull
    String descricao;
    String descritivo;
    Double largura;
    Double altura;
    Double comprimento;
    Double pesoBruto;
    Double pesoLiquido;
    Double valorCompra;
    Double valorVenda;
}
