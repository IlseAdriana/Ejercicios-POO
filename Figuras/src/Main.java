import java.util.Scanner;
import figuras_geometricas.*;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Digita la cantidad de figuras: ");
        int n = leer.nextInt();
        System.out.println("------------------");

        Figura[] figuras = new Figura[n];
        int i = 0;
        do {
            System.out.printf("1 - Círculo\n2 - Cuadrado\n3 - Pentágono\n4 - Triángulo\n");
            System.out.printf("Digite la opcion correspondiente a la figura que desea agregar: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Digite el valor del radio: ");
                    float radio = leer.nextFloat();
                    figuras[i] = new Circulo(radio);
                    System.out.println("------------------");
                    break;
                case 2:
                    System.out.print("Digite el valor del lado: ");
                    float ladoC = leer.nextFloat();
                    figuras[i] = new Cuadrado(ladoC);
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.print("Digite el valor del lado: ");
                    float ladoP = leer.nextFloat();
                    System.out.print("Digite el valor del apotema: ");
                    float apotema = leer.nextFloat();
                    figuras[i] = new Pentagono(ladoP, apotema);
                    System.out.println("------------------");
                    break;
                case 4:
                    System.out.print("Digite el valor de la base: ");
                    float base = leer.nextFloat();
                    System.out.print("Digite el valor de la altura: ");
                    float altura = leer.nextFloat();
                    figuras[i] = new Triangulo(base, altura);
                    System.out.println("------------------");
                    break;
                default:
                    System.out.println("Digite una opción válida");
                    System.out.println("------------------");
                    continue;
            }
            i++;
        } while(i < n);

        for (Figura figura : figuras) {
            figura.calcularPerimetro();
            figura.calcularArea();
            System.out.println(figura);
        }
        System.out.println("\n------------------");

        // Método burbuja para ordenar elementos con base en el área
        for (i = 0; i < figuras.length-1; i++) {
            for (int j = 0; j < figuras.length-1; j++) {
                if (figuras[j].getArea() > figuras[j+1].getArea()) {
                    Figura temp = figuras[j];
                    figuras[j] = figuras[j+1];
                    figuras[j+1] = temp;
                }
            }
        }

        for (Figura figura : figuras) {
            System.out.println(figura);
        }
        System.out.println("\n------------------");
    }
}
