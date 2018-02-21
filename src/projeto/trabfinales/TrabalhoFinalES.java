package projeto.trabfinales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class TrabalhoFinalES {
    
    private static String [] CNDQP = new String[5];

    public static void main(String[] args) throws IOException {
        File arq = new File ("Produtos.txt"); //objeto arq representa o arquivo ou diretório mas não garante que ele existe"
        Produto novo;
        
        TelaPrincipal teste = new TelaPrincipal();
        DefaultTableModel Prod = (DefaultTableModel) TelaPrincipal.tabProdutos.getModel();
        
        if (!arq.exists()) {
            try{ 
                if( arq.createNewFile() ){
                    System.out.println("O arquivo foi criado"); 
                }else{ 
                    System.out.println("O arquivo não foi criado"); 
                }
            }catch(IOException e) {
                
            }
        }else{
            FileReader fr = null;
            try {
                fr = new FileReader(arq);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TrabalhoFinalES.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader StrR = new BufferedReader(fr);
            
                String Str;
                String[] TableLine;
                int i = 0;
                //Essa estrutura do looping while é clássica para ler cada linha
                //do arquivo
                
                while ((Str = StrR.readLine())!= null) {
                    //Aqui usamos o método split que divide a linha lida em um array de String
                    //passando como parametro o divisor .
                    TableLine = Str.split("\\|");
                    //O foreach é usadao para imprimir cada célula do array de String.
                    for (String cell : TableLine) {
                        CNDQP[i] = cell;
                        if(i<4)
                            i++;
                    }
                    novo = new Produto(CNDQP[0],CNDQP[1],CNDQP[2],Integer.parseInt(CNDQP[3]),Double.parseDouble(CNDQP[4]));
                    TelaPrincipal.p.addProduto(novo);
                    
                    Object[] dados = {CNDQP[0],CNDQP[1],CNDQP[2],CNDQP[3],"R$ "+CNDQP[4]};
                    Prod.addRow(dados);
                    
                    i = 0;
                }
                //Fechamos o buffer
            }
        teste.setVisible(true);
        
    }
    
}
