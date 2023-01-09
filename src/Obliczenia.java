import java.util.Scanner;
public class Obliczenia {
    Scanner scan = new Scanner(System.in);
    double a=0;
    double b=0;
    double c=0;

public Obliczenia(){

}
public void set(){
    draw();
    System.out.println("Szukasz A, B czy C?");
    char szukana = scan.next().charAt(0);
        if (szukana == 'a'){
            System.out.println("Podaj B");
            b = scan.nextInt();
            System.out.println("Podaj C");
            c = scan.nextInt();
            double wynik=((c*c)-(b*b));
            a = Math.sqrt(wynik);
            System.out.println("A wynosi: " + a);
        }
    if (szukana == 'b'){
        System.out.println("Podaj A");
        a = scan.nextInt();
        System.out.println("Podaj C");
        c = scan.nextInt();
        double wynik=((c*c)-(a*a));
        b = Math.sqrt(wynik);
        System.out.println("B wynosi: " + b);
    }
    if (szukana == 'c'){
        System.out.println("Podaj A");
        a = scan.nextInt();
        System.out.println("Podaj b");
        b = scan.nextInt();
        double wynik=((a*a)+(b*b));
        c = Math.sqrt(wynik);
        System.out.println("C wynosi: " + c);
    }
    drawWynik();
}
public void draw(){
    System.out.println("  |\\ ");
    System.out.println("  | \\ ");
    System.out.println("  |  \\ ");
    System.out.println("A |   \\  C");
    System.out.println("  |    \\ ");
    System.out.println("  |_____\\ ");
    System.out.println("     B ");
}
public void drawWynik(){
        System.out.println("     |\\ ");
        System.out.println("     | \\ ");
        System.out.println("     |  \\ ");
        System.out.println(" "+a+" |   \\ "+c);
        System.out.println("     |    \\ ");
        System.out.println("     |_____\\ ");
        System.out.println("        " + b);
    }
}