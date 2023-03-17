package EjercicioVehiculo;

public class Vehiculo {
    private String Marca;
    private String Modelo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getNumeroRuedas() {
        return NumeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        NumeroRuedas = numeroRuedas;
    }

    private int NumeroRuedas;

}
