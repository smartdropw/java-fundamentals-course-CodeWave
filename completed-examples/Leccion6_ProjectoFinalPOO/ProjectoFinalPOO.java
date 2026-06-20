import java.util.Scanner; 

//1. MOLDE(clase estudiante)

class Estudiante {
    //Encapsulamiento : protegemos los datos de la clase con 'private'
    private String nombre;
    private int nivel;
    
    //Constructor: le daremos vida 
    public Estudiante(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }
    
    // Getters: para leer los datos sin modificarlos
    public String getNombre() {
        return nombre; //devulve mi nombre
    }
    public int getNivel() {
        return nivel; //devuelve mi nivel
    }
    
    // Metodo 
    public void presentarse() {
        System.out.println("!Hola¡, Mi nombre es "+ nombre + " y soy del nivel " + nivel + ".");
    }
    
}

//2. Pograma principal 
 public class Main { 
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
         // Estructura de datos: un arreglo donde guardaremos a 3 estudiantes
         Estudiante[] equipo = new Estudiante[3];
         
         System.out.println(" BIENVENIDO AL REGISTRO DE EQUIPOS ");
         
         // Bucle for para llenar nuestro arreglo 
         
         for(int i = 0; i < equipo.length; i++) {
             
             System.out.println("Ingrese el nombre: ");
             String nombreIngresado = teclado.nextLine();
             
             System.out.println("Ingrese el nivel: ");
             int nivelIngresado = teclado.nextInt();
             
             teclado.nextLine();
             
             //Instancia: Creamos el onjeto y lo guardamos en la posicion i 
             equipo[i] = new Estudiante(nombreIngresado, nivelIngresado);
             
         }
         
         System.out.println("\n LISTA OFICIAL DEL EQUIPO");
         
         // Otro bucle para recorrer el arreglo y usar el metodo de cada objeto
         for (int i = 0; i < equipo.length; i++) {
             equipo[i].presentarse();
         }
         System.out.println("\n !Registro completado! excelente trabajo.");
     }
     
 }
