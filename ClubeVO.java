/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 07/05/2019
 * @version 1.0 Groot
 */
public class ClubeVO {
    private long idClube;
    private String nomeClube;
    private String ligaClube;
    private int ranking;
    private double orcamento;
    private String tecnico;

    /**
     * @param construtor vazio
     */
    public ClubeVO() {
    }
    
    /**
     * 
     * @param idClube recebe o código do clube
     * @param nomeClube recebe o nome do clube
     * @param ligaClube recebe a liga em que disputa
     * @param ranking recebe o ranking do clube
     * @param orcamento recebe o orcamento do clube
     * @param tecnico recebe o nome do tecnico
     */
    public ClubeVO(long idClube, String nomeClube, String ligaClube, int ranking, double orcamento, String tecnico) {
        this.idClube = idClube;
        this.nomeClube = nomeClube;
        this.ligaClube = ligaClube;
        this.ranking = ranking;
        this.orcamento = orcamento;
        this.tecnico = tecnico;
    }

    public long getIdClube() {
        return idClube;
    }

    public void setIdClube(long idClube) {
        this.idClube = idClube;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getLigaClube() {
        return ligaClube;
    }

    public void setLigaClube(String ligaClube) {
        this.ligaClube = ligaClube;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "\nidClube " + idClube 
                +"\nNome do clube = " + nomeClube
                + "\nliga = " + ligaClube
                + "\nRanking = " + ranking
                + "\nOrçamento = " + orcamento
                + "\nTécnico = " + tecnico;
    }// fecha toString
}// fecha classe