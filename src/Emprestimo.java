
public class Emprestimo {
	public final static int EMPRESTADO = 1;
	public final static int DEVOLVIDO = 2;
	
	private Aluno aluno;
	private Livro livro;
	private String dataEmprestimo;
	private String dataDevolucao;
	private int status;
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Emprestimo [aluno=" + aluno + ", livro=" + livro + ", dataEmprestimo=" + dataEmprestimo
				+ ", dataDevolucao=" + dataDevolucao + ", status=" + status + "]";
	}
}
