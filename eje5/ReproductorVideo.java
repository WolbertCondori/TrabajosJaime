package eje5;

public class ReproductorVideo implements ReproducirMultimedia{
    @Override
    public void reproducir() {
        System.out.println("reproduce video");
    }

    @Override
    public void pausar() {
        System.out.println("pausa video");
    }

    @Override
    public void detener() {
        System.out.println("detiene video");
    }

    @Override
    public void rebobinar() {
        System.out.println("rebobina video");
    }
}
