package pe.com.ciberelectrik.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Producto;
import pe.com.ciberelectrik.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

 @Autowired
private ProductoRepository productoRepository;

 @Override
public List<Producto> findAll() {
return productoRepository.findAll();
}

 @Override
public List<Producto> findAllCustom() {
return productoRepository.findAllCustom();
}

 @Override
public Optional<Producto> findById(Long id) {
return productoRepository.findById(id);
}

 @Override
public List<Producto> findByName(String nombre) {
return productoRepository.findByName(nombre);
}

 @Override
public Producto add(Producto p) {
return productoRepository.save(p);
}

 @Override
public Producto update(Producto p) {
Producto objproducto = new Producto();
BeanUtils.copyProperties(p, objproducto);
return productoRepository.save(objproducto);
}

 @Override
public Producto delete(Producto p) {
Producto objproducto = productoRepository.getById(p.getCodigo());
objproducto.setEstado(false);
return productoRepository.save(objproducto);
}

}