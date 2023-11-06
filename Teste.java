
/**
 * Escreva uma descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Teste
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;

    /**
     * Construtor para objetos da classe Teste
     */
    public Teste()
    {
        // inicializa variáveis de instância
        x = 0;
    }
    
    public void executar(String pergunta, String[] opcoesResposta, int opcaoCerta)
    {
        QuizMultiplaEscolha quiz = new QuizMultiplaEscolha(pergunta, opcoesResposta);
        quiz.definirOpcaoCerta(opcaoCerta);
        quiz.montarQuestao();
        
    }
        
    }



