package projeto.trabfinales;

import java.util.ArrayList;

public class Produtos {
    
    private static ArrayList <Produto> produto;

    public Produtos() {
        
        this.produto = new ArrayList<Produto>();
    }

    /**
     * @return the produto
     */
    public ArrayList <Produto> getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(ArrayList <Produto> produto) {
        this.produto = produto;
    }
    
    public void addProduto(Produto novo){
        produto.add(novo);
    }
    
    public static int procuraCod(String pesquisa){
        
        for(int i=0; i<produto.size(); i++){
            if(produto.get(i).getCodigo().equals(pesquisa))
                return i;
        }
        
        return -1;
    
    }
    public static int procuraNom(String pesquisa){
        
        for(int i=0; i<produto.size(); i++){
            if(produto.get(i).getNome().equals(pesquisa))
                return i;
        }
        
        return -1;
    
    }

    @Override
    public String toString() {
        return "Produtos: \n" + produto.toString();
    }
    
    
}
