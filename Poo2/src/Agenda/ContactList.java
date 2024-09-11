package Agenda;

public class ContactList {
    private Node head;

    public ContactList() {
        this.head = null;
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        Node newNode = new Node(newContact);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    public Contact searchContact(String searchKey) {
        Node temp = head;
        while (temp != null) {
            if (temp.contact.getName().equalsIgnoreCase(searchKey) || 
                temp.contact.getPhoneNumber().equals(searchKey)) {
                return temp.contact;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean removeContact(String searchKey) {
        if (head == null) {
            return false;
        }

        if (head.contact.getName().equalsIgnoreCase(searchKey) || 
            head.contact.getPhoneNumber().equals(searchKey)) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.contact.getName().equalsIgnoreCase(searchKey) || 
                temp.next.contact.getPhoneNumber().equals(searchKey)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public void listContacts() {
        if (head == null) {
            System.out.println("A lista de contatos está vazia.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.contact);
            temp = temp.next;
        }
    }
}