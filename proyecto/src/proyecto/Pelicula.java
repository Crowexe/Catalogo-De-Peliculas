package proyecto;

/**
 *
 * @author Ximena
 */
public class Pelicula {

    private Artista artista;
    private Miniatura miniatura;
    private Estadistica estadistica;
    private Estudio estudio;
    private Titulo titulo;
    private Escritor escritor;
    private GeneroPelicula generoPelicula;
    private Medio medio;
    private Pelicula duplicado;
    private Guionista guionista;
    
    public Pelicula() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public Pelicula(Artista artista, Miniatura miniatura, Estadistica estadistica, Estudio estudio, Titulo titulo,
            Escritor escritor, GeneroPelicula generoPelicula, Medio medio, Pelicula duplicado, Guionista guionista) {
        this.artista = artista;
        this.miniatura = miniatura;
        this.estadistica = estadistica;
        this.estudio = estudio;
        this.titulo = titulo;
        this.escritor = escritor;
        this.generoPelicula = generoPelicula;
        this.medio = medio;
        this.duplicado = duplicado;
        this.guionista = guionista;
    }

    public Pelicula(Pelicula pelicula) {
        this.artista = pelicula.artista;
        this.miniatura = pelicula.miniatura;
        this.estadistica = pelicula.estadistica;
        this.estudio = pelicula.estudio;
        this.titulo = pelicula.titulo;
        this.escritor = pelicula.escritor;
        this.generoPelicula = pelicula.generoPelicula;
        this.medio = pelicula.medio;
        this.duplicado = pelicula.duplicado;
        this.guionista = pelicula.guionista;
    }
    
    
    
 
    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof Pelicula)) {
            return false;
        }
        Pelicula pelicula = (Pelicula) objeto;
        return artista.equals(pelicula.artista) && miniatura.equals(pelicula.miniatura)
                && estadistica.equals(pelicula.estadistica)
                && estudio.equals(pelicula.estudio) && titulo.equals(pelicula.titulo)
                && escritor.equals(pelicula.escritor) && generoPelicula.equals(pelicula.generoPelicula)
                && medio.equals(pelicula.medio) && duplicado.equals(pelicula.duplicado) && guionista.equals(pelicula.guionista);
    }

    public void destruir() {
        if (artista != null) {
            artista.destruir();
        }
        if (miniatura != null) {
            miniatura.destruir();
        }
        if (estadistica != null) {
            estadistica.destruir();
        }
        if (estudio != null) {
            estudio.destruir();
        }
        if (titulo != null) {
            titulo.destruir();
        }
        if (escritor != null) {
            escritor.destruir();
        }
        if (generoPelicula != null) {
            generoPelicula.destruir();
        }
        if (medio != null) {
            medio.destruir();
        }
        if (duplicado != null) {
            duplicado.destruir();
        }
        if (guionista != null) {
            guionista.destruir();
        }
        System.gc();
    }
    public String getTitulo(){
        return titulo.toString();
    }
    public String getMiniatura(){
        return miniatura.toString();
    }
    public String getEstadistica(){
        return estadistica.toString();
    }
    public String getArtista(){
        return artista.toString();
    }
    public String getEstudio(){
        return estudio.toString();
    }
    public String getEscritor(){
        return escritor.toString();
    }
    public String getGenero(){
        return generoPelicula.toString();
    }
    public String getGuionista(){
        return guionista.toString();
    }
    public String getMedio(){
        return medio.toString();
    }
    
    @Override
    public String toString() {
        String string;
        string = titulo.toString() + "Los artistas participantes: \n" + artista.toString()
                + miniatura.toString() + "La puntuación personal de la película es:\n" + estadistica.toString() + "El estudio encargado de la película: \n"
                + estudio.toString() + "Escrito por:\n" + escritor.toString() + "Genero:\n" + generoPelicula.toString() + "Lo tiene en: \n"
                + medio.toString() + "Guión por:\n" + guionista.toString();
        return string;
    }
}
