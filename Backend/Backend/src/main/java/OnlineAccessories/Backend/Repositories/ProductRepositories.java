package OnlineAccessories.Backend.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import OnlineAccessories.Backend.Models.ProductDAOModels;

public interface ProductRepositories extends MongoRepository <ProductDAOModels, String> {
    
}

