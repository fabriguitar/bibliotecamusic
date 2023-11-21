package com.biblio.bibliotecamusic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblio.bibliotecamusic.modelos.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Integer>{
    
}
