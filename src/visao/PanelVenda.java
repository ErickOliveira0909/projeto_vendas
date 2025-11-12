package visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelVenda extends JPanel{

    JLabel infoCliente, labelInserirProduto1, labelInserirProduto2, labelInserirProduto3, labelProdutosInseridos, labelValorTotal;
    JTextField textFieldInserirProduto1, textFieldInserirProduto2, textFieldInserirProduto3;
    JButton botaoVenda;

    public PanelVenda(){
        super();
        this.setLayout(null);
        this.add(this.getInfoCliente());
        this.add(this.getLabelInserirProduto1());
        this.add(this.getValorTotal());
        this.add(getLabelInserirProduto2());
        this.add(getLabelInserirProduto3());
        this.add(getBotao());

    }

    public JLabel getInfoCliente(){
        if(this.infoCliente == null){
            this.infoCliente = new JLabel();
            this.infoCliente.setBounds(245, 300, 490, 40);
            this.infoCliente.setText("Cliente: \tCPF: \t");
        }
        return this.infoCliente;
    }

    public JLabel getLabelInserirProduto1(){
        if(this.labelInserirProduto1 == null){
            this.labelInserirProduto1 = new JLabel();
            this.labelInserirProduto1.setText("Digite o nome do produto: ");
            this.labelInserirProduto1.setBounds(245, 350, 490, 100);
            this.labelInserirProduto1.add(getTextFieldInserirProduto1());
        }

        return this.labelInserirProduto1;
    }

    public JTextField getTextFieldInserirProduto1(){
        if(this.textFieldInserirProduto1 == null){
            this.textFieldInserirProduto1 = new JTextField();
            this.textFieldInserirProduto1.setBounds(150, 40, 100, 30);
        }
        return this.textFieldInserirProduto1;
    }

    public JLabel getLabelInserirProduto2(){
        if(this.labelInserirProduto2 == null){
            this.labelInserirProduto2 = new JLabel();
            this.labelInserirProduto2.setText("Digite o nome do produto: ");
            this.labelInserirProduto2.setBounds(345, 350, 490, 100);
            this.labelInserirProduto2.add(getTextFieldInserirProduto2());
        }

        return this.labelInserirProduto2;
    }

    public JTextField getTextFieldInserirProduto2(){
        if(this.textFieldInserirProduto2 == null){
            this.textFieldInserirProduto2 = new JTextField();
            this.textFieldInserirProduto2.setBounds(150, 40, 100, 30);
        }
        return this.textFieldInserirProduto2;
    }

    public JLabel getLabelInserirProduto3(){
        if(this.labelInserirProduto3 == null){
            this.labelInserirProduto3 = new JLabel();
            this.labelInserirProduto3.setText("Digite o nome do produto: ");
            this.labelInserirProduto3.setBounds(445, 350, 490, 100);
            this.labelInserirProduto3.add(getTextFieldInserirProduto3());
        }

        return this.labelInserirProduto3;
    }

    public JTextField getTextFieldInserirProduto3(){
        if(this.textFieldInserirProduto3 == null){
            this.textFieldInserirProduto3 = new JTextField();
            this.textFieldInserirProduto3.setBounds(150, 40, 100, 30);
        }
        return this.textFieldInserirProduto3;
    }
    
    public JLabel getValorTotal(){
        if(this.labelValorTotal == null){
            this.labelValorTotal = new JLabel();
            this.labelValorTotal.setBounds(245, 460, 100, 200);
            this.labelValorTotal.setText("Valor total: ");
        }
        return this.labelValorTotal;
    }

    public JButton getBotao(){
        if(this.botaoVenda == null){
            this.botaoVenda = new JButton();
            this.botaoVenda.setBounds(490, 700, 100, 50);
            this.botaoVenda.setText("Concluir venda");
        }

        return this.botaoVenda;
    }

}
