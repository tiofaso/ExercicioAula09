import java.util.Scanner;

//Sistema para verificar se a pessoa cometeu um crime
public class Exercicio03CSI {
    public static void main(String[] args){
        //Entrada do teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("MINORITY REPORTIX");
        System.out.println("----------------------");
        System.out.println("Olá cidadão! Aconteceu um crime e precisamos da sua ajuda!");
        System.out.println("\nResponda as perguntas a seguir calmamente. Estamos aqui para ajudar! :D");
        System.out.println("\nUse apenas S para SIM e N para NÃO. Vamos começar?\n");

        //Computando dados
        int contador = 0;

        //Iniciando contador de crimes
        int contCrimes = 0;

        //Armazena respostas temporariamente
        String respostas;

        do{
            switch (contador){
                case 0:
                    System.out.println("Você telefonou para a vítima?");
                    respostas = entrada.next();
                    if(respostas.equals("S") || respostas.equals("s")){contCrimes++;}
                    contador++;
                    break;
                case 1:
                    System.out.println("Você esteve no local do crime?");
                    respostas = entrada.next();
                    if(respostas.equals("S") || respostas.equals("s")){contCrimes++;}
                    contador++;
                    break;
                case 2:
                    System.out.println("Você mora perto vítima?");
                    respostas = entrada.next();
                    if(respostas.equals("S") || respostas.equals("s")){contCrimes++;}
                    contador++;
                    break;
                case 3:
                    System.out.println("Você devia dinheiro à vítima?");
                    respostas = entrada.next();
                    if(respostas.equals("S") || respostas.equals("s")){contCrimes++;}
                    contador++;
                    break;
                case 4:
                    System.out.println("Você já trabalhou com a vítima?");
                    respostas= entrada.next();
                    if(respostas.equals("S") || respostas.equals("s")){contCrimes++;}
                    contador++;
                    break;
            }

        }while (contador < 5);
        
        //Revelando se é criminoso ou não
        if(contCrimes == 2){
            System.out.println("Hmmm... há algo de suspeito...");
            System.out.println("Aguarde a chegada do detetive responsável...");
            System.out.println("Enquanto espera, quer tomar um café ou água? :D");
        }
        else if(contCrimes == 3 || contCrimes == 4){
            System.out.println("Hmmm... parece que você é cúmplice!");
            System.out.println("Aguarde a chegada do detetive responsável...");
            System.out.println("Você tem direito a um advogado.");
            System.out.println("Quer que eu chame ele no zap? ;)");
        }
        else if(contCrimes == 5){
            System.out.println("!!!! VOCÊ COMETEU UM CRIME !!!!");
            System.out.println("COLOQUE AS MÃOS SOBRE A MESA E NÃO SE MEXA!");
            System.out.println("Tudo o que você falar poderá ser usado contra você no tribunal.");
            System.out.println("O policial já iniciará os procedimentos de detenção.");

        }
        else{
            System.out.println("Ufa! Você não fez nada! :)");
            System.out.println("Já estou chamando um uber para te levar para casa! ;)");
        }
    }
}
