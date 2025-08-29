package pjatk.alexandalex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "colors")
public class Color {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private double extraCost;
}
