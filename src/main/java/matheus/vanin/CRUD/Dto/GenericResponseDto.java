package matheus.vanin.CRUD.Dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class GenericResponseDto implements Serializable {
    String mensagem;
    HttpStatus httpStatus;
    Date timestamp;
    String path;
}
