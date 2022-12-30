package matheus.vanin.CRUDProdutos.Dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
@Builder
public class GenericResponseDto {
    String mensagem;
    HttpStatus httpStatus;
    Date timestamp;
    String path;
}
