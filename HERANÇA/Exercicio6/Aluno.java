package HERANÇA.Exercicio6;

public class Aluno extends Pessoa {
  private int matricula;
  private String curso;


public void cancelarMatr() {
   System.out.println("Matricula será cancelada ");
}

public int getMatricula() {
    return matricula;
}

public void setMatricula(int matricula) {
    this.matricula = matricula;
}

public String getCurso() {
    return curso;
}

public void setCurso(String curso) {
    this.curso = curso;
}

@Override
public String toString() {
    return "Aluno [Matricula: " + matricula + " // Curso: " + curso + " // Nome: " + nome + " // Idade: " + idade + " // Sexo: " + sexo + "]";
}

   
}
