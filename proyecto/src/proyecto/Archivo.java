package proyecto;

/**
 *
 * @author Luis
 */

public class Archivo {

    private String nombre;

    public Archivo() {
        nombre = new String();
    }

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public Archivo(Archivo archivo) {
        this.nombre = archivo.nombre;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof Archivo)) {
            return false;
        }
        Archivo archivo = (Archivo) objeto;
        return nombre.equals(archivo.nombre);
    }

    public void destruir() {
        if (nombre != null) {
            nombre = null;
        }
        System.gc();
    }
    public void guardar(FichaDeDato ficha){
        System.out.println("Guardando cambios en la ficha de datos");
        //se agregara funcion para guardar datos en un txt 

    }
    public void guardar(FichaPrestamo ficha){
        System.out.println("Guardando cambios en la ficha de prestamo");
    }

    @Override
    public String toString() {
        return nombre;
    }
}
