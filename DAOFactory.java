/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class DAOFactory {
    
    private static final JogadorDAO JDAO = new JogadorDAO();
    
    public static JogadorDAO getJogadorDAO(){
        return JDAO;
    }//fecha método
    
    private static final ClubeDAO CDAO = new ClubeDAO();
    
    public static ClubeDAO getClubeDAO(){
        return CDAO;
    }//fecha método

}
