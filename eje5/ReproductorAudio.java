package eje5;

public class ReproductorAudio implements ReproducirMultimedia{
    @Override
    public void reproducir() {
        System.out.println("reproduce musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausea la musica");
    }

    @Override
    public void detener() {
        System.out.println("detiene la musica");
    }

    @Override
    public void rebobinar() {
        System.out.println("reinicia la musica");
    }
}
