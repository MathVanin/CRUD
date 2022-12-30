package matheus.vanin.CRUD.Controller;

import matheus.vanin.CRUD.Dto.GenericResponseDto;
import matheus.vanin.CRUD.Dto.ProdutoDto;
import matheus.vanin.CRUD.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/listar")
    public ResponseEntity<List<ProdutoDto>> listarTodosProdutos() {
        List<ProdutoDto> listaProdutos = produtoService.listaTodosProdutos();
        return ResponseEntity.status(HttpStatus.OK).body(listaProdutos);
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<GenericResponseDto> incluirProdutos(@RequestBody List<ProdutoDto> novosProdutosDto) {
        produtoService.cadastraProdutos(novosProdutosDto);
        return ResponseEntity.ok(GenericResponseDto.builder()
                .httpStatus(HttpStatus.OK)
                .mensagem("Produtos incluidos com sucesso!")
                .path("/produto/incluir")
                .timestamp(new Date()).build());
    }

    @PutMapping("/atualizar")
    public ResponseEntity<GenericResponseDto> atualizarProduto(@RequestBody ProdutoDto produtoDto) {
        produtoService.atualizaProduto(produtoDto);
        return ResponseEntity.ok(GenericResponseDto.builder()
                .httpStatus(HttpStatus.OK)
                .mensagem("Produto atualizado com sucesso!")
                .path("/produto/atualizar")
                .timestamp(new Date()).build());
    }

    @PutMapping("/inativar")
    public ResponseEntity<GenericResponseDto> inativaProduto(@RequestParam UUID uuidProduto) {
        produtoService.inativaProduto(uuidProduto);
        return ResponseEntity.ok(GenericResponseDto.builder()
                .httpStatus(HttpStatus.OK)
                .mensagem("Produto inativado com sucesso!")
                .path("/produto/inativar")
                .timestamp(new Date()).build());
    }
}
