package matheus.vanin.CRUD.Repository;

import matheus.vanin.CRUD.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.webjars.NotFoundException;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT U FROM Usuario U WHERE U.uuidUsuario = :uuid")
    public Optional<Usuario> findByUuid(UUID uuid);

    default Usuario findByUuidOrNotFoundEx(UUID uuid){
        return findByUuid(uuid).orElseThrow(() ->
                new NotFoundException("Nenhum usuario encontrado para o UUID solicitado!"));
    }

}
