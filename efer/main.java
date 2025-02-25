package efer;

public class main {
    public static void main(String[] args) {
        Cuaderno cuaderno = new Cuaderno();
        Novela novela = new Novela();
        novela.setAutor("awa");
        novela.mostrarDatos();
        novela.leer();
    }
}
