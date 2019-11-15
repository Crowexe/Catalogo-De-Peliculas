/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Ximena
 */
// se usara método de padre para generar la ficha
public class FichaDeDato {
    private String plantilla;

    public FichaDeDato() {
        this("X");
    }

    public FichaDeDato(String plantilla) {
        
        this.plantilla = plantilla;
    }

    public FichaDeDato(FichaDeDato fichaDeDato) {
        this.plantilla = fichaDeDato.plantilla;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof FichaDeDato)) {
            return false;
        }
        FichaDeDato fichaDeDato = (FichaDeDato) objeto;
        return plantilla.equals(fichaDeDato.plantilla);
    }

    public void destruir() {
        if (plantilla != null) {
            plantilla = null;
        }
        System.gc();
    }

    /*public void generarFicha() {
        this.plantilla = pelicula.mostarTitulo() + "\n" + pelicula;
    }

    public void generarFicha(String ficha) {
        this.plantilla = ficha;
    }*/

    @Override
    public String toString() {
        return plantilla;
    }

}
