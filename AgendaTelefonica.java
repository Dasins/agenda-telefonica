import java.util.HashMap;

/**
 * Esta clase modela objetos que cumplen con la funcionalidad de una agenda telefonica.
 *
 * @author D4s1ns
 * @version 2018/02/15
 */
public class AgendaTelefonica {
    // Almacena las entradas de nuestra agenda. Key: nombre
    HashMap<String, String> contactos;
    
    /**
     * Construye una nueva agenda vacia.
     */
    public AgendaTelefonica() {
        contactos = new HashMap<>();
    }
    
    /**
     * Anade una nueva contacto a la agenda (reemplaza un contacto anterior si ambos tienen el mismo nombre).
     * 
     * @param nombre El nombre del contacto.
     * @param tlfno El numero de telefono asociado a ese nombre.
     */
    public void enterNumber(String nombre, String tlfno) {
        contactos.put(nombre,tlfno);
    }
    
    /**
     * Devuelve el numero de telefono asociado al nombre indicado por parametro o, null, si el nombre no existe.
     * 
     * @param nombre El nombre del contacto cuyo numero buscamos.
     * @return Devuelve el numero de telefono de la persona buscada o null, si el nombre no existe.
     */
    public String lookupNumber(String nombre) {
        String numero = contactos.get(nombre);
        return numero;
    }
    
    /**
     * Muestra por terminal de texto todos los nombres de los contactos.
     */
    public void printAllKeys() {
        System.out.println(contactos.keySet());
    }
    
}
