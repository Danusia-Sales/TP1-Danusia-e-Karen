package servlet;
public class Estudante {
    public String nome;
    public int idade;
}
public class Aluno extends Estudante {
    public String matrícula;
    public String email;
    String matricula;
}
public class Estudos extends Aluno {
    public static void main(String args[]){
    Aluno aluno = new Aluno();
    aluno.nome = "Fabricio";
    aluno.idade = 17;
    aluno.matricula = "2017225984";
     
    System.out.println("Nome: " + aluno.nome + "\n" +
    "Idade: " + aluno.idade + "\n" +
    "Matrícula: " + aluno.matricula);
  }
}