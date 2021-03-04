package figuras_geometricas;

public abstract class Figura {
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
    public abstract void calcularPerimetro();
    public abstract void calcularArea();
}