package com.ust.rest_jpa_sql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {
    @Id
    public long product_id;
    public String product_name;
    public String product_description;
    public double product_price;
}
