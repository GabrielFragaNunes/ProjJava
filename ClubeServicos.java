/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.ClubeDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ClubeVO;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class ClubeServicos {
    
    /**
     * 
     * @param cVO Objeto proveniente da interface
     * @throws SQLException Lançando exceção de SQL 
     */
    
    public void cadastrarClube(ClubeVO cVO) throws SQLException {
        ClubeDAO cDAO = DAOFactory.getClubeDAO();
        cDAO.cadastrarClube(cVO);
    }// fecha método
    
    /**
     * 
     * @return Retornando um Array contendo todos os jogadores do banco de dados.
     * @throws SQLException Lançando exceção de SQL 
     */
    
    public ArrayList<ClubeVO> buscarClube() throws SQLException {
        ClubeDAO cDAO = DAOFactory.getClubeDAO();
        return cDAO.buscarClube();
    }// fecha método
    
    public void deletarClube(long idClube) throws SQLException {
        ClubeDAO cDAO = DAOFactory.getClubeDAO();
        cDAO.deletarClube(idClube);
    }//fecha método
    
    public ArrayList<ClubeVO> filtrar(String pesquisa, String filtro) throws SQLException {
         ClubeDAO cDAO = DAOFactory.getClubeDAO();
         return cDAO.filtar(pesquisa, filtro);
     }// fecha método
    
    public void alterarClube(ClubeVO cVO) throws SQLException {
        ClubeDAO cDAO = DAOFactory.getClubeDAO();
        cDAO.alterarClube(cVO);
    }//fecha método
    
}// fecha classe
