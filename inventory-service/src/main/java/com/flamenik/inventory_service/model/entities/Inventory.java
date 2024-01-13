package com.flamenik.inventory_service.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventory")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;

    private Long quantity;
}
