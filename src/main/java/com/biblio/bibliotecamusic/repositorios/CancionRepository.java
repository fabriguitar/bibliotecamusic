package com.biblio.bibliotecamusic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblio.bibliotecamusic.modelos.Canciones;

public interface CancionRepository extends JpaRepository<Canciones, Integer> {
    
}
