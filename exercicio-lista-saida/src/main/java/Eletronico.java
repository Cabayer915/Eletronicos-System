public class Eletronico {
    private int id;
    private int anoGarantia;
    private String nome;
    private double preco;
    private String marca;
    private boolean ativo;
    private int anoFabricacao;

    // Construtor
    public Eletronico(int id, int anoGarantia, String nome, double preco, String marca, boolean ativo, int anoFabricacao) {
        this.id = id;
        this.anoGarantia = anoGarantia;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.ativo = ativo;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnoGarantia() {
        return anoGarantia;
    }

    public void setAnoGarantia(int anoGarantia) {
        this.anoGarantia = anoGarantia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método toString()
    @Override
    public String toString() {
        return String.format("%-3d | %-20s | %-4d | %-10.1f | %-20s | %-8b | %-4d",
                id, nome, anoGarantia, preco, marca, ativo, anoFabricacao);
    }
}