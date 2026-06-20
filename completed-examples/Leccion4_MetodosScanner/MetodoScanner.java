import java.util.Scanner; // Importación obligatoria de la biblioteca de Java

public class Main {
    
    // Creación de un método personalizado que recibe parámetros
    public static void saludarUsuario(String nombre, int edad) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido a la aplicación.");
        System.out.println("Es genial que a tus " + edad + " años estés aprendiendo a programar.");
    }

    public static void main(String[] args) {
        // Activación del objeto Scanner para escuchar la entrada de la consola
        Scanner teclado = new Scanner(System.in);
        
        // Petición y captura del nombre (Texto)
        System.out.print("Ingresa tu nombre: ");
        String nombreUsuario = teclado.nextLine(); 
        
        // Petición y captura de la edad (Número entero)
        System.out.print("Ingresa tu edad: ");
        int edadUsuario = teclado.nextInt(); 
        
        System.out.println(); // Espacio estético en la consola
        
        // Llamada al método personalizado enviando las variables capturadas
        saludarUsuario(nombreUsuario, edadUsuario);
        
        // Cierre del objeto Scanner por buenas prácticas de desarrollo
        teclado.close();
    }
}
