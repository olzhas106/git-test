package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer percent;

    private Timestamp start_date;

    private Timestamp end_date;

    @OneToMany(mappedBy = "discount_categories")
    private List<DiscountCategories> discountCategories;

    @OneToMany(mappedBy = "discount_id")
    private List<Discount> discounts;

}
