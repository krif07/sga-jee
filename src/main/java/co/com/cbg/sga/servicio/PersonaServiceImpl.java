/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.cbg.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import co.com.cbg.sga.domain.Persona;

/**
 *
 * @author krif
 */
import java.util.ArrayList;


@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService  {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", "Perez", "Suarez", "jperez@gmail.com", "55668798"));
        personas.add(new Persona(2, "Martha", "Suarez", "Jimenez", "msuarez@mail.com", "566998811"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {}

    @Override
    public void modificarPersona(Persona persona) {}

    @Override
    public void eliminarPersona(Persona persona) {}
}