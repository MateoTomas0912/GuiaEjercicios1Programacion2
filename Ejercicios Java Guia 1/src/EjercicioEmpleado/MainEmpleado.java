package EjercicioEmpleado;

import java.util.ArrayList;
import java.util.List;

public class MainEmpleado {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<Empleado>();
        int sueldosTotales = 0;
        for (Empleado empleado:
             empleados) {
            sueldosTotales += empleado.getSalario();
        }

        System.out.println("el sueldo total es " + sueldosTotales);
    }
}
