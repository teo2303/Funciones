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
}
