import java.util.Scanner;

public class Banco {
    public static void main(String [] args){

        String nome = "José Bezerra";
        String tipoDeConta = "Corrente";
        double saldoini = 2000.00;
        int opcao = 0;
        double saldomen = 0;
        double saldoad = 0;
        Scanner leitura =  new Scanner(System.in);

        System.out.println("=".repeat(30));
        System.out.println("DADOS INCIAIS DO CLIENTE: ");
        System.out.printf("\nNOME: %s\nTIPO DE CONTA: %s\nSALDO INICIAL: R$ %.2f\n".formatted(nome,tipoDeConta,saldoini));

        String menu = """
                      ============================
                      ESCOLHA SUA OPÇÃO
                      
                      1 - CONSULTAR SEU SALDO
                      2 - TRANSFERIR
                      3 - DEPOSITAR/RECEBER VALOR 
                      4 - SAIR 
                      ============================
                      DIGITE AQUI: """ ;

        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.printf("Seu saldo é: R$ %.2f".formatted(saldoini));
                System.out.println();
            } else if (opcao == 2) {
                System.out.println("Qual o valor que você deseja transferir: ");
                if (saldomen > saldoini) {
                    System.out.println("Não há saldo suficiente");
                } else {
                    saldomen = leitura.nextDouble();
                    saldoini = saldoini - saldomen;
                }
            } else if (opcao == 3) {
                System.out.println("Quanto você vai depositar/receber: ");
                saldoad = leitura.nextDouble();
                saldoini = saldoad + saldoini;
            }
        }
    }
}
