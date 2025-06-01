package BClasses;

public class ClassStudent {
    private int rgm;
    private String name;
    private String disciplina; // Nova propriedade para disciplina

    // Constructor atualizado para incluir disciplina
    public ClassStudent(int rgm, String name, String disciplina) {
        this.rgm = rgm;
        this.name = name;
        this.disciplina = disciplina;
    }
    
    // Constructor alternativo sem disciplina (para compatibilidade)
    public ClassStudent(int rgm, String name) {
        this.rgm = rgm;
        this.name = name;
        this.disciplina = "Não informada";
    }
    
    // Getters e Setters
    public int getRgm() {
        return rgm;
    }

    public String getName() {
        return name;
    }
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setRgm(int rgm) {
        this.rgm = rgm;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Método toString atualizado para incluir disciplina
    public String toString() {
        return String.format("RGM: %d, Nome: %s, Disciplina: %s", rgm, name, disciplina);
    }
}