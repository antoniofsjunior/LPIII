import java.util.Scanner;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner e = new Scanner(System.in);
		int op;
		
		while(true){
			System.out.println("Menu");
			System.out.println("1-Cadastrar Aluno");
			System.out.println("2-Listar Alunos");
			System.out.println("3-Cadastrar Livro");
			System.out.println("4-Listar Livros");
			System.out.println("5-Emprestar livro");
			System.out.println("6-Listar emprestimos");
			System.out.println("7-Devolver livro");
			System.out.println("8-Alterar aluno");
			System.out.print("Escolha uma opção: ");
			op = e.nextInt();
			switch(op){
				case 1:
					biblioteca.cadastrarAluno();
					break;
				case 2:
					biblioteca.listarAlunos();
					break;
				case 3:
					biblioteca.cadastrarLivro();
					break;
				case 4:
					biblioteca.listarLivros();
					break;
				case 5:
					biblioteca.emprestarLivro();
					break;
				case 6:
					biblioteca.listarEmprestimos();
					break;
				case 7:
					biblioteca.devolverLivro();
					break;
				case 8:
					biblioteca.alterarAluno();
					break;

			}
		}
	}

}
