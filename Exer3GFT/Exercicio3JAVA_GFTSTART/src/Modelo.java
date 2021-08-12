public class Modelo {
    String nome; 
    Double altura;
    Double peso;
    Integer idade;

    public Modelo(String nome, Double altura, Double peso, Integer idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Modelo [nome=" + nome + ", altura=" + altura + ", peso=" + peso + ", idade=" + idade + "]";
    }


    public String mostrarDados(){
        return "Nome: " + nome + "\nTrabalho: Malhação";
    }

}
