import java.util.Scanner;

class AreasFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de áreas");
        System.out.println("1. Rectángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.println("4. Triángulo");
        System.out.println("5. Trapecio");
        System.out.print("Elige una figura (1-5): ");
        int opcion = scanner.nextInt();

        double area;
        switch (opcion) {
            case 1:
                System.out.print("Ingresa la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingresa la altura del rectángulo: ");
                double alturaRectangulo = scanner.nextDouble();
                area = baseRectangulo * alturaRectangulo;
                break;
            case 2:
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                break;
            case 3:
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * radio * radio;
                break;
            case 4:
                System.out.print("Ingresa la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                area = (baseTriangulo * alturaTriangulo) / 2;
                break;
            case 5:
                System.out.print("Ingresa la base mayor del trapecio: ");
                double baseMayor = scanner.nextDouble();
                System.out.print("Ingresa la base menor del trapecio: ");
                double baseMenor = scanner.nextDouble();
                System.out.print("Ingresa la altura del trapecio: ");
                double alturaTrapecio = scanner.nextDouble();
                area = ((baseMayor + baseMenor) * alturaTrapecio) / 2;
                break;
            default:
                System.out.println("Opción no válida.");
                scanner.close();
                return;
        }

        System.out.println("El área es: " + area);
        scanner.close();
    }
}