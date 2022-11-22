package poo.interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<>();
    //guardar un empleado
    public void save(Empleado empleado){

        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}
