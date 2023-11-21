package com.biblio.bibliotecamusic.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblio.bibliotecamusic.modelos.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
