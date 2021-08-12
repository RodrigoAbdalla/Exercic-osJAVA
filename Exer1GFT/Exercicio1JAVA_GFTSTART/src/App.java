import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String vacina, dataVacinaTexto;
        LocalDate dataVacina;
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.printf("Informe sua vacina (Coronavac/Janssen): ");
        vacina = ler.nextLine();
    

        if(vacina.toUpperCase().compareTo("CORONAVAC") != 0 & vacina.toUpperCase().compareTo("JANSSEN") != 0){
            System.out.println("Vacina inválida. Vacinas aceitas: Coronavac e Janssen.");
        }
        else{
            System.out.printf("Informe a data (dd/mm/yyyy) que tomou a vacina " + vacina + ": ");
            dataVacinaTexto = ler.nextLine();
            ler.close();
            try {
                dataVacina = LocalDate.parse(dataVacinaTexto, formatter);
                System.out.println("\n\n\nVACINA: " + vacina + "\nPrimeira dose: " + dataVacina.format(formatter));
                if(vacina.toUpperCase().compareTo("CORONAVAC") == 0)
                    System.out.println("Segunda dose: " + dataVacina.plusDays(14).format(formatter));
            } catch(DateTimeParseException e) {
                System.out.println("Este formato de data não é válido. Favor digitar uma data no formato dd/mm/yyyy.");
            }
        }
        

        
    }
}
