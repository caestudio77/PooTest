//CLASSE PRODUTO


package ProvaTrabalho;

public class Produto {
	public String nome;
	public String descricao;
	public int preco;
	public Produto() {
	}
	public Produto(String nome, String descricao, int preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	public Produto(){
	}


public void setNome(String nome)
{
    this.nome = nome;
}

public void setDescricao(String descricao)
{
    this.descricao = descricao;
}

public void setPreco(int preco){
    this.preco = preco;
}
}

//SISTEMA CARDAPIO

package ProvaTrabalho;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SistemaCardapio {
	public static void main(String args[])
	{
	    ArrayList<Produto> produtos = new  ArrayList<Produto>();
	    
	    String opcion;
	        
	    boolean use = true;
	    
	    while(use){
	            
	     opcion = JOptionPane.showInputDialog("1.  Inserir \n"
	                                            +"2.  Excluir \n"
	                                            +"3.  Buscar \n"
	                                            +"4.  Listar Produtos \n"
	                                            +"5.  Modificar \n"
	                                            +"6.  Eliminar tudo \n"
	                                            +"7.  Sair \n");
	     
	     String listado = "";  
	     
	     switch(opcion){
	           
	      case "1":
	                  
	               String nome = JOptionPane.showInputDialog("Insira o nome do produto ");
	                          
	               String  descricao = JOptionPane.showInputDialog("Insira a descrição ");
	                          
	               int  preco = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor"));
	               
	               produtos.add(new Produto(nome, descricao, preco)); 
	               
	               for( int i = 0 ; i  < produtos.size(); i++)
	                   {
	                     listado += (i+1)+ "º- " + " PRODUTO:    " + produtos.get(i).nome 
	                            
	                                           + "\n" + "       DESCRIÇÃO:   " +  produtos.get(i).descricao 
	                            
	                                           + "\n" + "       PREÇO:     " +  produtos.get(i).preco + "\n\n";  
	                   }
	                    JOptionPane.showMessageDialog(null, listado); 
	                          
	               break;
	          
	      case "2":
	            
	              String excluir_produto = JOptionPane.showInputDialog("Insira o nome do produto ");
	               
	              for(int i=0; i<produtos.size(); i++)
	              {
	               if(produtos.get(i).nome.equals(excluir_produto))
	                                
	                 produtos.remove(i);
	              }  
	              
	               for( int i = 0 ; i  < produtos.size(); i++)
	                   {
	                     listado += (i+1)+ "º- " + " PRODUTO:    " + produtos.get(i).nome 
	                            
	                                           + "\n" + "       DESCRIÇÃO:   " +  produtos.get(i).descricao 
	                            
	                                           + "\n" + "       PREÇO:     " +  produtos.get(i).preco + "\n\n";  
	                   }
	                    JOptionPane.showMessageDialog(null, listado); 
	                    
	                break; 
	     
	      case "3":
	                   
	               String resultado_busca  = "Nome não encontrado"; 
	                          
	               String nome_busca = JOptionPane.showInputDialog("Insira o nome para buscar ");
	                         
	               for( int i = 0 ; i  < produtos.size(); i++)
	                {
	                  if(produtos.get(i).nome.equals(nome_busca))
	                    {
	                	  resultado_busca  ="";
	                                
	                	  resultado_busca += " PRODUTO:    " + produtos.get(i).nome 
	                             
	                                           + "\n" + " DESCRIÇÃO:   " +  produtos.get(i).descricao 
	                             
	                                           + "\n" + " PREÇO:     " +  produtos.get(i).preco;                                
	                     }                        
	                 }
	                     JOptionPane.showMessageDialog(null, resultado_busca);
	                         
	                     break; 
	          
	      case "4":
	                    
	                if(!produtos.isEmpty())
	                 {
	                   for( int i = 0 ; i  < produtos.size(); i++)
	                   {
	                    listado += (i+1)+ "º- " + " PRODUTO:    " + produtos.get(i).nome 
	                            
	                                           + "\n" + "       DESCRIÇÃO:   " +  produtos.get(i).descricao 
	                            
	                                           + "\n" + "       PREÇO:     " +  produtos.get(i).preco + "\n\n";  
	                   }
	                    JOptionPane.showMessageDialog(null, listado); 
	                    
	                 }else{
	                        JOptionPane.showMessageDialog(null, "            LISTA  VAZIA ", "", JOptionPane.WARNING_MESSAGE); 
	                      }
	                
	                break; 

	      case "5":
	                   
	                 String produto_modificar = JOptionPane.showInputDialog("Insira o nome do produto para modificar");
	                          
	                 String nome_novo = JOptionPane.showInputDialog("Insira o novo nome ");
	                 
	                 String descricao_nova = JOptionPane.showInputDialog("Insir uma nova descrição ");
	                 
	                 int preco_novo = Integer.parseInt(JOptionPane.showInputDialog("Insira o preço novo "));
	                 
	                 for(int i=0; i<produtos.size(); i++)
	                  {
	                   if(produtos.get(i).nome.equals(produto_modificar))
	                    {
	                	   produtos.get(i).setNome(nome_novo);
	                     
	                	   produtos.get(i).setDescricao(descricao_nova);
	                     
	                	   produtos.get(i).setPreco(preco_novo);
	                     
	                     listado += " PRODUTO:    " + produtos.get(i).nome 
	                             
	                                           + "\n" + " DESCRIÇÃO:   " +  produtos.get(i).descricao 
	                             
	                                           + "\n" + " PREÇO:     " +  produtos.get(i).preco;
	                     
	                     JOptionPane.showMessageDialog(null, listado);
	                     }
	                   }
	                 
	                  break;
 
	       case "6":
	                   
	                 produtos.clear();
	                 
	                 JOptionPane.showMessageDialog(null, "            LISTA  VAZIA ", "", JOptionPane.WARNING_MESSAGE); 
	                     
	                 break;

	      case "7":
	                   
	                 use = false;
	                     
	                 break;
	                    
	      default: 
	                   
	               JOptionPane.showMessageDialog(null, "Opção Invalida ");
	               
	               break;
	           }      
	       }
	   }
	}



