package efer;

public class Cuento extends Libro{
    String mensaje;

    public Cuento() {
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void setnumeroPaginas(int hoja) {
        this.numeroPaginas=hoja;
    }

    @Override
    public void settamanoHoja(String scalehoja) {
        this.tamanoHoja=scalehoja;
    }

    @Override
    public void setprecio(double precio) {
        this.precio=precio;
    }

    @Override
    public void setidioma(String idioma) {
        this.idioma=idioma;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: "+titulo+
                "\ny el Mensaje fue: "+mensaje+
                "\nAutor: "+autor+
                "\nNumero de Paginas: "+numeroPaginas+
                "\nTamaño de las Hojas: "+tamanoHoja+
                "\nPrecio: "+precio+
                "\nIdioma: "+idioma);
    }

    @Override
    protected void leer() {
        System.out.println("*Lee un cuento y su mensaje*");
    }
}
