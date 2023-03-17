package EjercicioAnimal;

public abstract class Animal {
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    private String Nombre;

    public abstract String TipoComunicacion();
}
