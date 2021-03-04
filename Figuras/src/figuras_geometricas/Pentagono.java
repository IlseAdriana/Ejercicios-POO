package figuras_geometricas;

public class Pentagono extends Figura {
    // Atributos
    private Float lado;
    private Float apotema;

    // Métodos
        // Constructor
    public Pentagono(Float lado, Float apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

        // Getters y Setters
    public Float getLado() {
        return lado;
    }
    public void setLado(Float lado) {
        this.lado = lado;
    }

    public Float getApotema() {
        return apotema;
    }
    public void setApotema(Float apotema) {
        this.apotema = apotema;
    }

        // Otros
    @Override
    public void calcularPerimetro() {
        this.perimetro = lado * 5;
    }
    @Override
    public void calcularArea() {
        this.area = (perimetro * apotema) / 2;
    }
    @Override
    public String toString() {
        return String.format("\n--Pentagono--\nPerimetro: %.2f\nArea: %.2f", perimetro, area);
    }
}
