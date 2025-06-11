public class funciones {

    // 1. Mostrar mensaje fijo
    public void mostrarSaludo() {
        System.out.println("Hola, mundo");
    }

    // 2. Saludo personalizado
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // 3. Área de un rectángulo
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    // 4. Convertir a mayúsculas
    public String convertirMayusculas(String texto) {
        return texto.toUpperCase();
    }

    // 5. Mostrar menú
    public void mostrarMenu() {
        System.out.println("=== MENÚ ===");
        System.out.println("1. Mostrar saludo");
        System.out.println("2. Saludar con nombre");
        System.out.println("3. Calcular área de rectángulo");
        System.out.println("4. Convertir texto a mayúsculas");
        System.out.println("5. Salir");
    }
    // 6. Número par o impar
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // 7. Calcular el cuadrado de un número
    public int cuadrado(int numero) {
        return numero * numero;
    }

    // 8. Factorial recursivo
    public int factorial(int numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    // 9. Sumar múltiples números (varargs)
    public int sumarNumeros(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    // 10. Promedio de un array
    public double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return numeros.length > 0 ? suma / numeros.length : 0;
    }

    // 11. Buscar valor en array
    public boolean buscarValor(int[] arreglo, int valor) {
        for (int num : arreglo) {
            if (num == valor) {
                return true;
            }
        }
        return false;
    }

    // 12. Contar ocurrencias
    public int contarOcurrencias(String[] arreglo, String clave) {
        int contador = 0;
        for (String elemento : arreglo) {
            if (elemento.equals(clave)) {
                contador++;
            }
        }
        return contador;
    }

    // 13. Array formateado
    public void imprimirArray ( int[] arreglo){
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // 14. Array invertido
    public int[] invertirArray(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // 15. Mejor nota
    public String mejorEstudiante(String[] nombres, double[] notas) {
        if (nombres.length == 0 || nombres.length != notas.length) {
            return "Datos inválidos";
        }

        double mejorNota = notas[0];
        String mejor = nombres[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                mejor = nombres[i];
            }
        }
        return mejor;
    }

}
