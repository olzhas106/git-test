package entity;

import javax.persistence.*;

@Entity
@Table(name = "discount_categories")
public class DiscountCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
