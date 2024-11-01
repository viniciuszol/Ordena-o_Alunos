import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

  public GerenciadorAlunos() {
    this.alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media) {
    alunosSet.add(new Aluno(nome, matricula, media));
  }

  public void removerAlunoPorMatricula(long matricula) {
    Aluno alunoParaRemover = null;
    if (!alunosSet.isEmpty()) {
      for (Aluno a : alunosSet) {
        if (a.getMatricula() == matricula) {
          alunoParaRemover = a;
          break;
        }
      }
      alunosSet.remove(alunoParaRemover);
    } 
    else {
      throw new RuntimeException("O conjunto está vazio!");
    }

    if (alunoParaRemover == null) {
      System.out.println("Matricula não encontrada!");
    }
  }

  public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
    if (!alunosSet.isEmpty()) {
      System.out.println(alunosPorNome);
    } 
    else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
    if (!alunosSet.isEmpty()) {
      alunosPorNota.addAll(alunosSet);
      System.out.println(alunosPorNota);
    } 
    else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {

    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

    // adicionando alunos ao gerenciador
    gerenciadorAlunos.adicionarAluno("Tadeu", 111111L, 8.5);
    gerenciadorAlunos.adicionarAluno("José", 222222L, 6.2);
    gerenciadorAlunos.adicionarAluno("Luís", 333333L, 4.8);
    gerenciadorAlunos.adicionarAluno("Diogo", 444444L, 7.4);

    // exibindo todos os alunos no gerenciador
    System.out.println("Alunos no gerenciador: ");
    System.out.println(gerenciadorAlunos.alunosSet);

    // removendo um aluno com matrícula invalida e outro pelo número de matrícula
    gerenciadorAlunos.removerAlunoPorMatricula(000000L);
    gerenciadorAlunos.removerAlunoPorMatricula(444444L);
    System.out.println(gerenciadorAlunos.alunosSet);

    // exibindo alunos ordenados por nome
    gerenciadorAlunos.exibirAlunosPorNome();

    // exibindo alunos ordenados por nota
    gerenciadorAlunos.exibirAlunosPorNota();
  }
}
