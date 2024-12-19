package task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaInicial extends JPanel {
    
    private JButton criarBotaoStatus(String texto) {
        JButton botao = new JButton(texto);

        botao.setPreferredSize(new Dimension(150, 25));
        botao.setBackground(Color.WHITE);

        return botao;
    }
    
    public TelaInicial () {
        setLayout(new BorderLayout());

        JPanel statusBotoes = new JPanel();

        statusBotoes.add(criarBotaoStatus("EM PROGRESSO"));
        statusBotoes.add(criarBotaoStatus("EM ESPERA"));
        statusBotoes.add(criarBotaoStatus("CONCLUÍDO"));
        statusBotoes.add(criarBotaoStatus("TUDO"));
        statusBotoes.setBorder(new EmptyBorder(20, 20, 20, 20));

        add(statusBotoes, BorderLayout.NORTH);
        add(new ListaTarefas(), BorderLayout.CENTER);
        
        setPreferredSize(new Dimension(980, 720));
    }
}
