package Services;

public enum StatusPedido {
    RECEBIDO ("O pagamento do pedido foi recebido com sucesso!"),
    EM_PREPARO ("O pedido está sendo preparado"),
    PRONTO ("O pedido está pronto! :)"),
    ENTREGUE ("Ebaa! Seu pedido foi entregue!"),
    CANCELADO ("Seu pedido foi cancelado! :(");


    public final String status;

    StatusPedido(String status){
        this.status = status;
    }


    public void podeCancelar(){
        boolean b = this == ENTREGUE || this == CANCELADO;

        if (this == ENTREGUE){
            System.out.println("O pedido já foi entregue, então não será possível cancelá-lo");
        }else if (this == CANCELADO){
            System.out.println("Seu pedido já foi cancelado!");
        }else {
            System.out.println("Você pode cancelar seu pedido!");
        }
    }


}
