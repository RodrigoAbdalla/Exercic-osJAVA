public class Funcionarios {
    public String nome;
    public String cargo ;
    public Double salário;

    

    public Funcionarios(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        if(cargo.toUpperCase().equals("ESTAGIÁRIO")){
            this.salário = 800.00;
        }
        else if(cargo.toUpperCase().equals("JUNIOR")){
            this.salário = 1200.00;
        }
        else{
            this.salário = 2500.00;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Double getSalário() {
        return salário;
    }

    public void setSalário(Double salário) {
        this.salário = salário;
    }

    public String getTipoTrabalho(){
        if(cargo.toUpperCase().equals("ESTAGIÁRIO")){
            return "\n\n100% Home Office";
        }
        else if(cargo.toUpperCase().equals("JUNIOR")){
            return "\n\nPresencial";
        }
        else{
            return "\n\nHíbrido";
        }
    }

    public String getDados(){
        return "\n\nNome: " + this.getNome() + "\nCargo: " + this.getCargo() + "\nSalário: " + this.getSalário();
    }


    @Override
    public String toString() {
        return "Funcionarios [cargo=" + cargo + ", nome=" + nome + ", salário=" + salário + "]";
    }


}
