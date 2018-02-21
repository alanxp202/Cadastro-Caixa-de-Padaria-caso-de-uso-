package projeto.trabfinales;

public class Produto {
    
    private String Codigo;
    private String Nome;
    private String Descrição;
    private int Quantidade;
    private Double Valor;

    public Produto(String Codigo, String Nome, String Descrição, int Quantidade, Double Valor) {
        
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Descrição = Descrição;
        this.Quantidade = Quantidade;
        this.Valor = Valor;
   
    }

    /**
     * @return the Codigo
     */
    public String getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Descrição
     */
    public String getDescrição() {
        return Descrição;
    }

    /**
     * @param Descrição the Descrição to set
     */
    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    /**
     * @return the Valor
     */
    public Double getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
    @Override
    public String toString() {
        return "Codigo: " + Codigo + " Nome: " + Nome + " Descrição: " + Descrição +" Quantidade: "+Quantidade+" Valor: " + Valor+"\n";
    }
}
