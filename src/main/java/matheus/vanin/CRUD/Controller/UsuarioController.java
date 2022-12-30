package matheus.vanin.CRUD.Controller;

import matheus.vanin.CRUD.Dto.GenericResponseDto;
import matheus.vanin.CRUD.Dto.UsuarioCadastroDto;
import matheus.vanin.CRUD.Dto.UsuarioDto;
import matheus.vanin.CRUD.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @PostMapping("/cadastrar")
    public ResponseEntity<GenericResponseDto> cadastraUsuario(@RequestBody UsuarioCadastroDto usuarioCadastroDto){
        usuarioService.cadastraUsuario(usuarioCadastroDto);
        return ResponseEntity.ok(GenericResponseDto.builder()
                .httpStatus(HttpStatus.OK)
                .mensagem("Usuario cadastrado com sucesso!")
                .path("/usuarios/cadastrar")
                .timestamp(new Date()).build());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<UsuarioDto>> listarTodosProdutos() {
        List<UsuarioDto> listaProdutos = usuarioService.listaTodosUsuarios();
        return ResponseEntity.status(HttpStatus.OK).body(listaProdutos);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<GenericResponseDto> atualizarProduto(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.atualizaUsuario(usuarioDto);
        return ResponseEntity.ok(GenericResponseDto.builder()
                .httpStatus(HttpStatus.OK)
                .mensagem("Usuario atualizado com sucesso!")
                .path("/usuarios/atualizar")
                .timestamp(new Date()).build());
    }

    @PutMapping("/inativar")
    public ResponseEntity<GenericResponseDto> inativaProduto(@RequestParam UUID uuidUsuario) {
        usuarioService.inativaUsuario(uuidUsuario);
        return ResponseEntity.ok(GenericResponseDto.builder()
                .httpStatus(HttpStatus.OK)
                .mensagem("Usuario inativado com sucesso!")
                .path("/usuarios/inativar")
                .timestamp(new Date()).build());
    }
}
