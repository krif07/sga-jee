/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cbg.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import co.com.cbg.sga.domain.Persona;

/**
 *
 * @author krif
 */

@Remote
public interface PersonaServiceRemote {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}