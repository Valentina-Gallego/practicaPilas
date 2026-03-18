public class objPaginaWeb {

    private String url;
    private String titulo;
    private int fecha;
    public objPaginaWeb() {
    }
    public objPaginaWeb(String url, String titulo, int fecha) {
        this.url = url;
        this.titulo = titulo;
        this.fecha = fecha;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getFecha() {
        return fecha;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    
}