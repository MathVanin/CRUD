package matheus.vanin.CRUD.Mapper;

import matheus.vanin.CRUD.Domain.Usuario;
import matheus.vanin.CRUD.Dto.UsuarioCadastroDto;
import matheus.vanin.CRUD.Dto.UsuarioDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class UsuarioMapper {
    public abstract Usuario usuarioCadastroToEntity(UsuarioCadastroDto dto);

    public abstract UsuarioCadastroDto entityToUsuarioCadastro(Usuario entity);

    public abstract List<Usuario> usuarioCadastroToEntity(List<UsuarioCadastroDto> dto);

    public abstract List<UsuarioCadastroDto> entityToUsuarioCadastro(List<Usuario> entity);

    public abstract Usuario usuarioToEntity(UsuarioDto dto);

    public abstract UsuarioDto entityToUsuario(Usuario entity);

    public abstract List<Usuario> usuarioToEntity(List<UsuarioDto> dto);

    public abstract List<UsuarioDto> entityToUsuario(List<Usuario> entity);
}
