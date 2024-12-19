// javac src/task/*.java -d bin && java -cp bin task.Main

package task;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;

public class Main extends JFrame {
    JPanel westPanel;
    JPanel centerPanel;
    CardLayout cardLayout;

    public Main () {
        // Mudando o Layout
        setLayout(new BorderLayout());

        westPanel = new MenuBar();
        centerPanel = new JPanel();
        centerPanel.setLayout(new CardLayout());
        centerPanel.add(new TelaInicial(), "TelaInicial");

        //Adicionando os Paineis
        add(westPanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
        
        // Exibindo a Tela
        setTitle("Tarefas");
        setSize(1080, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        
        new Main();
        
    }
}

