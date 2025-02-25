package efer;

public class LibroParaColorear extends Libro {
    String tipoDeDibujos;

    public LibroParaColorear() {
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

    public void setTipoDeDibujos(String tipoDeDibujos) {
        this.tipoDeDibujos = tipoDeDibujos;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Titulo: "+titulo+
                "\nAutor: "+autor+
                "\nTipo de Dibujos: "+tipoDeDibujos+
                "\nNumero de Paginas: "+numeroPaginas+
                "\nTamaño de las Hojas: "+tamanoHoja+
                "\nPrecio: "+precio+
                "\nIdioma: "+idioma);
    }

    @Override
    protected void leer() {
        System.out.println("*Coloreando el libro de colorear*");
    }
}
