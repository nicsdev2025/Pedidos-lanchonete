
import Services.Bebida;
import Services.Lanche;
import Services.StatusPedido;
import Services.TamanhoBebida;

public class Main {
    public static void main(String[] args) {

        Lanche lan = new Lanche("Hamburguer", 25.00);
        lan.adicionarIngred("Bacon");
    }
}