package pe.com.ciberelectrik.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.ciberelectrik.entity.Categoría;
import pe.com.ciberelectrik.service.CategoríaService;

@RestController //controlador
@RequestMapping("/Categoría")//nombre que le asignamos
        
public class CategoríaController {
    
    @Autowired
    private CategoríaService CategoríaService;
    
    //Listar todo
    @GetMapping("/all")//Obtener los valores
    public List<Categoría> findAll(){
        return this.CategoríaService.findAll();
    }
    
    //Listar Personalizado
    @GetMapping()//Obtener los valores
    public List<Categoría> findAllCustom(){
        return this.CategoríaService.findAllCustom();
    }
    
    //registrar
    @PostMapping
    public Categoría add(@RequestBody Categoría c){
    return CategoríaService.add(c);
    }
    
    //buscar x codigo
    @GetMapping("/{id}")
    public Optional<Categoría> findById(@PathVariable Long id){
    return CategoríaService.findById(id);
    }
    
    //actualizar
    @PutMapping("/{id}")
    public Categoría update(@PathVariable Long id, @RequestBody Categoría c) {
    c.setCodigo(id);
    return CategoríaService.update(c);
    }
    
    //eliminar
    @DeleteMapping("/{id}")
    public Categoría delete(@PathVariable Long id){
    Categoría objcategoria=new Categoría();
    objcategoria.setCodigo(id);
    return CategoríaService.delete(Categoría.builder().codigo(id).build());
    }
}
