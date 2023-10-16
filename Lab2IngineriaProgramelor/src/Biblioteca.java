import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
    List<Carte> carti=new ArrayList<Carte>();
    List<RezultatCautare> fraza=new ArrayList<RezultatCautare>();
    public void addCarte(String numeCarte,String numeAutor,List<Pagina> pagini)
    {
        carti.add(new Carte(numeCarte,numeAutor,pagini));
    }
    public void afiseaza()
    {
        for(Carte carte : carti) {
            System.out.println("Carte");
            System.out.println("Titlu:"+carte.titlu_Carte+" Autor:"+carte.autor_Carte+" ");
            for(Pagina pagina: carte.paginiCarte)
            {

                pagina.afisarePagina();
            }
            System.out.println();
        }
    }
    public void cautaFraza(String Fraza)
    {
        for(Carte carte :carti) {
            for (Pagina pagina : carte.paginiCarte) {
                if (pagina.getText().contains(Fraza)) {
       //             afiseazaFraza(carte.titlu_Carte,pagina.getNr(),pagina.getText());
                   // System.out.println("Carte:"+carte.titlu_Carte+ " Nr:" + pagina.getNr() + " Text:" + pagina.getText());
                    fraza.add(new RezultatCautare(carte.titlu_Carte,pagina.getNr(),pagina.getText()));
                }
            }
        }
    }
    public void afiseazaFraza ()
    {
        for(RezultatCautare fraz:fraza)
        {
            System.out.println("Carte:"+fraz.Titlu+" Nr:" +fraz.nr+" Text:"+fraz.Text);
        }
    }
    public void sort()
    {
        Comparator<Carte> comparator = Comparator.comparing(Carte::getAutor).thenComparing(Carte::getTitlu);
        carti.sort(comparator);
    }
}
