package matheus.vanin.CRUDProdutos.Dto;

import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;
@Data
@Builder
public class ProdutoCadastroDto {
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
    Date dataCadastro;
}
