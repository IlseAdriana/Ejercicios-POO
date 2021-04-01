package vehiculos;

public class Carro extends Vehiculo {
    // Atributos
    private Integer noPuertas;
    
    // Métodos
        // Constructor
    public Carro (String matricula, String marca, String modelo, String color, String transmision, Integer km, Integer noPuertas) {
        super(matricula, marca, modelo, color, transmision, km);
        this.noPuertas = noPuertas;
    }
    
        // Getters y Setters
    public Integer getNoPuertas() {
        return noPuertas;
    }
    public void setNoPuertas(Integer noPuertas) {
        this.noPuertas = noPuertas;
    }
    
        // Otros
    @Override
    public String toString() {
        return String.format("Carro\n%s\nNo. Puertas: %d", super.toString(), noPuertas);
    }
}
