package com.socola.store_microservice.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "PRODUCT")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(name = "product_name", length = 50)
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "stock")
    private Double stock;

    @Column(name = "price")
    private Double price;

    @Column(name = "status")
    private Double status;

    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_category")
    private Category category;
}

