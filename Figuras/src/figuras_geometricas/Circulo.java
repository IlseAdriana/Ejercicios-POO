package figuras_geometricas;

public class Circulo extends Figura {
    // Atributos
    private Float radio;

    // Métodos
        // Constructor
    public Circulo(Float radio) {
        this.radio = radio;
    }
        
        // Getters y Setters
    public Float getRadio() {
        return radio;
    }
    public void setRadio(Float radio) {
        this.radio = radio;
    }
    
        // Otros
    @Override
    public void calcularPerimetro() {
        this.perimetro = (radio * 2 * (float) Math.PI);
    }
    @Override
    public void calcularArea() {
       this.area = ((float) Math.PI * (float) Math.pow(radio, 2));
    }
    @Override
    public String toString() {
       return String.format("\n--Circulo--\nPerimetro: %.2f\nArea: %.2f", perimetro, area);
    }
}
