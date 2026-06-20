// Definición de la clase que sirve como molde para nuestros objetos
class Personaje {
    // Atributos: representan las características del personaje
    String nombre;
    int salud;
    String habilidad;

    // Constructor: se encarga de inicializar los atributos al crear el objeto
    Personaje(String nombreInicial, int saludInicial, String habilidadInicial) {
        nombre = nombreInicial;
        salud = saludInicial;
        habilidad = habilidadInicial;
    }

    // Método: representa una acción que el personaje puede realizar
    void mostrarInfo() {
        System.out.println("=== DATOS DEL PERSONAJE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Puntos de Salud: " + salud + " HP");
        System.out.println("Habilidad Especial: " + habilidad);
        System.out.println("===========================");
    }
}

public class Main {
    public static void main(String[] args) {
        // Instanciación: Creación de un objeto real a partir del molde 'Personaje'
        Personaje heroe = new Personaje("Aragorn", 100, "Espadachín");
        
        // Llamada al método del objeto para mostrar sus datos en la consola
        heroe.mostrarInfo();
    }
}
