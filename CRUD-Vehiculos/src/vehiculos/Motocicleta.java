package vehiculos;

public class Motocicleta extends Vehiculo {
    // Atributos
    private Integer noLlantas;

    // Métodos
        // Constructor
    public Motocicleta (String matricula, String marca, String modelo, String color, String transmision, Integer km, Integer noLlantas) {
        super(matricula, marca, modelo, color, transmision, km);
        this.noLlantas = noLlantas;
    }
        // Getters y Setters
    public Integer getNoLlantas() {
        return noLlantas;
    }
    public void setNoLlantas(Integer noLlantas) {
        this.noLlantas = noLlantas;
    }

        // Otros
    @Override
    public String toString() {
        return String.format("Motocicleta\n%s\nNo. Llantas: %s", super.toString(), noLlantas);
    }
}
