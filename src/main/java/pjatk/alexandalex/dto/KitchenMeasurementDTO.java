package pjatk.alexandalex.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class KitchenMeasurementDTO {

   // sekcja 1: długości
   private double a1;
   private double b1;
   private double c1;

   // sekcja 2: wysokości
   private double a2;
   private double b2;
   private double c2;

   // sekcja 3: głębokości
   private double a3;
   private double b3;
   private double c3;

   // dodatkowe wybory użytkownika
   private String materialId;
   private String colorId;
   private String mechanismId;
}

