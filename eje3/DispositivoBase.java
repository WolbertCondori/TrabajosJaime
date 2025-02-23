package eje3;

public abstract class DispositivoBase implements DispositivoCasa{
    String funcion;

    public DispositivoBase() {
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public abstract void apagar();

    @Override
    public abstract void encender();

    @Override
    public abstract void estado();
}
