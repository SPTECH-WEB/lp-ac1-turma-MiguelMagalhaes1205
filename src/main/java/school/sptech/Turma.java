package school.sptech;

public class Turma {

    private String nome;
    private Double mensalidade;
    private Integer qtdAluno;
    private Boolean ativa;

    public Turma(String nome, Double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.qtdAluno = 0;
        this.ativa = true;
    }

    public void matricular(Integer qtd) {
        if (qtd != null && qtd > 0 && ativa) {
            qtdAluno += qtd;
        }
    }

    public Integer cancelar(Integer qtd) {
        if (qtd != null && qtd > 0 && qtd <= qtdAluno && ativa) {
            qtdAluno -= qtd;
            return qtd;
        } else {
            return null;
        }
    }

    public Integer desativar() {
        if (!ativa) {
            return null;
        } else {
            Integer qtdAnterior = qtdAluno;
            qtdAluno = 0;
            ativa = false;
            return qtdAnterior;
        }
    }

    public void transferir(Turma destino, Integer qtdATransferir) {
        if (destino != null && ativa && destino.ativa && qtdAluno != null && qtdATransferir != null && qtdATransferir > 0 && qtdAluno > 0 && qtdATransferir <= qtdAluno){
            qtdAluno -= qtdATransferir;
            destino.qtdAluno += qtdATransferir;
        }
    }

    public Boolean reajustarMensalidade(Double reajuste) {
        if (reajuste != null && reajuste > 0) {
            mensalidade += mensalidade * reajuste;
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public Integer getQtdAluno() {
        return qtdAluno;
    }

    public Boolean getAtiva() {
        if (ativa) {
            return true;
        } else {
            return false;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {

    }

}
