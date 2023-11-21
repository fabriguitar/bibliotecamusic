package com.biblio.bibliotecamusic.servicios.serviciosImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.bibliotecamusic.modelos.Artista;
import com.biblio.bibliotecamusic.modelos.Canciones;
import com.biblio.bibliotecamusic.repositorios.ArtistaRepository;
import com.biblio.bibliotecamusic.repositorios.CancionRepository;
import com.biblio.bibliotecamusic.servicios.CancionService;

@Service
public class CancionServiveImpl implements CancionService{
   
    @Autowired
    private CancionRepository cancionRepository;

    
    @Autowired
    private ArtistaRepository artistaRepository;

    public Artista agregarCancionArtista(Integer codigoartista, Canciones canciones){
        Artista artActualizar = this.buscarArtista(codigoartista);

        if(artActualizar != null) {
            canciones.setArtista(artActualizar);
            this.cancionRepository.save(canciones);
        }
        return artActualizar;
    }
    private Artista buscarArtista(Integer codigoartista) {
        return this.artistaRepository.findById(codigoartista).get();
}



@Override
public List<Canciones> obtenerCancionesPorCodigoArtista(Integer codigoartista) {
  Artista artActualizar = this.buscarArtista(codigoartista);
  if (artActualizar != null ) {
       
        return this.cancionRepository.findAll();

}
return null;   }}


        
    

    

    

