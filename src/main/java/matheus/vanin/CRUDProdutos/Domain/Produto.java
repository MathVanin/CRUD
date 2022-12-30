package matheus.vanin.CRUDProdutos.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "Produtos")
public class Produto {
    @Id
    @Column(name = "IDPRODUTO")
    Long id;
    @Column(name = "UUIDPRODUTO")
    UUID uuid;
    @Column(name = "CODINTERNO")
    String codigoInterno;
    @Column(name = "NOME")
    String nome;
    @Column(name = "DESCRICAO")
    String descricao;
    @Column(name = "DESCRITIVO")
    String descritivo;
    @Column(name = "LARGURA")
    Double largura;
    @Column(name = "ALTURA")
    Double altura;
    @Column(name = "COMPRIMENTO")
    Double comprimento;
    @Column(name = "PESOBRUTO")
    Double pesoBruto;
    @Column(name = "PESOLIQUIDO")
    Double pesoLiquido;
    @Column(name = "VALORCOMPRA")
    Double valorCompra;
    @Column(name = "VALORVENDA")
    Double valorVenda;
}
