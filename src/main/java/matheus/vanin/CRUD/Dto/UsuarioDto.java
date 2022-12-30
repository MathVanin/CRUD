package matheus.vanin.CRUD.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
public class UsuarioDto implements Serializable {
    @JsonIgnore
    Long id;
    UUID uuidUsuario;
    String nome;
    String login;
    String senha;
    String email;
    Boolean ativo;
}
