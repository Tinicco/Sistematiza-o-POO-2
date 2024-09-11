package Agenda;

import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        Scanner scanner = new Scanner(System.in);
        int option;
        
        contactList.addContact("Roberto", "7554163027", "bertinho62@hotmail.com");
        contactList.addContact("Alice", "32990249821", "dracofire@hotmail.com");
        contactList.addContact("Julio Pereira", "8224442724", "kingofnight@gmail.com");
        contactList.addContact("Paula Nobre", "6651446777", "nobreza@gmail.com");
        contactList.addContact("Luis", "7527995923", "huntervoid@yahoo.com");
        contactList.addContact("Paulo Pereira", "8627535499", "paulopeirei@gmail.com");
        contactList.addContact("Marcelo Fernandes Pereira", "7154512512", "yorukiller@hotmail.com");
        contactList.addContact("Larissa", "6746358880", "opala1973@gmail.com");
        contactList.addContact("Bruna", "3241166200", "seila@gmail.com");
        contactList.addContact("Julia Araujo", "7455815765", "redmascarade@gmail.com");

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
