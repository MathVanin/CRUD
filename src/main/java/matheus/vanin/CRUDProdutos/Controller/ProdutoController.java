package matheus.vanin.CRUDProdutos.Controller;

import matheus.vanin.CRUDProdutos.Domain.Produto;
import matheus.vanin.CRUDProdutos.Dto.GenericResponseDto;
import matheus.vanin.CRUDProdutos.Dto.ProdutoDto;
import matheus.vanin.CRUDProdutos.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/lista")
    public ResponseEntity<List<ProdutoDto>> listarTodosProdutos(){
        List<ProdutoDto> listaProdutos =  produtoService.listaTodosProdutos();
        return ResponseEntity.status(HttpStatus.OK).body(listaProdutos);
    }

    @PostMapping("/incluir")
    public ResponseEntity<GenericResponseDto> incluirProdutos(@RequestBody List<ProdutoDto> novosProdutosDto){
        produtoService.cadastraProdutos(novosProdutosDto);
        return ResponseEntity.ok(GenericResponseDto.builder()
                .httpStatus(HttpStatus.OK)
                .mensagem("Produtos incluidos com sucesso!")
                .path("/produtos/incluir")
                .timestamp(new Date()).build());
    }
}
