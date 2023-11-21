package com.biblio.bibliotecamusic.modelos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="artista")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Artista {

     @Id
     @Column(name="codigoArtista")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoartista; 

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name ="apellido")
    private String apellido;
     
    @Column(name="fechaNacimiento")
    private Date fechanacimiento;

    @OneToOne(mappedBy = "artista", cascade = CascadeType.ALL)
    private Contacto contacto;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
     private List<Canciones> canciones = new ArrayList<>();

    public String getCodigoartista() {
        return null;
    }

    public String getNombre() {
        return null;
    }

    public String getApellido() {
        return null;
    }

    public Date getFechanacimiento() {
        return null;
    }


}
