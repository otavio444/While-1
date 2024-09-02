import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o tipo de combustivel que deseja: 1.Álcool 2.Gasolina 3.Diesel 4.Fim");

      int combustivel = sc.nextInt();


      while( combustivel < 4) {
        System.out.println("Digite 4 para finalizar!");
        combustivel = sc.nextInt();


      }
    if (combustivel == 4) {
    System.out.println("Muito obrigado!");
  }

  }
}