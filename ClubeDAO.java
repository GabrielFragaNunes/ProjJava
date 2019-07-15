/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ClubeVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class ClubeDAO {
    
    public void cadastrarClube(ClubeVO c) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "";
            sql = "insert into Clube (idClube, nomeClube, ranking, tecnico, orcamento, liga)"
                 +"values(null, '"+c.getNomeClube()+"', "+c.getRanking()+", '"+c.getTecnico()+"', '"+c.getOrcamento()+"', '"+c.getLigaClube()+"')";   
        
            
            stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }// fecha finally  
    }// fecha cadastrar
    
    public ArrayList<ClubeVO> buscarClube() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from clube";
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<ClubeVO> clu = new ArrayList<>();
            
            while(rs.next()) {
                ClubeVO c = new ClubeVO();
                
                c.setIdClube(rs.getLong("idClube"));
                c.setNomeClube(rs.getString("nomeClube"));
                c.setRanking(rs.getInt("ranking"));
                c.setTecnico(rs.getString("tecnico"));
                c.setOrcamento(rs.getDouble("orcamento"));
                c.setLigaClube(rs.getString("liga"));
               
                clu.add(c);
            }// fecha while
            return clu; 
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar clubes! " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }// fecha finally
    }// fecha buscar
    
    public void deletarClube(long idClube) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from clube where idclube =" +idClube;
            stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir clube! " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }// fecha finally
    }// fecha deletar
    
    public ArrayList<ClubeVO> filtar(String pesquisa, String filtro) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from clube ";
            if(filtro.equalsIgnoreCase("nome")) {
                sql += "where nomeClube like '%"+pesquisa+"%'";
            }else if(filtro.equalsIgnoreCase("Código")) {
                sql += "where idClube = "+pesquisa;
            }else if(filtro.equalsIgnoreCase("Ranking")) {
                sql += "where ranking = "+pesquisa;
            }else if(filtro.equalsIgnoreCase("Técnico")) {
                sql += "where tecnico like '%"+pesquisa+"%'";
            }else if(filtro.equalsIgnoreCase("Orçamento")) {
                sql += "where orcamento = "+pesquisa;
            }else if(filtro.equalsIgnoreCase("Liga")) {
                sql += "where liga like '%"+pesquisa+"%'";
            }
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<ClubeVO> clu = new ArrayList<>();
            
            while(rs.next()) {
                ClubeVO c = new ClubeVO();
                
                c.setIdClube(rs.getLong("idClube"));
                c.setNomeClube(rs.getString("nomeClube"));
                c.setRanking(rs.getInt("ranking"));
                c.setTecnico(rs.getString("tecnico"));
                c.setOrcamento(rs.getDouble("orcamento"));
                c.setLigaClube(rs.getString("liga"));
                
                
                clu.add(c);
            }// fecha while
            return clu;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar clubes! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }// fecha finally
    }// fecha filtar
    
    public void alterarClube(ClubeVO c) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            
            String sql = "update clube set nome='"+c.getNomeClube()+"',"
                       + "liga = " + c.getLigaClube()+","
                       + "ranking = " + c.getRanking()+","
                       + "orcamento = " + c.getOrcamento()+","
                       + "tecnico = " + c.getTecnico()+","
                       +" where idclube=" +c.getIdClube();
            
            stat.executeUpdate(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar clube! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }// fecha alterar
    
}// fecha classe