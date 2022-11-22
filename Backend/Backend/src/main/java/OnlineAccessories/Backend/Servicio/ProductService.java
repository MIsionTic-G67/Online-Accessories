package OnlineAccessories.Backend.Servicio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import OnlineAccessories.Backend.Models.ProductDAOModels;
import OnlineAccessories.Backend.Repositories.ProductRepositories;

@Service
public class ProductService {
    
    @Autowired
    ProductRepositories productRepositories;

    //Metodo Insertar Producto
    public ProductDAOModels insertarproducto(ProductDAOModels producto){
        return this.productRepositories.insert(producto);
    }

    //Buscar las personas que estan en la base de datos
    public ArrayList<ProductDAOModels> listarproductos () {
        return (ArrayList<ProductDAOModels>) this.productRepositories.findAll();
    }


    public Optional <ProductDAOModels> buscarporId(String id){
        return this.productRepositories.findById(id);

    }








}
