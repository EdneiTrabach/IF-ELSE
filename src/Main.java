import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        int valorCarro = 100_000;
        if (valorCarro > 100_00)
            System.out.println("Não comprar! Acima da tabela.");


        /***

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