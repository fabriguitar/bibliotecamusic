package com.biblio.bibliotecamusic.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biblio.bibliotecamusic.modelos.Artista;
import com.biblio.bibliotecamusic.modelos.Canciones;

import com.biblio.bibliotecamusic.servicios.serviciosImpl.ArtistaServiceImpl;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {

@Autowired    
private ArtistaServiceImpl artistaServiceImpl;

 @PostMapping("/guardar")
 public Artista guardarArtista(@RequestBody Artista nvArtista) {
    if (nvArtista.getContacto() != null) {
       nvArtista.getContacto().setArtista(nvArtista);
       
    }
    if (nvArtista.getCanciones() != null) {
      for(Canciones canciones : nvArtista.getCanciones()) {
        canciones.setArtista(nvArtista);
      }
      
    }
    return this.artistaServiceImpl.guardarArtista(nvArtista);
    
 }

 @DeleteMapping("/eliminar")
 public String eliminarArtista(@RequestParam (name = "codigoartista")Integer codigoartista)
 {
  return this.artistaServiceImpl.eliminarArtista(codigoartista);
 }

 @PutMapping("/actualizar")
  public String actualizArtista(@RequestParam(name = "codigoartista") Integer codigoartista, @RequestBody Artista artista){
    return this.artistaServiceImpl.actualizarArtista(codigoartista, artista);
  }
  @GetMapping("/buscar{cogigoartista}")
  public String buscarArtista(@RequestParam(name = "codigoartista")Integer codigoartista){
    String artista = artistaServiceImpl.buscarArtista(codigoartista);

    if (artista != null) {
      return "artista :"+artista;
      
    }
    return "no se encontro"+codigoartista;
  }
  @GetMapping("/obtener/todos")
   public List<Artista> obtenertodosArtista(){
    return this.artistaServiceImpl.obtenerArtistas();
   }
}
