package figuras_geometricas;

public class Cuadrado extends Figura {
    // Atributos
    private Float lado;

    // Métodos
        // Constructor
    public Cuadrado (Float lado) {
        this.lado = lado;
    }

        // Getters y Setters
    public Float getLado() {
        return lado;
    }
    public void setLado(Float lado) {
        this.lado = lado;
    }    
    
        // Otros
    @Override
    public void calcularPerimetro() {
        this.perimetro = lado * 4;
    }
    @Override
    public void calcularArea() {
        this.area = lado * lado;
    }
    @Override
    public String toString() {
        return String.format("\n--Cuadrado--\nPerimetro: %.2f\nArea: %.2f", perimetro, area);
    }
}