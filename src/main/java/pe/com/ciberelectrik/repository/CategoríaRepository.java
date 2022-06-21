package pe.com.ciberelectrik.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.ciberelectrik.entity.Categoría;

public interface CategoríaRepository extends JpaRepository<Categoría, Long>{
@Query("select c from Categoria c where c.estado='1'")
List<Categoría> findAllCustom();


@Query("select c from Categoria c where upper(c.nombre) like upper(:nombre) and c.estado='1'")
List<Categoría> findByName(@Param("nombre") String nombre);

   
}
