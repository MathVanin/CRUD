package matheus.vanin.CRUD.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class ProdutoDto implements Serializable {
    @JsonIgnore
    Long id;
    UUID uuid;
    String codigoInterno;
    String nome;
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
    Boolean ativo;
    Date dataAtualizacao;
}
