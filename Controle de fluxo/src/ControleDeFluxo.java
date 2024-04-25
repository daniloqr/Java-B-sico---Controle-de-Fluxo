import java.util.Scanner;

public class ControleDeFluxo {

    /**
     * Nesse código irei demonstrar um controle de fluxo simples
     * onde o usuário informa a quantidade de notas e depois informar o valor de
     * cada nota
     * o sistema vai calcular a média das notas digitas e se for maior que 7
     * vai informar se o mesmo passou ou não.
     */

    public static void main(String[] args) throws Exception {
        Scanner quantidadeNotas = new Scanner(System.in);

        System.out.println("informe a quantidade de notas inseridas: ");
        int informarQuantidadeNotas = quantidadeNotas.nextInt();

        int media = 7;
        int posicaoNota = 1;
        double resultado = 0;

        for (int i = 0; i < informarQuantidadeNotas; i++) {

            Scanner informarNota = new Scanner(System.in);

            System.out.println("informe a nota de numero " + posicaoNota + " : ");
            double notaDigitada = informarNota.nextDouble();

            if (notaDigitada >= media && notaDigitada <= 10) {
                System.out.println(notaDigitada + " é uma ótima nota ");
                resultado += notaDigitada;

            } else if (notaDigitada < media) {
                System.out.println("infelizmente a nota " + notaDigitada + " não é suficiente para passar ");
                resultado += notaDigitada;
            }

            else {
                System.out.println("digite uma nota válida ");
                i--;
                posicaoNota--;
            }

            posicaoNota++;
        }
        double caluloMedia = resultado / informarQuantidadeNotas;

        if (caluloMedia >= media) {
            System.out.println("Você passou com média: " + caluloMedia);

        } else {
            System.out.println("infelizmente você foi reprovado, média final: " + caluloMedia);
        }
    }
}
