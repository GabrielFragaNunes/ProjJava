/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.JogadorVO;
import servicos.JogadorServicos;
import servicos.ServicosFactory;

/**
 *
 * @author João Victor Candido, Gabriel Fraga
 * @since 08/05/2019
 * @version 1.0 Groot
 */ 
    public class GUIManutencaoJogador extends javax.swing.JInternalFrame {
        DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Idade", "Valor passe", "Posição", "Clube Origem", "Clube Atual", "Salario", "Salário Anual"});
        
    /**
     * Creates new form GUIManutencaoJogador
     */
    public GUIManutencaoJogador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jbBuscar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableJogador = new javax.swing.JTable();
        jlManJogadores = new javax.swing.JLabel();
        jlPesquisa = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jcbFiltro = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jtableJogador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtableJogador.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableJogador);

        jlManJogadores.setText("Manutenção Jogadores");

        jlPesquisa.setText("Pesquisa");

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Idade", "Valor passe", "Posição", "Clube origem", "Clube atual", "Salário" }));
        jcbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFiltroItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jlManJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPesquisa)
                .addGap(37, 37, 37)
                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jlManJogadores)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisa)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletarTabela();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jcbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFiltroItemStateChanged
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jcbFiltroItemStateChanged

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterarAtravesTabela();
    }//GEN-LAST:event_jbAlterarActionPerformed
    
    private void preencherTabela() {
        try {
            ArrayList<JogadorVO> jogador = new ArrayList<>();
            JogadorServicos js = ServicosFactory.getJogadorServicos();
            jogador = js.buscarJogador();

            //limparTabela();
            
            for (int i = 0; i < jogador.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(jogador.get(i).getIdJogador()),
                    jogador.get(i).getNome(),
                    String.valueOf(jogador.get(i).getIdade()),
                    String.valueOf(jogador.get(i).getValorPasse()),
                    jogador.get(i).getPosicao(),
                    jogador.get(i).getClubeOrigem(),
                    jogador.get(i).getClubeAtual(),
                    String.valueOf(jogador.get(i).getSalario()),
                    String.valueOf(jogador.get(i).calcularSalarioAnual()),
                });
            }
            jtableJogador.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }
    }// fecha método
    
    private void deletarTabela() {
        try {
            int linha = jtableJogador.getSelectedRow();
            if(linha == -1) {
                JOptionPane.showMessageDialog(
                    this, 
                    "Selecione uma linha para excluir!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }//fecha if
            
            String id = jtableJogador.getValueAt(linha, 0).toString();
            
            JogadorServicos js = ServicosFactory.getJogadorServicos();
            js.deletarJogador(Long.parseLong(id));
            
            JOptionPane.showMessageDialog(this, 
                    "Jogador excluido com sucesso!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Erro!"+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }//fecha catch
    }//fecha método deletar
    
    private void limparTabela() {
        dtm.setNumRows(0);
    }
    
    private void alterarAtravesTabela() {
        try {
            
            int linha = jtableJogador.getSelectedRow();
            String idJogador = jtableJogador.getValueAt(linha, 0).toString();
            String nomeJogador = jtableJogador.getValueAt(linha, 1).toString();
            String idade = jtableJogador.getValueAt(linha, 2).toString();
            String valorPasse = jtableJogador.getValueAt(linha, 3).toString();
            String posicao = jtableJogador.getValueAt(linha, 4).toString();
            String clubeOrigem = jtableJogador.getValueAt(linha, 5).toString();
            String clubeAtual = jtableJogador.getValueAt(linha, 6).toString();
            String salario = jtableJogador.getValueAt(linha, 7).toString();

            JogadorVO j = new JogadorVO();
            j.setIdJogador(Long.parseLong(idJogador));
            j.setNome(nomeJogador);
            j.setIdade(Integer.parseInt(idade));
            j.setValorPasse(Double.parseDouble(valorPasse));
            j.setPosicao(posicao);
            j.setClubeOrigem(clubeOrigem);
            j.setClubeAtual(clubeAtual);
            j.setSalario(Double.parseDouble(salario));

            JogadorServicos js = ServicosFactory.getJogadorServicos();
            js.alterarJogador(j);

            JOptionPane.showMessageDialog(this,
                    "Jogador alterado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro!" + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }//fecha catch
    }// fecha método
    
    private void filtrar() {
        try {
            if(jtPesquisa.getText().isEmpty()) {
                limparTabela();
                preencherTabela();
                return;
            }
            String pesquisa = jtPesquisa.getText();
            String filtro = jcbFiltro.getSelectedItem().toString();
            JogadorServicos js = ServicosFactory.getJogadorServicos();
            ArrayList<JogadorVO> jogs = js.filtrar(pesquisa, filtro);
            
            for(int i=0 ; i<jogs.size() ; i++) {
                dtm.addRow(new String[]{
                    String.valueOf(jogs.get(i).getIdJogador()),
                    jogs.get(i).getNome(),
                    String.valueOf(jogs.get(i).getIdade()),
                    String.valueOf(jogs.get(i).getValorPasse()),
                    String.valueOf(jogs.get(i).getPosicao()),
                    String.valueOf(jogs.get(i).getClubeOrigem()),
                    String.valueOf(jogs.get(i).getClubeAtual()),
                    String.valueOf(jogs.get(i).getSalario()),
                });
            }
            jtableJogador.setModel(dtm);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(
                    this, 
                    "Erro!"+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }//fecha catch
    }//fecha metodo
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JLabel jlManJogadores;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTable jtableJogador;
    // End of variables declaration//GEN-END:variables
}