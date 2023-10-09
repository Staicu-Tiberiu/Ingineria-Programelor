import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Parinte p = new Parinte("mihai");
         Copil c = new Copil("Ion");
        //p.afiseaza();
        //c.afiseaza();
        List<Parinte> list1=new ArrayList<Parinte>();
        Parinte p1=new Parinte("Ilie");
        list1.add(p1);
        Copil c1=new Copil("Andrei");
        list1.add(c1);
        Parinte p2=new Parinte("Ion");
        Copil c2=new Copil("Alex");
        list1.add(p2);
        list1.add(c2);
        list1.add(p);
        list1.add(c);


    //   Collections.sort(list1, new Comparator<Parinte>() {
        //   @Override
          // public int compare(Parinte o1, Parinte o2) {
         //      return (o1.nume.compareTo(o2.nume));
        //   }
        // });
       Collections.sort(list1,(o1, o2) ->o1.nume.compareToIgnoreCase(o2.nume));
        for(Parinte p12 :list1)
        {
            p12.afiseaza();
        }
    }
}