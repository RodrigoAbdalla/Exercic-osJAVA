import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Double valorMoto;

        System.out.println("Digite o valor da moto: ");
        valorMoto = ler.nextDouble();
        ler.close();

        System.out.println("\n\n****************************   TABELA DE PREÇOS  ****************************");
        System.out.println("Quantidade de Parcelas      |    Preço Final         |  Valor da Parcela     ");
        System.out.println("          1                 |      " + String.format("%.2f", valorMoto*0.70) + "           |      " +    String.format("%.2f",valorMoto*0.70));
        System.out.println("          5                 |      " + String.format("%.2f", valorMoto*1.04) + "           |      " +    String.format("%.2f",valorMoto*1.04/5));
        System.out.println("          11                |      " + String.format("%.2f",valorMoto*1.07) + "           |      " +    String.format("%.2f",valorMoto*1.07/11));
        System.out.println("          17                |      " + String.format("%.2f",valorMoto*1.10) + "           |      " +    String.format("%.2f",valorMoto*1.10/17));
        System.out.println("          23                |      " + String.format("%.2f",valorMoto*1.13) + "           |      " +    String.format("%.2f",valorMoto*1.13/23));
        System.out.println("          29                |      " + String.format("%.2f",valorMoto*1.16) + "           |      " +    String.format("%.2f",valorMoto*1.16/29));
        
    }
}
