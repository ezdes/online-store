package com.example.project.Entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Delivery extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    Location location;

    @Column(name = "price")
    Double price;

    @ManyToOne
    @JoinColumn(name = "supplier_id", referencedColumnName = "id")
    User user;
}
