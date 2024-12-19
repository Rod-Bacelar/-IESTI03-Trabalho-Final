package task;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class ListaTarefas extends JPanel{
    List<Tarefa> tarefas = new ArrayList<>();

    public ListaTarefas () {
        tarefas.add(new Tarefa(
            "Estudar Java",
            "Estudar conceitos de Java Swing",
            LocalDate.of(2024, 12, 31),
            "em progresso",
            "alta"
        ));

        tarefas.add(new Tarefa(
            "Ir ao Mercado",
            "Comprar Arroz, Feijão e Pão",
            LocalDate.of(2024, 12, 28),
            "em progresso",
            "alta"
        ));
        
        setLayout(new CardLayout());
        setPreferredSize(new Dimension(980, 655));
        
        JPanel progressoPanel = new JPanel();
        add(progressoPanel, "Em Progresso");

        for (Tarefa tarefa : tarefas) {
            progressoPanel.add(new CartaoTarefa(tarefa).criarCartaoProgresso());
        }
    }
}
