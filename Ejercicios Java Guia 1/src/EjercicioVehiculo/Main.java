package EjercicioVehiculo;

public class Main {
    public static void main(String[] args) {
        // Código que se ejecuta al iniciar el programa
        Auto auto = new Auto();
        auto.setMarca("Chevrolet");
        auto.setNumeroPuertas(4);
        auto.setNumeroRuedas(4);
        auto.setModelo("Corsita");

        System.out.println("el auto es de marca " + auto.getMarca() + " y tiene " + auto.getNumeroPuertas() + "puertas");

        // Código que se ejecuta al iniciar el programa
        Moto moto = new Moto();
        moto.setMarca("Guerrero");
        moto.setCilindrada(400);
        moto.setNumeroRuedas(2);
        moto.setModelo("Tripon");

        System.out.println("la moto es de marca " + moto.getMarca() + " y tiene " + moto.getCilindrada() + "de cilindrada");
    }
}