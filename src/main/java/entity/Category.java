package entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "category")
    private List<Product> products;

    @OneToMany(mappedBy = "discount_categories")
    private List<DiscountCategories> discountCategories;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<DiscountCategories> getDiscountCategories() {
        return discountCategories;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setDiscountCategories(List<DiscountCategories> discountCategories) {
        this.discountCategories = discountCategories;
    }
}
