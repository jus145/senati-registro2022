package pe.com.ciberelectrik.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.Categoría;
import pe.com.ciberelectrik.repository.CategoríaRepository;

@Service //indica que es un servicio
public class CategoríaServiceImpl implements CategoríaService {

 @Autowired
private CategoríaRepository categoriaRepository;

 @Override
public List<Categoría> findAll() {
return categoriaRepository.findAll();
}

 @Override
public List<Categoría> findAllCustom() {
return categoriaRepository.findAllCustom();
}

 @Override
public Optional<Categoría> findById(Long id){
return categoriaRepository.findById(id);
}

 @Override
public List<Categoría> findByName(String nombre) {
return categoriaRepository.findByName(nombre);
}

 @Override
public Categoría add(Categoría c) {
return categoriaRepository.save(c);
}

 @Override
public Categoría update(Categoría c) {
Categoría objcategoria = new Categoría();
BeanUtils.copyProperties(c, objcategoria);
return categoriaRepository.save(objcategoria);
}

 @Override
public Categoría delete(Categoría c) {
Categoría objcategoria = categoriaRepository.getById(c.getCodigo());
objcategoria.setEstado(false);
return categoriaRepository.save(objcategoria);
}

}

