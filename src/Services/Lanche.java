package Services;

import Controller.ItemCardapio;

import java.util.ArrayList;

public class Lanche extends ItemCardapio {
    private ArrayList<String> adicionais;

    public Lanche(String nome, double precobase){
        super(nome, precobase);

        ArrayList<String> adicionais = new ArrayList<>();
    }

    public void adicionarIngred(String item){
        adicionais.add("");
    }

    @Override
    public double calcularPreco() {
        return 0;
    }

    public void setAdicionais(ArrayList<String> adicionais) {
        this.adicionais = adicionais;
    }
}
