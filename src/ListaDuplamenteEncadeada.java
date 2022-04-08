import java.util.Scanner;
public class ListaDuplamenteEncadeada {
    public static void main(String[] args) {
        LDE listaClientes = new LDE();
        Scanner in = new Scanner (System.in);
        char op;
        Cliente cliente;
        String cpf;
        String nome;
        String fone;
        String email;
        do {
            exibirMenu();
            op = in.next().charAt(0); in.nextLine();
            switch(op) {
                case '1': System.out.print("Informe o CPF do cliente: ");
                    cpf = in.nextLine();
                    System.out.print("Informe o nome do cliente: ");
                    nome = in.nextLine();
                    System.out.print("Informe o telefone do cliente: ");
                    fone = in.nextLine();
                    System.out.print("Informe o email do cliente: ");
                    email = in.nextLine();
                    cliente = new Cliente(cpf, nome, fone, email);
                    listaClientes.inserirOrdenadoCrescente(cliente);
                    break;
                case '2': System.out.print("Informe o CPF do cliente: ");
                    cpf = in.nextLine();
                    System.out.print("Informe o nome do cliente: ");
                    nome = in.nextLine();
                    System.out.print("Informe o telefone do cliente: ");
                    fone = in.nextLine();
                    System.out.print("Informe o email do cliente: ");
                    email = in.nextLine();
                    cliente = new Cliente(cpf, nome, fone, email);
                    listaClientes.inserirOrdenadoDecrescente(cliente);
                    break;
                case '3': System.out.print("Informe o CPF do cliente: ");
                    cpf = in.nextLine();
                    System.out.print("Informe o nome do cliente: ");
                    nome = in.nextLine();
                    System.out.print("Informe o telefone do cliente: ");
                    fone = in.nextLine();
                    System.out.print("Informe o email do cliente: ");
                    email = in.nextLine();
                    cliente = new Cliente(cpf, nome, fone, email);
                    listaClientes.inserirDuplicado(cliente);
                    break;
                case '4' : listaClientes.exibirLista();
                    break;
                case '0' : System.out.println("Bye bye!");
                    break;
                default: System.out.println("Opção inválida!");
            }
        } while (op != '0');
    }

    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um novo cliente na lista");
        System.out.println("2 - Cadastrar um novo cliente na lista de forma DECRESCENTE");
        System.out.println("3 - Cadastrar um cliente REPETIDO");
        System.out.println("4 - Exibir todos os clientes cadastrados");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }
}