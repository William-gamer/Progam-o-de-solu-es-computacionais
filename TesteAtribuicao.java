import javax.swing.JOptionPane;

class Professor {
    private String nome;
    private int idade;

    public Professor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getDados() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

class Disciplina {
    private String nome;
    private boolean pratica;

    public Disciplina(String nome, boolean pratica) {
        this.nome = nome;
        this.pratica = pratica;
    }

    public String getDados() {
        return "Nome: " + nome + ", Prática: " + (pratica ? "Sim" : "Não");
    }
}

class Atribuicao {
    private Professor professor;
    private Disciplina disciplina;

    public Atribuicao(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public String getDados() {
        return "Atribuição: " + professor.getDados() + ", " + disciplina.getDados();
    }
}

public class TesteAtribuicao {
    public static void main(String[] args) {
        String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do professor:");
        int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do professor:"));
        
        String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina:");
        int respostaPratica = JOptionPane.showConfirmDialog(null, "A disciplina é prática?", "Confirmação", JOptionPane.YES_NO_OPTION);
        boolean praticaDisciplina = (respostaPratica == JOptionPane.YES_OPTION);
        
        Professor professor = new Professor(nomeProfessor, idadeProfessor);
        Disciplina disciplina = new Disciplina(nomeDisciplina, praticaDisciplina);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);
        
        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
