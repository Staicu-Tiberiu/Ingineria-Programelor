import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca=new Biblioteca();
        List<Pagina> pagini=new ArrayList<Pagina>();
        pagini.add(new Pagina(1,"mere"));
        pagini.add(new Pagina(2,"pere"));
        pagini.add(new Pagina(3,"mere stricate"));
        pagini.add(new Pagina(4,"pere stricate"));
        biblioteca.addCarte("Fructe","Ion",pagini);



        List<Pagina> pagini1 =new ArrayList<Pagina>();
        pagini1.add(new Pagina(1,"Ana"));
        pagini1.add(new Pagina(2,"Mara"));
        pagini1.add(new Pagina(3,"Para"));
        pagini1.add(new Pagina(4,"Impara"));
        biblioteca.addCarte("AA","Alex",pagini1);
        biblioteca.afiseaza();

        System.out.println("");
        biblioteca.sort();

        biblioteca.afiseaza();

        System.out.println();
        biblioteca.cautaFraza("mere");
        biblioteca.afiseazaFraza();
    }
}