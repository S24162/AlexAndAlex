package pjatk.alexandalex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mechanisms")
public class Mechanism {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private double pricePerUnit;
}

