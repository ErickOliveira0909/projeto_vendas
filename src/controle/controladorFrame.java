package controle;

import javax.swing.JFrame;

import visao.Frame;
import visao.PanelVenda;

public class controladorFrame {
    JFrame frame;
    PanelVenda panelVenda;

    controladorFrame(){
        this.frame = new Frame();
        panelVenda = new PanelVenda();
        this.frame.setContentPane(panelVenda);
        this.frame.repaint();
        this.frame.revalidate();
    }

    public static void main(String[] args) {
        new controladorFrame();
    }
}
