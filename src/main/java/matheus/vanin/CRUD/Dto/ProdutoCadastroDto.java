package matheus.vanin.CRUD.Dto;

import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class ProdutoCadastroDto implements Serializable {
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
