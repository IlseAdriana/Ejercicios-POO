package figuras_geometricas;

public class Triangulo extends Figura {
    // Atributos
    private Float base;
    private Float altura;

    // Métodos
        // Constructor
    public Triangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
    }
    
        // Getters y Setters
    public Float getBase() {
        return base;
    }
    public void setBase(Float base) {
        this.base = base;
    }

    public Float getAltura() {
        return altura;
    }
    public void setAltura(Float altura) {
        this.altura = altura;
    }

        // Otros
    @Override
    public void calcularPerimetro() {
        this.perimetro = base * 3;
    }
    @Override
    public void calcularArea() {
        this.area = (base * altura) / 2;
    }
    @Override
    public String toString() {
        return String.format("\n--Triangulo--\nPerimetro: %.2f\nArea: %.2f", perimetro, area);
    }
}
