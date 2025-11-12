package controle;

import javax.swing.JFrame;

import visao.Frame;

public class controladorFrame {
    JFrame frame;

    controladorFrame(){
        this.frame = new Frame();
    }

    public static void main(String[] args) {
        new controladorFrame();
    }
}
