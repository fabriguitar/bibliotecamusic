package com.biblio.bibliotecamusic.servicios;

import java.util.List;

import com.biblio.bibliotecamusic.modelos.Artista;

public interface ArtistaService {

    public Artista crearArtista(Artista artista);

    public String eliminarArtista(Integer id);

    public String actualizarArtista(Integer id, Artista artista);

    public String buscarArtista(Integer id);

    public List<Artista> obtenerArtistas();
    
}
