package matheus.vanin.CRUD.Service.impl;

import matheus.vanin.CRUD.Domain.Usuario;
import matheus.vanin.CRUD.Dto.UsuarioCadastroDto;
import matheus.vanin.CRUD.Dto.UsuarioDto;
import matheus.vanin.CRUD.Mapper.UsuarioMapper;
import matheus.vanin.CRUD.Repository.UsuarioRepository;
import matheus.vanin.CRUD.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioMapper usuarioMapper;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void cadastraUsuario(UsuarioCadastroDto usuarioCadastroDto) {
        Usuario usuario = usuarioMapper.usuarioCadastroToEntity(usuarioCadastroDto);
        usuarioRepository.save(usuario);
    }

    @Override
    public List<UsuarioDto> listaTodosUsuarios() {
        List<UsuarioDto> listaProdutos = usuarioMapper.entityToUsuario(usuarioRepository.findAll());
        return listaProdutos;
    }

    @Override
    public void atualizaUsuario(UsuarioDto usuarioDto) {
        Usuario usuarioConsultado = usuarioRepository.findByUuidOrNotFoundEx(usuarioDto.getUuidUsuario());
        Usuario usuarioAtualizado = usuarioMapper.usuarioToEntity(usuarioDto);
        usuarioAtualizado.setId(usuarioConsultado.getId());
        usuarioRepository.save(usuarioAtualizado);
    }

    @Override
    public void inativaUsuario(UUID uuid) {
        Usuario usuarioConsultado = usuarioRepository.findByUuidOrNotFoundEx(uuid);
        usuarioConsultado.setAtivo(false);
        usuarioRepository.save(usuarioConsultado);
    }
}
