import java.util.Scanner;
import java.text.DecimalFormat;

//Cálculo do valor a pagar do combustível de acordo com o gasto
public class Exercicio02PostoCombustivel {
    public static void main(String[] arg){
        //Entrada do teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("POSTO SHELLBY LTDA\nSistema de bomba");
        System.out.println("----------------------------");
        System.out.println("Informe o tipo de combustível (A - Álcool | G - Gasolina):");
        String tipoCombustivel = entrada.next();

        //Verifica se digitou errado combustível
        int digitouErradoCombustivel = 0;

        if(tipoCombustivel.equals("A") || tipoCombustivel.equals("a")){
            tipoCombustivel = "Álcool";
            digitouErradoCombustivel = 0;
        }else if (tipoCombustivel.equals("G") || tipoCombustivel.equals("g")){
            tipoCombustivel = "Gasolina";
            digitouErradoCombustivel = 0;
        }else{digitouErradoCombustivel = 1;}

        if(digitouErradoCombustivel == 1){//início das operações
            System.out.println("É preciso escolher um tipo de combustível.");
        }
        else{
            System.out.println("Informe a quantidade de combustível abastecido:");
            double litrosCombustivel = entrada.nextDouble();
            double quantoDesconto = 0.0;
            double valorCombustivel = 0.0;
            double precoSemDesconto = 0.0;
            double precoFinal = 0.0;

            if(tipoCombustivel.equals("Álcool") && litrosCombustivel <= 20){
                quantoDesconto = 0.03;
                valorCombustivel = 1.90;
                precoSemDesconto = litrosCombustivel * valorCombustivel;
                precoFinal = precoSemDesconto - (precoSemDesconto * quantoDesconto);
            }else if(tipoCombustivel.equals("Álcool") && litrosCombustivel >= 20){
                quantoDesconto = 0.05;
                valorCombustivel = 1.90;
                precoSemDesconto = litrosCombustivel * valorCombustivel;
                precoFinal = precoSemDesconto - (precoSemDesconto * quantoDesconto);
            }else if(tipoCombustivel.equals("Gasolina") && litrosCombustivel <= 20){
                quantoDesconto = 0.04;
                valorCombustivel = 2.50;
                precoSemDesconto = litrosCombustivel * valorCombustivel;
                precoFinal = precoSemDesconto - (precoSemDesconto * quantoDesconto);
            }else if(tipoCombustivel.equals("Gasolina") && litrosCombustivel >= 20){
                quantoDesconto = 0.06;
                valorCombustivel = 2.50;
                precoSemDesconto = litrosCombustivel * valorCombustivel;
                precoFinal = precoSemDesconto - (precoSemDesconto * quantoDesconto);
            }

            //Arredontando do valores
            DecimalFormat displayDesconto = new DecimalFormat("0");
            DecimalFormat displayPreco = new DecimalFormat("0.00");

            System.out.println("----------------------------");
            System.out.println("Combustível: " + tipoCombustivel);
            System.out.println("Litros: " + displayDesconto.format((litrosCombustivel)));
            System.out.println("Preço da bomba: R$" + displayPreco.format(precoSemDesconto));
            System.out.println("Desconto amigão: " + displayDesconto.format((quantoDesconto * 100)) + "%");
            System.out.println("Total a pagar: R$" + displayPreco.format(precoFinal));
        }//fim das operações

    }
}
