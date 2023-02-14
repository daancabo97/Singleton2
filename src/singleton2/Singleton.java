
package singleton2;

public class Singleton {
    // Variable estática que almacena la única instancia de la clase
    private static Singleton instance;
    
    // Constructor privado para que no se pueda crear una instancia de la clase desde fuera
    private Singleton() {
        // Código para inicializar la instancia
    }
    
    // Método estático que devuelve la única instancia de la clase
    public static synchronized Singleton getInstance() {
        // Si aún no se ha creado la instancia, se crea
        if (instance == null) {
            instance = new Singleton();
        }
        // Se devuelve la instancia creada
        return instance;
    }
    

}




