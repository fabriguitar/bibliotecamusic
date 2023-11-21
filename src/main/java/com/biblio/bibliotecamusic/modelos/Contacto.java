package com.biblio.bibliotecamusic.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contacto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contacto {
    

     @Id
     @Column(name = "codigoContacto")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigocontacto;

    private String pais;

    private String ciudad;

    private String telefono;

    private String correo;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "codigoartista", referencedColumnName = "codigoartista")
    private Artista artista;
    



}
