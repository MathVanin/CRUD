package matheus.vanin.CRUDProdutos.Dto;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Builder
public class GenericResponseDto {
    String mensagem;
    HttpStatus httpStatus;
    Date timestamp;
    String path;
}
