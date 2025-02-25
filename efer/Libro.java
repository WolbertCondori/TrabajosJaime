package efer;

public abstract class Libro implements Impreso{
    String titulo;
    String autor;
    int numeroPaginas;
    String tamanoHoja;
    double precio;
    String idioma;

    public Libro() {
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    protected abstract void leer();
}
