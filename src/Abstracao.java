import java.util.Scanner;

public class Abstracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.println();
        System.out.print("Insira o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.print("Insira o telefone do cliente: ");
        String tel = scanner.nextLine();
        System.out.println();
        System.out.print("Insira o endereço do cliente: ");
        String end = scanner.nextLine();
        System.out.println();
        System.out.print("Insira o credito do cliente: ");
        double credito = scanner.nextDouble();
        System.out.println();
        Cliente cl = new Cliente(cpf, nome, tel, end, credito);

        System.out.println(cl);
        System.out.println();
        System.out.print("Insira o valor para inserior de credito: ");
        double aumento = scanner.nextDouble();
        cl.aumentarCredito(aumento);
        System.out.println();
        System.out.print("Insira o valor para remover de credito: ");
        double remover = scanner.nextDouble();
        cl.removerCredito(remover);
        System.out.println();
        System.out.println(cl);

        scanner.close();
    }
}
