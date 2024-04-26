/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nicoangeletti.ConsultoraEmpresas.service;

import java.time.LocalDateTime;
import java.util.List;
import nicoangeletti.ConsultoraEmpresas.model.Empresa;
import nicoangeletti.ConsultoraEmpresas.model.Encuesta;
import nicoangeletti.ConsultoraEmpresas.model.Pregunta;

/**
 *
 * @author nicoc
 */
public interface IEncuestaService {
    
    
    
    
    
    
    
    
    
      public void guardarEncuesta(Encuesta encuesta);
    
    public List<Encuesta> traerEncuestas();
    
    public Encuesta traerEncuesta(Long idEncuesta);
    
    public void eliminarEncuesta(Long idEncuesta);

    public void editarEncuesta(Long idOriginal, Long idNuevo , String nombreEncuesta, LocalDateTime fechaInicio, LocalDateTime fechaFin, Empresa empresas , List<Pregunta> listaPreguntas);
            
            
               
 
}
