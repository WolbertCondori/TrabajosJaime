package efer;

public class Cuaderno implements Impreso {
    String tapalibro;
    int numeroPaginas;
    String tamanoHoja;
    double precio;
    String idioma;
    public Cuaderno() {
    }
    public void setTapalibro(String tipodetapa){
        this.tapalibro = tipodetapa;
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
        System.out.println("Tipo de tapa: "+tapalibro+
                "\nNumero de Paginas: "+numeroPaginas+
                "\nTamaño de las Hojas: "+tamanoHoja+
                "\nPrecio: "+precio+
                "\nIdioma: "+idioma);
    }
}