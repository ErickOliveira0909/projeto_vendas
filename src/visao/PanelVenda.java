package visao;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelVenda extends JPanel{

    JLabel infoCliente, labelInserirProduto, labelProdutosInseridos, labelValorTotal;
    JTextField textFieldInserirProduto;

    public PanelVenda(){
        super();

    }

    public JLabel getInfoCliente(){
        if(this.infoCliente == null){
            this.infoCliente = new JLabel();
            this.infoCliente.setBounds(245, 300, 490, 40);
        }
        return this.infoCliente;
    }

}
