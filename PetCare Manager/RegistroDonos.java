import java.util.ArrayList;
import java.util.Scanner;

public class RegistroDonos {

    Scanner scanner = new Scanner(System.in);

    ArrayList<String> ListaDeDonos = new ArrayList<>();

    public void donos() {
        int escolha = -1;
        while (escolha != 0) {

            System.out.println("Esclha uma opção ");

            System.out.println("1 - Novo Cliente ");
            System.out.println("2 - Mostrar Clientes");
            System.out.println("3 - Remover Cliente ");
            System.out.println("0 - SAIR");

            escolha = scanner.nextInt();
            scanner.nextLine();

            if (escolha == 1) {

                System.out.println("Nome do tutor");
                String nome = scanner.nextLine();
                System.out.println("Telefone");
                String telefone = scanner.nextLine();
                System.out.println("Nome do Animal de estimação ");
                String animal = scanner.nextLine();

                ListaDeDonos.add(nome);
                ListaDeDonos.add(telefone);
                ListaDeDonos.add(animal);

                System.out.println("Voltar ao menu? Pressione Enter ");
                scanner.nextLine();
            }

            else if (escolha == 2) {

                System.out.println("LISTA DE CLIENTES REGISTRADOS :");
                System.out.println("Clientes registrados " + ListaDeDonos.size());

            }
            if (ListaDeDonos.isEmpty()) {
                System.out.println("Sem Clientes registrados.");
                scanner.nextLine();
                System.out.println("voltar ao menu? Pressione enter");
                scanner.nextLine();
            } else if (escolha == 3) {
                System.out.println("Remover Cliente ");

            }

        }
    }
}