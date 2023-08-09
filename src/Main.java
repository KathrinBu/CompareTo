import java.awt.print.Printable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Ploshad> ploshadArrayList=new ArrayList<>();
        Scanner scanner=new Scanner(new File("vvod.txt"));
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        Triangle triangle=new Triangle(a,b,c);
        double r=scanner.nextDouble();
        Circle circle=new Circle((int) r);
        ploshadArrayList.add(triangle);
        ploshadArrayList.add(circle);
        System.out.println(ploshadArrayList);
        ploshadArrayList.sort((a1, b1)-> (int) (a1.ploshad()- b1.ploshad()));
        System.out.println(ploshadArrayList);
        Ploshad ploshad1=new Triangle(a,b,c);
        Ploshad ploshad2=new Circle((int) r);
        System.out.println(ploshad1.ploshad()+" - "+ ploshad2.ploshad());
        System.out.println(ploshad1.equals(ploshad2));
        Calculate result1;
        result1 =(x, y)->x+y;
        int cal1 = result1.calculate(7,89);
        Calculate result2;
        result2=(x,y)->x/y;
        int cal2=result2.calculate(88,11);
        System.out.println(cal1+" - "+cal2);

//        Printable printable=(str1)->(str1+str1);
//        String pr=printable.toString().print("Hello!");
//        System.out.println(printable.print());

    }
}
