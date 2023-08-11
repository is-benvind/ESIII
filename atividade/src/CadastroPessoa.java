import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

interface Cadastravel {
    void cadastrar();
    void excluir();
}

class Pessoa implements Cadastravel {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void cadastrar() {
        System.out.println("Pessoa cadastrada: " + nome);
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo pessoa: " + nome);
    }
}

class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void cadastrar() {
        System.out.println(">> Aluno: " + nome + " | Matrícula: " + matricula);
    }
}

class Professor extends Pessoa {
    private String materia;
    List<Aluno> alunos;

    public Professor(String nome, String materia) {
        super(nome);
        this.materia = materia;
        this.alunos = new ArrayList<>();
    }

    public String getMateria() {
        return materia;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void excluirAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public void cadastrar() {
        System.out.println("\nProfessor: " + nome + " | Matéria: " + materia);
    }

    public void listarAlunos() {
        System.out.println("Alunos do Professor " + nome + ":");
        for (Aluno aluno : alunos) {
            aluno.cadastrar();
        }
    }

    @Override
    public void excluir() {
        super.excluir();
        alunos.clear();
    }
}

public class CadastroPessoa {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Professor> professores = new HashMap<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n\nMENU");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Aluno para Professor");
            System.out.println("3 - Listar Professores e Alunos");
            System.out.println("4 - Excluir Professor ou Aluno");
            System.out.println("0 - Fechar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProfessor();
                    break;

                case 2:
                    cadastrarAlunoParaProfessor();
                    break;

                case 3:
                    listarProfessoresEAlunos();
                    break;

                case 4:
                    excluirProfessorOuAluno();
                    break;

                case 0:
                    System.out.println("Fechando.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    Enter();
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void Enter() {
        System.out.print("<enter> para continuar...");
        scanner.nextLine();
    }

    private static void cadastrarProfessor() {
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        System.out.print("Digite a matéria que ele ministra: ");
        String materiaProfessor = scanner.nextLine();
        Professor professor = new Professor(nomeProfessor, materiaProfessor);
        professores.put(nomeProfessor, professor);
        System.out.println("Professor cadastrado com sucesso!");
    }

    private static void cadastrarAlunoParaProfessor() {
        System.out.print("Digite o nome do professor: ");
        String nomeProfessorAluno = scanner.nextLine();
        if (professores.containsKey(nomeProfessorAluno)) {
            Professor professorAluno = professores.get(nomeProfessorAluno);

            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();
            System.out.print("Digite a matrícula do aluno: ");
            int matriculaAluno = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
            professorAluno.adicionarAluno(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } else {
            System.out.println("Professor não encontrado.");
        }
        Enter();
    }

    private static void listarProfessoresEAlunos() {
        System.out.println("\n--------------------------------");
        System.out.println("Professores e Alunos:\n");
        for (Professor prof : professores.values()) {
            prof.cadastrar();
            prof.listarAlunos();
        }
        System.out.println("\n--------------------------------");
        Enter();
    }

    private static void excluirProfessorOuAluno() {
        System.out.print("Digite o nome do professor ou aluno a excluir: ");
        String nomeExcluir = scanner.nextLine();
        if (professores.containsKey(nomeExcluir)) {
            Professor profExcluir = professores.get(nomeExcluir);
            profExcluir.excluir();
            professores.remove(nomeExcluir);
            System.out.println("Professor excluído com sucesso!");
        } else {
            boolean alunoExcluido = false;
            for (Professor prof : professores.values()) {
                for (Aluno aluno : prof.alunos) {
                    if (aluno.getNome().equals(nomeExcluir)) {
                        prof.excluirAluno(aluno);
                        aluno.excluir();
                        alunoExcluido = true;
                        System.out.println("Aluno excluído com sucesso!");
                        break;
                    }
                }
                if (alunoExcluido) {
                    break;
                }
            }
            if (!alunoExcluido) {
                System.out.println("Não encontrado.");
            }
        }
        Enter();
    }
}