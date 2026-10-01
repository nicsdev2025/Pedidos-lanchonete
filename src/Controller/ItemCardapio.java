package Controller;


public abstract class ItemCardapio {
    private String nome;
    private double precoBase;

    public ItemCardapio(){
    }

    public ItemCardapio(String nome, double precoBase){
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco();

    public String getDescricao(){
        return "O seu pedido é o " + this.nome + "e o preço dele é: " + this.precoBase;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }


}
