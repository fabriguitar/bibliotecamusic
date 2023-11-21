package com.biblio.bibliotecamusic.servicios.serviciosImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblio.bibliotecamusic.modelos.Artista;
import com.biblio.bibliotecamusic.repositorios.ArtistaRepository;
import com.biblio.bibliotecamusic.servicios.ArtistaService;

@Service
public class ArtistaServiceImpl implements ArtistaService {

  @Autowired
   private ArtistaRepository artistaRepository;


    @Override
    public Artista crearArtista(Artista artista) {
        artistaRepository.save(artista);
        return artista;
    }
    @Override
    public String actualizarArtista(Integer codigoartista, Artista artista) {
        Artista artActualizar = this.artistaRepository.findById(codigoartista).get();
        if(artActualizar!= null){
            artActualizar.setNombre(artista.getNombre());
            artActualizar.setApellido(artista.getApellido());
            artActualizar.setFechanacimiento(artista.getFechanacimiento());
            this.artistaRepository.save(artista);
            return "se actualizo"+codigoartista;
        }
        return "no se encontro"+codigoartista;
    }

    @Override
    public String eliminarArtista(Integer id) {
        Artista artEliminar = this.artistaRepository.findById(id).get();

        if(artEliminar != null) {
            this.artistaRepository.delete(artEliminar);
            return "se ha eliminado :"+artEliminar.getCodigoartista();
        }
       return "no existe el cliente con codigo"+id;
    }

    @Override
    public String buscarArtista(Integer id) {
        Optional<Artista> optionalArtista = this.artistaRepository.findById(id);
       if(optionalArtista.isPresent()){
        return "el artista es :"+optionalArtista.get();
       }
       return "no se encontro"+id;
    }

    @Override
    public List<Artista> obtenerArtistas() {
        return this.artistaRepository.findAll();
    }
    public Artista guardarArtista(Artista artista) {
        return null;
    }

    

    
}
