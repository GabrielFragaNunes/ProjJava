/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 06/05/2019 - 16:27
 * @version 1.0 Groot
 */
public class JogadorVO {
    private long idJogador;
    private String nome;
    private int idade;
    private double valorPasse;
    private String posicao;
    private String clubeOrigem;
    private String clubeAtual;
    private double salario;

    /**
     * @param construtor vazio
     */
    public JogadorVO() {
    }

    /**
     * 
     * @param idJogador informa 
     * @param nome informa o nome do jogador
     * @param idade informa a idade do jogador
     * @param valorPasse informa o valor que o jogador foi vendido
     * @param posicao informa a posição que o jogador atua
     * @param clubeOrigem informa o clube origem
     * @param clubeAtual informa o clube atual do jogador
     */
    public JogadorVO(long idJogador, String nome, int idade, double valorPasse, String posicao, String clubeOrigem, String clubeAtual) {
        this.idJogador = idJogador;
        this.nome = nome;
        this.idade = idade;
        this.valorPasse = valorPasse;
        this.posicao = posicao;
        this.clubeOrigem = clubeOrigem;
        this.clubeAtual = clubeAtual;
    }

    public long getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(long idJogador) {
        this.idJogador = idJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPasse() {
        return valorPasse;
    }

    public void setValorPasse(double valorPasse) {
        this.valorPasse = valorPasse;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getClubeOrigem() {
        return clubeOrigem;
    }

    public void setClubeOrigem(String clubeOrigem) {
        this.clubeOrigem = clubeOrigem;
    }

    public String getClubeAtual() {
        return clubeAtual;
    }

    public void setClubeAtual(String clubeAtual) {
        this.clubeAtual = clubeAtual;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /**
     * 
     * @return calcula o salário anual 
     */
    public double calcularSalarioAnual() {
        return salario * 12;
    }
    
    @Override
    public String toString() {
        return "idJogador = " + idJogador 
             + "\nNome = " + nome 
             + "\nIdade = " + idade 
             + "\nValor do Passe = " + valorPasse 
             + "\nPosição = " + posicao  
             + "\nClube de Origem = " + clubeOrigem 
             + "\nClube Atual = " + clubeAtual
             + "\nSalário = " + salario
             + "\nSalário anual = "+ calcularSalarioAnual();
    }// fecha toString
}// fecha classe
