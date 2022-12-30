package matheus.vanin.CRUD.Dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UsuarioCadastroDto implements Serializable {
    String nome;
    String login;
    String senha;
    String email;
    Boolean ativo;
}
