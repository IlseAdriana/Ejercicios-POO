package vehiculos;

public class Vehiculo implements Comparable<Vehiculo> {
    // Atributos
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String color;
    protected String transmision;
    protected Integer km;
    
    // Métodos
        // Constructor
    public Vehiculo(String matricula, String marca, String modelo, String color, String transmision, Integer km) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.transmision = transmision;
        this.km = km;
    }

        // Getters y Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmision() {
        return transmision;
    }
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public Integer getKm() {
        return km;
    }
    public void setKilometraje(Integer km) {
        this.km = km;
    }
        // Otros
    @Override
    public String toString() {
        return String.format("Matricula: %s\nMarca: %s\nModelo: %s\nColor: %s\nTransmisión: %s\nKilometraje: %dkm", matricula, marca, modelo, color, transmision, km);
    }
    @Override
    public int compareTo(Vehiculo o) {
        return this.matricula.compareTo(o.matricula);
    }
}