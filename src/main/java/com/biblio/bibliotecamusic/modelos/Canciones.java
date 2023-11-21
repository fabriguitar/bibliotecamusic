package com.biblio.bibliotecamusic.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "canciones")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Canciones {
   

    @Id
    @Column(name = "codigoCanciones")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int codigocanciones;

     private String titulo;

     private String album;
    
     @Column(name = "anoLanzamiento")
     private String anolanzamiento;
      
    
      
     @JsonIgnore
     @ManyToOne
     @JoinColumn(name = "codigoartista",referencedColumnName = "codigoartista")
     private Artista artista;

     
    
}
