package Services;

import Controller.ItemCardapio;

public class Bebida extends ItemCardapio {
    private final TamanhoBebida tamanho;

    public Bebida(String nome, double precoBase, TamanhoBebida tamanho){
        super(nome, precoBase);
        this.tamanho = tamanho;

    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * tamanho.getMultiplicador();
    }
}
