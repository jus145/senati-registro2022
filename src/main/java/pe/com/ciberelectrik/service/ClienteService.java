package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import pe.com.ciberelectrik.entity.Cliente;

public interface ClienteService {
    List<Cliente> findAll();
    
    List<Cliente> findAllCustom();
    
    List<Cliente> findByName(String nombre);
    
    Optional<Cliente> findById(Long id);
    
    Cliente add(Cliente cl);
            
    Cliente update(Cliente cl);
    
    Cliente delete(Cliente cl);
    
}
