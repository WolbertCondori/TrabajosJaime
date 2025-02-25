package efer;

import java.util.ArrayList;
import java.util.List;

public class Agenda implements Impreso{
    List<Notas> notitas = new ArrayList<>();
    int numeroPaginas;
    String tamanoHoja;
    double precio;
    String idioma;

    public Agenda(){

    }
    public void agregarNotas(Notas nota){
        notitas.add(nota);
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
        System.out.println("Cantidad de notas: "+ notitas.size()+
                "\nNumero de Paginas: "+numeroPaginas+
                "\nTamaño de las Hojas: "+tamanoHoja+
                "\nPrecio: "+precio+
                "\nIdioma: "+idioma);
    }
}
