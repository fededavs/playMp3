public class ReproductorCancion {
    private String titulo;
    private String artista;
    private String album;
    private float duracion;
    private int lanzamiento;

    public ReproductorCancion (String titulo,
                               String artista,
                               String album,
                               float duracion,
                               int lanzamiento){
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.lanzamiento = lanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public float getDuracion() {
        return duracion;
    }
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }
    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

}
