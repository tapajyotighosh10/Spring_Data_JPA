package com.spring.SpringDataJpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Samsung_M35_5G", schema = "ecommerce",uniqueConstraints = {@UniqueConstraint(
        name = "sku_unique",
        columnNames = "stock_keeping_unit"
),
        @UniqueConstraint(
                name = "product_name",
                columnNames = "name"
        )
})
public class Product {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
    generator = "product_generator")

    @SequenceGenerator(name = "product_generator",
    sequenceName = "product_generator_name",
    allocationSize = 1)
    private Long id;
    @Column(name = "stock_keeping_unit",nullable = false)

    private String sku;
    @Column(nullable = false,length = 100)
    private String name;
    private String description;

    private BigDecimal price;
    private boolean active;
    private String imageUrl;
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime update_at;
}
