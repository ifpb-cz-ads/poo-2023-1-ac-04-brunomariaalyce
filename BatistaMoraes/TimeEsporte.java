package BatistaMoraes;

public class TimeEsporte {
    private String nome;
    private int pontuacao;
    private int partidasJogadas;
    private int vitorias;
    private int empates;
    private int derrotas;

    public TimeEsporte(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.partidasJogadas = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    public void registrarVitoria() {
        pontuacao += 3;
        vitorias++;
        partidasJogadas++;
    }

    public void registrarEmpate() {
        pontuacao += 1;
        empates++;
        partidasJogadas++;
    }

    public void registrarDerrota() {
        derrotas++;
        partidasJogadas++;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
}
