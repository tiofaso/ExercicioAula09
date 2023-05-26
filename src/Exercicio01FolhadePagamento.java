import java.util.Scanner;
import java.text.DecimalFormat;

//Cálculo de folha de pagamento com descontos variáveis
public class Exercicio01FolhadePagamento {
    public static void main(String[] args){

        //lendo dados digitados
        Scanner entrada = new Scanner(System.in);

        System.out.println("RH - SISTEMA DE PONTO VITUAL");
        System.out.println("----------------------------");
        System.out.println("Olá! Seja bem-vinde! ");

        System.out.println("Digite o valor da sua hora de trabalho (apenas números): ");
        double valorHora = entrada.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas esse mês (apenas números): ");
        double horaTrabalhada = entrada.nextDouble();

        //Cálculo do valor bruto do salário
        double salarioBruto = horaTrabalhada * valorHora;

        //setando IR
        double descontoIR = 0;

        //Verificando faixa salarial para IR
        if(salarioBruto <= 900){
            descontoIR = descontoIR;
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            descontoIR = 0.05;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            descontoIR = 0.10;
        }else{
            descontoIR = 0.20;
        }//end if

        //Setando INSS
        double descontoINSS = 0.10;

        //Setando FGTS
        double descontoFGTS = 0.11;

        //Arredontando do valores
        DecimalFormat displayImposto = new DecimalFormat("0");
        DecimalFormat displayDinheiro = new DecimalFormat("0.00");

        //resultado do cálculo
        System.out.println("Valor hora:R$" + valorHora + " | " + "Horas trabalhadas: " + horaTrabalhada);
        System.out.println("Salario bruto:R$" + salarioBruto);
        System.out.println("(-) IR (" + displayImposto.format((100 * descontoIR)) + "%):R$" + displayDinheiro.format((salarioBruto * descontoIR)));
        System.out.println("(-) INSS (" + displayImposto.format((100 * descontoINSS)) + "%):R$" + displayDinheiro.format((salarioBruto * descontoINSS)));
        System.out.println("(-) FGTS (" + displayImposto.format((100 * descontoFGTS)) + "%):R$" + displayDinheiro.format((salarioBruto * descontoFGTS)));
        System.out.println("Total de descontos: R$" + displayDinheiro.format(salarioBruto * (descontoIR + descontoINSS)));
        System.out.println("----------------------------");
        System.out.println("Salario Liquido :R$" + displayDinheiro.format((salarioBruto - (salarioBruto * (descontoIR + descontoINSS )) )));
    }
}
