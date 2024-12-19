package task;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataFinal;
    private String status;
    private String prioridade;

    // Construtor da classe Tarefa
    public Tarefa(String titulo, String descricao, LocalDate dataFinal, String status, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataFinal = dataFinal;
        this.status = status;
        this.prioridade = prioridade;
    }

    // Métodos getter e setter para acessar e modificar os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
