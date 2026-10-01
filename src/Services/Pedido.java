package Services;

import Controller.Desconto;
import Controller.ItemCardapio;

import java.util.ArrayList;

public class Pedido  {

    ArrayList<ItemCardapio> pedido = new ArrayList<>();


    StatusPedido status = StatusPedido.RECEBIDO;
}
