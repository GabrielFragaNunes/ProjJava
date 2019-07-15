/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.JogadorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.JogadorVO;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class JogadorServicos {
    
    /**
     * 
     * @param jVO Objeto proveniente da interface
     * @throws SQLException Lançando exceção de SQL
     */
    public void cadastrarJogador(JogadorVO jVO) throws SQLException {
        JogadorDAO jDAO = DAOFactory.getJogadorDAO();
        jDAO.cadastrarJogador(jVO);
    }// fecha método
    
    /**
     * 
     * @return Retornando um Array contendo todos os jogadores do banco de dados.
     * @throws SQLException Lançando exceção de SQL
     */ 
public ArrayList<JogadorVO> buscarJogador() throws SQLException {
        JogadorDAO jDAO = DAOFactory.getJogadorDAO();
        return jDAO.buscarJogador();
    }// fecha método
    
     public void deletarJogador(long idJogador) throws SQLException {
        JogadorDAO pDAO = DAOFactory.getJogadorDAO();
        pDAO.deletarJogador(idJogador);
    }//fecha método
    
     public ArrayList<JogadorVO> filtrar(String pesquisa, String filtro) throws SQLException {
         JogadorDAO jDAO = DAOFactory.getJogadorDAO();
         return jDAO.filtar(pesquisa, filtro);
     }// fecha método
     
     public void alterarJogador(JogadorVO jVO) throws SQLException {
        JogadorDAO jDAO = DAOFactory.getJogadorDAO();
        jDAO.alterarJogador(jVO);
    }//fecha método
     
}// fecha classe
