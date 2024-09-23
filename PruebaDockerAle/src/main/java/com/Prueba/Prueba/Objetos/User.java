package com.Prueba.Prueba.Objetos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "\"user\"") // Agregar comillas dobles
@Getter
@Setter


public class User {


        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
    
        @Column(name = "nombre")
        private String nombre;
    
        @Column(name = "apellidos")
        private String apellidos;
    


    }



