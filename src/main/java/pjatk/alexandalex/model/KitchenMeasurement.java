package pjatk.alexandalex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "kitchen_measurements")
public class KitchenMeasurement {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

// Sekcja 1: długości
   @Column(name = "a1_length")
   private double a1;

   @Column(name = "b1_length")
   private double b1;

   @Column(name = "c1_length")
   private double c1;

// Sekcja 2: wysokości
   @Column(name = "a2_height")
   private double a2;

   @Column(name = "b2_height")
   private double b2;

   @Column(name = "c2_height")
   private double c2;

   // Sekcja 3: głębokości
   @Column(name = "a3_depth")
   private double a3;

   @Column(name = "b3_depth")
   private double b3;

   @Column(name = "c3_depth")
   private double c3;

// Wynik
   @Column(name = "price")
   private double price;

}