public class App {
    public static void main(String[] args) throws Exception {
        // Valores aceitos para cargo = Estagiário/Junior/Sênior  
        Funcionarios funcionario1 = new Funcionarios("João Victor", "Estagiário");
        System.out.println(funcionario1.getTipoTrabalho());
        System.out.println(funcionario1.getDados()); 
        
        System.out.println("***********");

        Funcionarios funcionario2 = new Funcionarios("Rodrigo", "Sênior");
        System.out.println(funcionario2.getTipoTrabalho());
        System.out.println(funcionario2.getDados()); 
    }
}
