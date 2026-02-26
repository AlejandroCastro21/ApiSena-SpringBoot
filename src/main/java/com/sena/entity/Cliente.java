package com.sena.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;


    private TipoDocumento tipoDocumento;


    private String numeroDocumento;


    private String direccion;


    private String telefono;


    private String email;



}