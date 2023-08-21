import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scan = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.println("Digite o RA do aluno");
        a1.ra = scan.nextInt();
        System.out.println("digite a nota 1");
        a1.nota1 = scan.nextDouble();
        System.out.println("Digite a nota 2");
        a1.nota2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("digite o nome do aluno");
        a1.nome = scan.nextLine();

        a1.calcularMedia();
        System.out.println("Media do aluno" + a1.nome + "é " + a1.media);



    }
}
