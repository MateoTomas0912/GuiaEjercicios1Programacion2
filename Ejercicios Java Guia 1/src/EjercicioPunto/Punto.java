package EjercicioPunto;

import java.util.List;

public class Punto {
    private List<Integer> Punto1;
    private List<Integer> Punto2;


    public List<Integer> getPunto1() {
        return Punto1;
    }

    public void setPunto1(List<Integer> punto1) {
        Punto1 = punto1;
    }

    public List<Integer> getPunto2() {
        return Punto2;
    }

    public void setPunto2(List<Integer> punto2) {
        Punto2 = punto2;
    }

    public double Distancia(){
        int distanciaX = Punto1.get(0) - Punto2.get(0);
        int distanciaY = Punto1.get(1) - Punto2.get(1);

        return Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
    }
}
