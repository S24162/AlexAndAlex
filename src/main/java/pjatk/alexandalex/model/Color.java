package pjatk.alexandalex.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "colors")
@Getter
@Setter
public class Color {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String code;

   private String name;

   private Double extraCost;
}
