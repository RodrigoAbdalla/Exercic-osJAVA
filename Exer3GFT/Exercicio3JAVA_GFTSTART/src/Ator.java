public class Ator extends Modelo{
    String nivelAtor;

    public Ator(String nivelAtor, String nome, Double altura, Double peso, Integer idade) {
        super(nome, altura, peso, idade);
        this.nivelAtor = nivelAtor;
    }

    public String getNivelAtor() {
        return nivelAtor;
    }

    public void setNivelAtor(String nivelAtor) {
        this.nivelAtor = nivelAtor;
    }


    public String mostrarDados(){
        return "Nome: " + nome + "\nTrabalho: Novelas";
    }

    @Override
    public String toString() {
        return "Ator [nivelAtor=" + nivelAtor + "]";
    }
}
