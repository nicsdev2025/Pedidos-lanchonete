import Services.StatusPedido;

public class Main {
    public static void main(String[] args) {

        StatusPedido statusAtual = StatusPedido.RECEBIDO;

        statusAtual.podeCancelar();
    }
}