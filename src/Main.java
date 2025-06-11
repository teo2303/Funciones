public class Main {
    public static void main(String[] args) {
        funciones funciones = new funciones();
        // 1. Mostrar mensaje fijo
        funciones.mostrarSaludo();

        // 2. Saludo personalizado
        funciones.saludar("Mateo");

        // 3. Área de un rectángulo
        double area = funciones.calcularArea(5, 3);
        System.out.println("Área: " + area);

        // 4. Convertir a mayúsculas
        String textoMayus = funciones.convertirMayusculas("hola mundo");
        System.out.println("En mayúsculas: " + textoMayus);

        // 5. Mostrar menú
        funciones.mostrarMenu();

        // 6. Número par o impar
        int num1 = 4;
        System.out.println(num1 + " es par: " + funciones.esPar(num1));

        // 7. Calcular el cuadrado de un número
        int num2 = 5;
        System.out.println("Cuadrado de " + num2 + ": " + funciones.cuadrado(num2));
    }
}
