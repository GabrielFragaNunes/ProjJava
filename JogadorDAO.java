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
import modelo.JogadorVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class JogadorDAO {
    
    public void cadastrarJogador(JogadorVO j) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "";
            sql = "insert into Jogador (idJogador, nomeJogador, idade, valorPasse, posicao, clubeOrigem, clubeAtual, salario)"
                 +"values(null, '"+j.getNome()+"', "+j.getIdade()+", "+j.getValorPasse()+", '"+j.getPosicao()+"', '"+j.getClubeOrigem()+"', '"+j.getClubeAtual()+"', "+j.getSalario()+")";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }// fecha finally 
    }// fecha cadastrar 
    
    public ArrayList<JogadorVO> buscarJogador() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql;
            
            sql = "select * from Jogador";
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<JogadorVO> jog = new ArrayList<>();
            
            while(rs.next()) {
                JogadorVO j = new JogadorVO();
                
                j.setIdJogador(rs.getLong("idjogador"));
                j.setNome(rs.getString("nomeJogador"));
                j.setIdade(rs.getInt("idade"));
                j.setValorPasse(rs.getDouble("valorPasse"));
                j.setPosicao(rs.getString("posicao"));
                j.setClubeOrigem(rs.getString("clubeOrigem"));
                j.setClubeAtual(rs.getString("clubeAtual"));
                j.setSalario(rs.getDouble("salario"));
                
                jog.add(j);
            }// fecha while
            return jog; 
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar jogadores! " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }// fecha finally
    }// fecha buscar
    
    public void deletarJogador(long idJogador) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "delete from jogador where idjogador =" +idJogador;
            stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir jogador! " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }// fecha finally
    }// fecha deletar
    
    public ArrayList<JogadorVO> filtar(String pesquisa, String filtro) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            String sql = "select * from jogador ";
            if(filtro.equalsIgnoreCase("nome")) {
                sql += "where nomeJogador like '%"+pesquisa+"%'";
            }else if(filtro.equalsIgnoreCase("Código")) {
                sql += "where idJogador = "+pesquisa;
            }else if(filtro.equalsIgnoreCase("Idade")) {
                sql += "where idade = "+pesquisa;
            }else if(filtro.equalsIgnoreCase("Valor passe")) {
                sql += "where valorPasse = "+pesquisa;
            }else if(filtro.equalsIgnoreCase("Posição")) {
                sql += "where posicao like '%"+pesquisa+"%'";
            }else if(filtro.equalsIgnoreCase("Clube origem")) {
                sql += "where clubeOrigem like '%"+pesquisa+"%'";
            }else if(filtro.equalsIgnoreCase("Clube atual")) {
                sql += "where clubeAtual like '%"+pesquisa+"%'";
            }else if(filtro.equalsIgnoreCase("Salário")) {
                sql += "where salario ="+pesquisa;
            }
            ResultSet rs = stat.executeQuery(sql);
            
            ArrayList<JogadorVO> jog = new ArrayList<>();
            
            while(rs.next()) {
                JogadorVO j = new JogadorVO();
                
                j.setIdJogador(rs.getLong("idjogador"));
                j.setNome(rs.getString("nomeJogador"));
                j.setIdade(rs.getInt("idade"));
                j.setValorPasse(rs.getDouble("valorPasse"));
                j.setPosicao(rs.getString("posicao"));
                j.setClubeOrigem(rs.getString("clubeOrigem"));
                j.setClubeAtual(rs.getString("clubeAtual"));
                j.setSalario(rs.getDouble("salario"));
                
                jog.add(j);
            }// fecha while
            return jog;
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao filtrar jogadores! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }// fecha finally
    }// fecha filtar
    
    public void alterarJogador(JogadorVO j) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try {
            
            String sql = "update jogador set nomeJogador='"+j.getNome()+"',"
                       + "idade = " + j.getIdade()+","
                       + "valorPasse = " + j.getValorPasse()+","
                       + "posicao = " + j.getPosicao()+","
                       + "clubearigem = " + j.getClubeOrigem()+","
                       + "clubeatual = " + j.getClubeAtual()+","
                       + "salario = " + j.getSalario()+"" + "where idJogador= " +j.getIdJogador();
            
            stat.executeUpdate(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao atualizar jogador! "+e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }// fecha alterar
}// fecha classe
