package Services;

public enum TamanhoBebida  {
    PEQUENO(1.0),
    MEDIO(1.3),
    GRANDE(1.6);

    private final double multiplicador;

    TamanhoBebida(double multiplicador){
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador(){
        return this.multiplicador;
    }
}
