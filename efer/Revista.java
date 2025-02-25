package efer;

public class Revista implements Impreso{

    String nombreProductora;
    int numeroPaginas;
    String tamanoHoja;
    double precio;
    String idioma;

    public Revista() {
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
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
        System.out.println("Productora: "+ nombreProductora+
                "\nNumero de Paginas: "+numeroPaginas+
                "\nTamaño de las Hojas: "+tamanoHoja+
                "\nPrecio: "+precio+
                "\nIdioma: "+idioma);
    }
}
