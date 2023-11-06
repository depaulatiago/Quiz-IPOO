public class QuizMultiplaEscolha {
  private String pergunta;
  private String[] opcoesResposta;
  private int opcaoCerta;    // posição da opção certa no vetor
  private int[] votosAlunos; // cada posição tem a quantidade de votos de uma opção

  public QuizMultiplaEscolha(String pergunta, String[] opcoesResposta) {
    this.pergunta = pergunta;
    this.opcoesResposta = opcoesResposta;
    this.opcaoCerta = 0;
    votosAlunos = new int[opcoesResposta.length];
  }

  public void definirOpcaoCerta(int opcaoCerta) {
    this.opcaoCerta = opcaoCerta;
  }

  public boolean incluirVotoAluno(int opcao) {
    if (opcao >= 0 && opcao < opcoesResposta.length) {
      votosAlunos[opcao]++;
      return true;
    }
    return false;
  }

  public int nroAcertos() {
    return votosAlunos[opcaoCerta];
  }

  public void montarQuestao(){
     String respostas = "";
    for (int i = 0; i < opcoesResposta.length; i++) {
            respostas += opcoesResposta[i] + " (" + votosAlunos[i] + " votos)\n";
        }
    System.out.println("Questão: " + pergunta + "\n" + respostas);
    }
}
