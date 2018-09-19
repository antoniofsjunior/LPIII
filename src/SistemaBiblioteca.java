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
			System.out.print("Escolha uma opção: ");
			op = e.nextInt();
			switch(op){
				case 1:
					biblioteca.cadastrarAluno();
					break;
				case 2:
					biblioteca.listarAlunos();
					break;
			}
		}
	}

}
