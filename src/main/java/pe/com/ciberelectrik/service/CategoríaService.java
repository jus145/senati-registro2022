package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Categoría;

public interface CategoríaService {
    List<Categoría> findAll();
    
    List<Categoría> findAllCustom();
    
    List<Categoría> findByName(String nombre);
    
    Optional<Categoría> findById(Long id);
    
    Categoría add(Categoría c);
            
    Categoría update(Categoría c);
    
    Categoría delete(Categoría c);
    
}
