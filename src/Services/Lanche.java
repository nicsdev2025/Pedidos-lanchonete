package Services;

import Controller.ItemCardapio;

import java.util.ArrayList;

public class Lanche extends ItemCardapio {
    private ArrayList<String> adicionais;

    public Lanche(){
    }

    public Lanche(String nome, double precobase){
        super(nome, precobase);

        this.adicionais = new ArrayList<>();
    }

    public void adicionarIngred(String adicional){
        adicionais.add(adicional);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + adicionais.size() * 2.50;
    }

    public void setAdicionais(ArrayList<String> adicionais) {
        this.adicionais = adicionais;
    }
}
