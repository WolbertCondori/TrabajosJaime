package eje3;

public class Luz extends DispositivoBase{


    public Luz(String funcion) {
        super(funcion);
        this.apagado=true;
    }

    @Override
    public void apagar() {
        System.out.println("luz apagada");
        this.encendido=false;
        this.apagado=true;
    }

    @Override
    public void encender() {
        System.out.println("luz encendida");
        this.apagado=false;
        this.encendido=true;
    }

    @Override
    public void estado() {
        System.out.println(" APAGADO: "+apagado+
                "\n ENCEDIDO: "+encendido+
                "\n FUNCION: "+funcion);
    }
}
