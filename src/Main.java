import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PRÁTICA

        // O INPUT
        Scanner lerNumeros = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = lerNumeros.nextInt();

        // O CODIGO
        if (numero <9 && numero >= 1){
            System.out.println("Este número tem 1 digito");
        } else if (numero <100 && numero >= 10) {
            System.out.println("Este número tem 2 digitos");
        } else if (numero <1000 && numero >= 100) {
            System.out.println("Este número tem 3 digitos");
        } else if (numero <10000 && numero >= 1000) {
            System.out.println("Este número tem 4 digitos");
        } else if (numero <100000 && numero >= 10000) {
            System.out.println("Este número tem 5 digitos");
        } else {
            System.out.println("Este número tem 5 digitos ou mais");
        }


        /***


         // OPERADOR TERNÁRIO
         int ingresso = 499;
         String terAcesso = ingresso >= 500 ? "VIP" : "Pista"; // OPERADOR TERNÁRIO
         System.out.println(terAcesso);



         int ingresso = 800;
         String terAcesso = "Pista"; // COLOCANDO O VALOR DEFAULT
         if (ingresso >= 500 )
         terAcesso = "VIP";
         System.out.println(terAcesso);


         int ingresso = 800;
         String terAcesso;
         if (ingresso >= 500)
         terAcesso = "VIP";
         else
         terAcesso = "Pista";
         System.out.println(terAcesso);


         int valorCarro = 100_000;
         if (valorCarro > 100_000)
         System.out.println("Não comprar! Acima da tabela.");
         else if (valorCarro >= 90_000 && valorCarro <= 100_000)
         System.out.println("Pode comprar!!");
         else
         System.out.println("Não comprar! Valor  abaixo da tabela.");

         boolean temEmprego = true;
         boolean temEmpresa = false;
         boolean tem50k = true;
         boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;
         System.out.println(podeFinanciar);


         // COMPARARDOR AND (&&) COMPARARDOR OR (||)

        // ---- precoProduto = $20
        // ---- Comprar somente entre $10 e $15

         int precoProduto = 11;
         boolean buy = precoProduto >= 10 && precoProduto <= 15;
         System.out.println(buy);


         int a = 4;
         int b = 5;
         System.out.println(a==b); // COMPARAÇÃO


        NumberFormat real = NumberFormat.getCurrencyInstance(); // FORMATAR DE ACORDO COM A MOEDA LOCAL
        double productValue = 120.80;
        String formattedValue = real.format(productValue); // FORMATAR DOUBLE EM STRING
        System.out.println(formattedValue);

         ***/
    }
}

/***
 " "
 ''
 \n     pular linha
 \t     tab

 byte
 short
 int
 long
 char
 float
 double
 boolean

 ***/