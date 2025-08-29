package pjatk.alexandalex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "materials")
public class Material {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;

   @Column(name = "price_per_m2")
   private double pricePerM2;
}

