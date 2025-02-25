package efer;

public class Novela extends Libro{

    @Override
    protected void leer() {
        System.out.println("*leyendo una novela*");
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
                "\nAutor: "+autor+
                "\nNumero de Paginas: "+numeroPaginas+
                "\nTamaño de las Hojas: "+tamanoHoja+
                "\nPrecio: "+precio+
                "\nIdioma: "+idioma);
    }
}
