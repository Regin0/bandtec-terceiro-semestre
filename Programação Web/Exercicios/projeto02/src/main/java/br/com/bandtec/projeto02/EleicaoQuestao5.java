package br.com.bandtec.projeto02;

public class EleicaoQuestao5 {
    protected int votosCandidato1;
    protected int votosCandidato2;
    protected int votosInvalidos;

    public void registrarVoto1() {
        this.votosCandidato1++;
    }

    public void registrarVoto2() {
        this.votosCandidato2++;
    }

    public void registrarVotoInvalido() {
        this.votosInvalidos++;
    }

    public int getVotosCandidato1() {
        return votosCandidato1;
    }

    public int getVotosCandidato2() {
        return votosCandidato2;
    }

    public int getVotosInvalidos() {
        return votosInvalidos;
    }

    public int getTotalVotos() {
        return this.votosCandidato1 +
                this.votosCandidato2 +
                this.votosInvalidos;
    }
}
