package matheus.vanin.CRUD.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @Column(name = "IDUSUARIO")
    Long id;
    @Column(name = "UUIDUSUARIO")
    UUID uuidUsuario;
    @Column(name = "NOME")
    String nome;
    @Column(name = "LOGIN")
    String login;
    @Column(name = "SENHA")
    String senha;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "ATIVO")
    Boolean ativo;
}
