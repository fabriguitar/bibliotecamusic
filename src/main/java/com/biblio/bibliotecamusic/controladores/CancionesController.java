package com.biblio.bibliotecamusic.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biblio.bibliotecamusic.modelos.Canciones;
import com.biblio.bibliotecamusic.servicios.serviciosImpl.CancionServiveImpl;

@RestController
@RequestMapping("/api/canciones")

public class CancionesController {
    
    @Autowired
    private CancionServiveImpl cancionServiveImpl;

    @PostMapping("/agregar")
    public String agregarCancionArtista(@RequestParam(name = "codigoartista")Integer codigoartista, @RequestBody Canciones canciones){{
        if (this.cancionServiveImpl.agregarCancionArtista(codigoartista, canciones) != null) {
            return "se ha agregado la cancion al artista :"+codigoartista;
            
        }
        return "no existe el artista con codigo:"+codigoartista;
    }


    }
     @GetMapping("/buscar{codigoartista}")
    public List<Canciones> obtenerCanciones(@RequestParam(name="codigoartista")Integer codigoartista){
        List<Canciones> canciones = cancionServiveImpl.obtenerCancionesPorCodigoArtista(codigoartista);
        if (canciones != null) {
            return this.cancionServiveImpl.obtenerCancionesPorCodigoArtista(codigoartista);
        }
        return canciones;
    }
    
    
}   
