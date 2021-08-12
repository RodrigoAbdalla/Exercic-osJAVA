public class App {
    public static void main(String[] args) throws Exception {
    
        Modelo modelo = new Modelo("Rodrigo Abdalla", 1.72, 62.5, 20);
        Ator ator = new Ator("Junior", "Carlos Eduardo", 1.54, 52.5, 15);

        System.out.println("\n*********************\n");
        System.out.println(modelo.mostrarDados());
        System.out.println("\n*********************\n");
        System.out.println(ator.mostrarDados());
        System.out.println("\n*********************\n");
    }
}
