
import Services.Bebida;
import Services.StatusPedido;
import Services.TamanhoBebida;

public class Main {
    public static void main(String[] args) {


        //A parte da bebida
        StatusPedido statusAtual = StatusPedido.RECEBIDO;
        TamanhoBebida tamanho = TamanhoBebida.MEDIO;

        Bebida bebi = new Bebida("Coca-Cola", 6.0, TamanhoBebida.MEDIO);

        System.out.println(bebi.toString());
    }
}