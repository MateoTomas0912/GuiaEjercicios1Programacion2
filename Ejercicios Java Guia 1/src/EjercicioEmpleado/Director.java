package EjercicioEmpleado;

public class Director extends Empleado{
    public int getAñosEnCargo() {
        return AñosEnCargo;
    }

    public void setAñosEnCargo(int añosEnCargo) {
        AñosEnCargo = añosEnCargo;
    }

    private int AñosEnCargo;
}
