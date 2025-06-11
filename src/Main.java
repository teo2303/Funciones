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

        // 8. Factorial recursivo
        int num3 = 5;
        System.out.println("Factorial de " + num3 + ": " + funciones.factorial(num3));

        // 9. Sumar múltiples números (varargs)
        System.out.println("Suma: " + funciones.sumarNumeros(1, 2, 3, 4));

        // 10. Promedio de un array
        double[] nums = {8.5, 7.0, 9.5};
        System.out.println("Promedio: " + funciones.promedio(nums));

        // 11. Buscar valor en array
        int[] enteros = {1, 2, 3, 4, 5};
        System.out.println("¿Está el 3?: " + funciones.buscarValor(enteros, 3));

        // 12. Contar ocurrencias
        String[] palabras = {"manzana", "banana", "manzana", "pera"};
        System.out.println("Ocurrencias de 'manzana': " + funciones.contarOcurrencias(palabras, "manzana"));

        // 13. Array formateado
        int[] numeros = {1, 2, 3, 4, 5};
        funciones.imprimirArray(numeros);

        // 14. Array invertido
        int[] invertido = funciones.invertirArray(numeros);
        funciones.imprimirArray(invertido);

        // 15. Mejor nota
        String[] nombres = {"esteban", "mateo", "simon"};
        double[] notas = {7.5, 9.2, 8.1};
        System.out.println("Mejor estudiante: " + funciones.mejorEstudiante(nombres, notas));
    }

}
