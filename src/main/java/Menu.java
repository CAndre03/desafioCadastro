import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startMenu();

    }

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        try {
            do {
                menuOptions();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Criando");
                    case 2 -> System.out.println("Alterando");
                    case 3 -> System.out.println("Deletando");
                    case 4 -> System.out.println("Listando");
                    case 5 -> System.out.println("Listando com parâmentro");
                    case 6 -> System.out.println("Saindo!");
                    default -> System.out.println("Opção incorreta. Tente novamente!\n");
                }
            } while (choice < 1 || choice > 6);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, apenas dígitos");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void menuOptions() {
        System.out.println("Bem-vindo ao sistema de cadastro do seu PET. Disque a opção desejável: \n");
        System.out.println("1 - Cadastrar um novo pet");
        System.out.println("2 - Alterar os dados do pet cadastrado");
        System.out.println("3 - Deletar um pet cadastrado");
        System.out.println("4 - Listar todos os pets cadastrados");
        System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6 - Sair");
    }




}
