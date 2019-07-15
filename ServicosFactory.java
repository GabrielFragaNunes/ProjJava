/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicos;

/**
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class ServicosFactory {
    
   private static final JogadorServicos JS = new JogadorServicos();

   public static JogadorServicos getJogadorServicos(){
       
       return JS;                                
   }//fecha metodo
   
   private static final ClubeServicos CS = new ClubeServicos();

   public static ClubeServicos getClubeServicos(){
       
       return CS;                                
   }//fecha metodo
    
}//fecha classe
