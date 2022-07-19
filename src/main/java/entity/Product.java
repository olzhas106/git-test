package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean nalichie;

    private String name;

    private Integer price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
