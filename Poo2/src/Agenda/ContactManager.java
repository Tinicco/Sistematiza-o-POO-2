package Agenda;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n==== Gerenciador de Contatos ====");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Digite o número de telefone: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                    contactList.addContact(name, phoneNumber, email);
                    break;
                case 2:
                    System.out.print("Digite o nome ou número de telefone para buscar: ");
                    String searchKey = scanner.nextLine();
                    Contact foundContact = contactList.searchContact(searchKey);
                    if (foundContact != null) {
                        System.out.println("Contato encontrado: " + foundContact);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome ou número de telefone para remover: ");
                    String removeKey = scanner.nextLine();
                    boolean removed = contactList.removeContact(removeKey);
                    if (removed) {
                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de contatos:");
                    contactList.listContacts();
                    break;
                case 5:
                    System.out.println("Espero ter ajudado, encerrando os serviços :D");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (option != 5);

        scanner.close();
    }
}