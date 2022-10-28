package repositories;
import entidade.UsuarioComumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioComumRespository extends JpaRepository<UsuarioComumEntity,Long> {

}
