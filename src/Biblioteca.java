import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public void cadastrarAluno(){
		Scanner e = new Scanner(System.in);
		Scanner eNome = new Scanner(System.in);
		Scanner eEndereco = new Scanner(System.in);
		
		Aluno a = new Aluno();
		
		System.out.print("Informe a Matrícula do Aluno: ");
		a.setMatricula(e.next());
		
		System.out.print("Informe o Nome do Aluno: ");
		a.setNome(eNome.nextLine());

		System.out.print("Informe o Endereço do Aluno: ");
		a.setEndereco(eEndereco.nextLine());

		System.out.print("Informe a Telefone do Aluno: ");
		a.setTelefone(e.next());
		
		alunos.add(a);
	}
	
	public void listarAlunos(){
		System.out.println("Lista de Alunos");
		for(int i=0; i < alunos.size(); i++)
			System.out.println(i+"-"+alunos.get(i));
	}
	
	public void cadastrarLivro(){
		//TODO
	}
	public void listarLivros(){
		//TODO
	}
	public void emprestarLivro(){
		//TODO
		Scanner e = new Scanner(System.in);
		Emprestimo emprestimo = new Emprestimo();
		
		listarAlunos();
		System.out.print("Escolha o Aluno informando o índice: ");
		emprestimo.setAluno(alunos.get(e.nextInt()));

		listarLivros();
		
		emprestimo.setStatus(Emprestimo.EMPRESTADO);
		
		emprestimos.add(emprestimo);
	}
	public void devolverLivro(){
		//TODO
	}
}
