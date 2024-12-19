package task;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuBar extends JPanel{
    
    // Função para criar um botão com imagem a partir do caminho
    private JButton criarBotaoMenu(String imagePath) {
        ImageIcon icone = new ImageIcon(imagePath);

        // Redimensiona a imagem
        Image imagem = icone.getImage();
        Image imgemRedimensionada = imagem.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icone = new ImageIcon(imgemRedimensionada);

        // Cria o botão com a imagem
        JButton botao = new JButton(icone);

        botao.setBorder(new EmptyBorder(15 ,15, 15, 15));
        botao.setFocusPainted(false);

        // Alterar Background
        botao.setBackground(Color.WHITE);

        return botao;
    }
    
    public MenuBar () {
        // Define o layout da sidebar para empilhar os botões verticalmente
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton button1 = criarBotaoMenu("src\\task\\home.png");
        JButton button2 = criarBotaoMenu("src\\task\\calendar.png");
        JButton button3 = criarBotaoMenu("src\\task\\add.png");
        JButton button4 = criarBotaoMenu("src\\task\\setting.png");

        // Adiciona os botões no painel da sidebar
        add(button1);  // Botão no topo
        add(button2);  // Botão no topo
        add(Box.createVerticalGlue());  // Espaço para o botão 3 ficar no meio
        add(button3);  // Botão no meio
        add(Box.createVerticalGlue());  // Espaço para o botão 4 ficar no fim
        add(button4);  // Botão no fim

        // Definindo a largura da sidebar
        setBorder(new EmptyBorder(10, 20, 10, 20));
        setPreferredSize(new Dimension(100, 0)); 
        setBackground(Color.WHITE);
    }
}
