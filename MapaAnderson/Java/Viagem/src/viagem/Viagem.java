/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viagem;

import javax.swing.JOptionPane;


public class Viagem {
    
    public static void main(String[] args) {
        
        Cidade cidade = new Cidade();
        Rota rota = new Rota();        
        
        cidade.setNome(JOptionPane.showInputDialog("Cidade de Partida"));
        rota.setInicio(cidade.nome);
        
        rota.setDestino(JOptionPane.showInputDialog("Cidade Destino?"));
        
        
        
        System.out.println(cidade.getNome());
        System.out.println(rota.inicio);
        
    }
    
}
