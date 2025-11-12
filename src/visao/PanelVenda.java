package visao;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelVenda extends JPanel{

    JLabel infoCliente, labelInserirProduto, labelProdutosInseridos, labelValorTotal;
    JTextField textFieldInserirProduto;

    public PanelVenda(){
        super();
        this.setLayout(null);
        this.add(this.getInfoCliente());
        this.add(this.getLabelInserirProduto());
        this.add(this.getValorTotal());
    }

    public JLabel getInfoCliente(){
        if(this.infoCliente == null){
            this.infoCliente = new JLabel();
            this.infoCliente.setBounds(245, 300, 490, 40);
            this.infoCliente.setText("Cliente: \tCPF: \t");
        }
        return this.infoCliente;
    }

    public JLabel getLabelInserirProduto(){
        if(this.labelInserirProduto == null){
            this.labelInserirProduto = new JLabel();
            this.labelInserirProduto.setText("Digite o nome do produto: ");
            this.labelInserirProduto.setBounds(245, 350, 490, 100);
            this.labelInserirProduto.add(getTextFieldInserirProduto());
        }

        return this.labelInserirProduto;
    }

    public JTextField getTextFieldInserirProduto(){
        if(this.textFieldInserirProduto == null){
            this.textFieldInserirProduto = new JTextField();
            this.textFieldInserirProduto.setBounds(150, 40, 100, 30);
        }
        return this.textFieldInserirProduto;
    }
    
    public JLabel getValorTotal(){
        if(this.labelValorTotal == null){
            this.labelValorTotal = new JLabel();
            this.labelValorTotal.setBounds(245, 460, 100, 200);
            this.labelValorTotal.setText("Valor total: ");
        }
        return this.labelValorTotal;
    }

}
