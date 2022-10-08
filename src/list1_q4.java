import java.util.Scanner;

public class list1_q4
{
    public static void main(String[] args) 
    {
        double num1, num2, num3, num4, media;
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextDouble();
        num2 = teclado.nextDouble();
        num3 = teclado.nextDouble();
        num4 = teclado.nextDouble();

        media = (num1+num2+num3+num4) / 4;
        System.out.print(media);
        teclado.close();
    } 
    
}