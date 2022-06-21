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
import pe.com.ciberelectrik.entity.Distrito;
import pe.com.ciberelectrik.service.DistritoService;


@RestController //controlador
@RequestMapping("/Distrito")//nombre que le asignamos

public class DistritoController {
    
    @Autowired
        private DistritoService distritoService;
    
    //Listar todo
    @GetMapping("/all")//Obtener los valores
        public List<Distrito> findAll(){
        return this.distritoService.findAll();
    }
    
    //Listar Personalizado
    @GetMapping()//Obtener los valores
        public List<Distrito> findAllCustom(){
        return this.distritoService.findAllCustom();
    }
    
    //registrar
    @PostMapping
        public Distrito add(@RequestBody Distrito d){
        return distritoService.add(d);
    }
    
    //buscar x codigo
    @GetMapping("/{id}")
        public Optional<Distrito> findById(@PathVariable Long id){
        return distritoService.findById(id);
    }
    
    //actualizar
    @PutMapping("/{id}")
        public Distrito update(@PathVariable Long id, @RequestBody Distrito d) {
        d.setCodigo(id);
        return distritoService.update(d);
    }
    
    //eliminar
    @DeleteMapping("/{id}")
        public Distrito delete(@PathVariable Long id){
        return distritoService.delete(Distrito.builder().codigo(id).build());
    }
}
    

