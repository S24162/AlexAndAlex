package pjatk.alexandalex.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "materials")
@Getter
@Setter
public class Material {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String code;

   private String name;

   @Column(name = "price_per_m2")
   private double pricePerM2;
}

