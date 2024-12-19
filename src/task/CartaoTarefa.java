package task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class CartaoTarefa{
    Tarefa tarefa;

    // Função para criar um botão com imagem a partir do caminho
    private JButton criarBotaoMenu(String imagePath) {
        ImageIcon icone = new ImageIcon(imagePath);

        // Redimensiona a imagem
        Image imagem = icone.getImage();
        Image imgemRedimensionada = imagem.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        icone = new ImageIcon(imgemRedimensionada);

        // Cria o botão com a imagem
        JButton botao = new JButton(icone);

        botao.setBorder(new EmptyBorder(15 ,15, 15, 15));
        botao.setFocusPainted(false);

        // Alterar Background
        botao.setBackground(Color.WHITE);

        return botao;
    }

    private JPanel criarPainelWest () {
        JPanel panel = new JPanel();

        panel.setBackground(Color.BLACK);
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(15 ,15, 15, 15));

        JLabel dia = new JLabel(String.valueOf(tarefa.getDataFinal().getDayOfMonth()));
        dia.setAlignmentX(Component.CENTER_ALIGNMENT);
        dia.setFont(new Font("Arial", Font.BOLD, 45));
        dia.setForeground(Color.WHITE);

        JLabel mes = new JLabel(String.valueOf(tarefa.getDataFinal().getMonth()));
        mes.setAlignmentX(Component.CENTER_ALIGNMENT);
        mes.setFont(new Font("Arial", Font.PLAIN, 10));
        mes.setForeground(Color.WHITE);

        panel.add(dia);
        panel.add(mes);

        return panel;
    }

    private JPanel criarPainelCenter () {
        JPanel panel = new JPanel();

        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(580, 100));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(new EmptyBorder(20 ,20, 20, 20));

        JLabel titulo = new JLabel(String.valueOf(tarefa.getTitulo()));
        titulo.setFont(new Font("Arial", Font.BOLD, 35));

        JLabel descricao = new JLabel(String.valueOf(tarefa.getDescricao()));
        descricao.setFont(new Font("Arial", Font.PLAIN, 15));

        panel.add(titulo);
        panel.add(descricao);

        return panel;
    }

    private JPanel criarPainelEast () {
        JPanel panel = new JPanel();

        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(200, 100));
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(criarBotaoMenu("src\\task\\check-mark.png"));
        panel.add(criarBotaoMenu("src\\task\\editing.png"));
        panel.add(criarBotaoMenu("src\\task\\trash.png"));


        return panel;
    }
    
    public JPanel criarCartaoProgresso() {
        JPanel progresso = new JPanel();
        
        progresso.setLayout(new BorderLayout());

        JPanel westPanel = criarPainelWest();
        JPanel centerPanel = criarPainelCenter();
        JPanel eastPanel = criarPainelEast();
        
        progresso.setPreferredSize(new Dimension(880, 100));

        progresso.add(westPanel, BorderLayout.WEST);
        progresso.add(centerPanel, BorderLayout.CENTER);
        progresso.add(eastPanel, BorderLayout.EAST);
        progresso.setBorder(new LineBorder(Color.BLACK, 1));

        return progresso;
    }

    public CartaoTarefa (Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
