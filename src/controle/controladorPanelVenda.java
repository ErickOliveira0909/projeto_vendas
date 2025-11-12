package controle;

import visao.PanelVenda;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class controladorPanelVenda implements ActionListener{
    PanelVenda panelVenda;

    public controladorPanelVenda(PanelVenda panelVenda, ArrayList<Produto> produtosCadastrado){
        this.panelVenda = panelVenda;
        addListener();
        
    }

    private void addListener(){
        this.panelVenda.getBotao().addActionListener(this);
    }

    public static void getValoresTextField(Container container, ArrayList<JTextField> textFields) {
        // Foreach que vai passar por cada componente do panel
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                textFields.add((JTextField) component); // Adiciona no array se for TextField
            } else if (component instanceof Container) {
                // Caso o component seja outro container (JLabel), chama a função recursivamente
                // com esse container
                getValoresTextField((Container) component, textFields);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.panelVenda.getBotao()){
            JOptionPane.showMessageDialog(panelVenda, "A venda foi: ", "Valor", JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
