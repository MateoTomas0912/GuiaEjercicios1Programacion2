package EjercicioRectangulo;

public class Rectangulo {
    double ancho;
    double area;
    double alto;
    double perimetro;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void CalcularArea(){
        this.area = ancho * alto;
    }

    public void CalcularPerimetro(){
        this.perimetro = ancho * 2 + alto * 2;
    }
}
