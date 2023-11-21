package com.biblio.bibliotecamusic.servicios;

import java.util.List;

import com.biblio.bibliotecamusic.modelos.Artista;
import com.biblio.bibliotecamusic.modelos.Canciones;

public interface CancionService {
    
     public Artista agregarCancionArtista(Integer codigoartista, Canciones canciones) ; 

     List<Canciones> obtenerCancionesPorCodigoArtista(Integer codigoArtista);
}
