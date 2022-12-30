package matheus.vanin.CRUD.Service;

import matheus.vanin.CRUD.Dto.UsuarioCadastroDto;
import matheus.vanin.CRUD.Dto.UsuarioDto;

import java.util.List;
import java.util.UUID;

public interface UsuarioService {
    void cadastraUsuario(UsuarioCadastroDto usuarioCadastroDto);

    List<UsuarioDto> listaTodosUsuarios();

    void atualizaUsuario(UsuarioDto usuarioDto);

    void inativaUsuario(UUID uuid);
}
