package com.example.QUIZtercerCorte.Entidad;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Elementos")

public class ElementosAlimenticios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ELEMENTOSALE_REL")
    @SequenceGenerator(name = "SEQ_ELEMENTOSALE_REL", sequenceName = "SEQ_ELEMENTOSALE_REL",allocationSize = 1)
    @Column(name = "CODIGO",nullable = false)
    private long codigo;

    @Column(name = "Precio",nullable = false)
    private int precio;

    @Column(name = "Marca",nullable = false)
    private String marca;

    @Column(name = "Num_Unidades",nullable = false)
    private int numUnidades;

    @Column(name = "Proveedor",nullable = false)
    private String Proveedor;
}
