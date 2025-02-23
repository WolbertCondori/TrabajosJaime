package eje2;

public class ClaseCalculadoraSimple implements OperacionesCal{
    ClaseSuma suma = new ClaseSuma();
    ClaseResta resta = new ClaseResta();
    ClaseDivision division = new ClaseDivision();
    ClaseMultiplicacion multiplicacion = new ClaseMultiplicacion();

    public ClaseCalculadoraSimple() {
    }

    @Override
    public void suma(int n1, int n2) {
        suma.Operacion(n1, n2);

    }

    @Override
    public void resta(int n1, int n2) {
        resta.Operacion(n1,n2);
    }

    @Override
    public void division(int n1, int n2) {
        division.Operacion(n1,n2);
    }

    @Override
    public void multiplicacion(int n1, int n2) {
        division.Operacion(n1,n2);
    }
}
