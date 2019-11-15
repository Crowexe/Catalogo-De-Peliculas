package proyecto;

import java.io.IOException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author Luis
 */
public class Archivo {

    private String nombre;
    private ObjectInputStream ois;
    private FileInputStream fis;
    private ObjectOutputStream oos;
    private FileOutputStream fos;

    public Archivo(String archivo) {
        nombre = archivo;
        ois = null;
        oos = null;
        fis = null;
        fos = null;
    }

    private void abrirFlujo() {
        try {
            fis = new FileInputStream(nombre);
            fos = new FileOutputStream(nombre);
            ois = new ObjectInputStream(fis);
            oos = new ObjectOutputStream(fos);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void cerrarFlujo() {
        if (ois != null) {
            try {
                ois.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    /*public Archivo() {
        nombre = new String();
    }

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public Archivo(Archivo archivo) {
        this.nombre = archivo.nombre;
    }*/
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

    public void guardar(FichaDeDato ficha) {
        System.out.println("Guardando cambios en la ficha de datos");
        //se agregara funcion para guardar datos en un txt 

    }

    public void guardar(FichaPrestamo ficha) {
        System.out.println("Guardando cambios en la ficha de prestamo");
    }

    public List<Object> leerObjetos() {
        abrirFlujo();
        LinkedList<Object> lista = new LinkedList<>();
        try {
            Object objeto = new Object();
            while (true) {
                if (fis.available()!= 0) {
                    objeto = ois.readObject();
                    lista.add(objeto);
                } else {
                    break;
                }
            }
        } catch (EOFException eofe) {
            eofe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } finally {
            cerrarFlujo();
        }
    return lista;
}

public void escribirObjectos( LinkedList<Object> lista ) {
    abrirFlujo();
    try {
        Object obj;
	Iterator<Object> itera = lista.iterator();
	while( itera.hasNext() ) {
            obj = itera.next();
            oos.writeObject(obj);
	}
    }
    catch( IOException ioe ) { 
	ioe.printStackTrace();
    }
    finally {
	cerrarFlujo();
    }
}

    @Override
        public String toString() {
        return nombre;
    }
}
