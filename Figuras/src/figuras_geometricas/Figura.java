package figuras_geometricas;

public class Figura {
    // Atributos
    protected Float area;
    protected Float perimetro;

    // Métodos
        // Getters y Setters
    public Float getArea() {
        return area;
    }
    public void setArea(Float area) {
        this.area = area;
    }
    
    public Float getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(Float perimetro) {
        this.perimetro = perimetro;
    }

        // Otros
    public void calcularPerimetro() {}
    public void calcularArea() {}
}