package OnlineAccessories.Backend.Controlador;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import OnlineAccessories.Backend.Models.ProductDAOModels;
import OnlineAccessories.Backend.Servicio.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ProductDAOModels insertarproductos(@Validated @RequestBody ProductDAOModels producto){
        return this.productService.insertarproducto(producto);

    }

    @GetMapping
    public ArrayList<ProductDAOModels> listarproductos(){
        return this.productService.listarproductos();        
    }


    //Buscar
    @GetMapping(path = "{id}")
    public Optional<ProductDAOModels> buscarporId(@Validated @PathVariable("id") String id){
        return this.productService.buscarporId(id);


    }

    
}
