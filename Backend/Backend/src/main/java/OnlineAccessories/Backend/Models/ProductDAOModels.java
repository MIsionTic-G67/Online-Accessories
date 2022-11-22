package OnlineAccessories.Backend.Models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "products")

public class ProductDAOModels { 
    

    public ProductDAOModels() {
    }


    @Id
    private String _id;
    private String name;
    private String email;
    private Double price;
    private LocalDate expiry_date;




    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public LocalDate getExpiry_date() {
        return expiry_date;
    }
    public void setExpiry_date(LocalDate expiry_date) {
        this.expiry_date = expiry_date;
    }

    
}
