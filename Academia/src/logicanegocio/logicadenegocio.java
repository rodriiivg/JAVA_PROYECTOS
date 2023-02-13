/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicanegocio;

import dto.Alumno;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author rodrigo valdes
 */
public class logicadenegocio 
{
    public static List<Alumno> listaAlumnos = new ArrayList<>();
    public static void AniadirAlumno (Alumno alumno) 
    {
        listaAlumnos.add(alumno);
    }
    public static List<Alumno> getListaAlumnos()
            {
                return listaAlumnos;
            }
    
}
