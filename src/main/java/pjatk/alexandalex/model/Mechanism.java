package pjatk.alexandalex.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "mechanisms")
@Getter
@Setter
public class Mechanism {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String code;

   private String name;

   private BigDecimal pricePerUnit;
}

