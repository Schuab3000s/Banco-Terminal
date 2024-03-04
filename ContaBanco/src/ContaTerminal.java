import java.util.Scanner;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
         Scanner scan = new Scanner(System.in);

        String nomeCliente, agencia;
        int numeroUsuario;
        double saldo;

        System.out.println("Digite o Nome do Cliente: ");
        nomeCliente = scan.next();

        System.out.println("Digite a Agência: ");
        agencia = scan.next();

        System.out.println("Digite o número de usuário: ");
        numeroUsuario = scan.nextInt();

        System.out.println("Digite o saldo disponível: ");
        saldo = scan.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroUsuario+" e seu saldo "+saldo+" já está disponível para saque");
        scan.close();
    }
}
