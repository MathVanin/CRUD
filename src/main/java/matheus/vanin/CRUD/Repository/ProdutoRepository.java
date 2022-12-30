package matheus.vanin.CRUD.Repository;

import matheus.vanin.CRUD.Domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.webjars.NotFoundException;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT P FROM Produto P WHERE P.uuid = :uuid")
    public Optional<Produto> findByUuid(UUID uuid);

    default Produto findByUuidOrNotFoundEx(UUID uuid) {
        return findByUuid(uuid).orElseThrow(() -> new NotFoundException("Produto não localizado pelo UUID!"));
    }

}
