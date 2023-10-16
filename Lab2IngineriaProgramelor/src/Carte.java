import java.util.ArrayList;
import java.util.List;
public class Carte {
    String titlu_Carte;
    String autor_Carte;
    List<Pagina> paginiCarte=new ArrayList<Pagina>();
    public void setTitlu_Carte(String numeCarte)
    {
        this.titlu_Carte=numeCarte;
    }

    public void autor_Carte(String numeAutor)
    {
        this.autor_Carte=numeAutor;
    }
    public String getAutor()
    {
      return autor_Carte;
    }
    public String getTitlu()
    {
     return titlu_Carte;
    }
    public Carte(String titlu,String autor,List<Pagina> pagini)
    {
     this.titlu_Carte=titlu;
     this.autor_Carte=autor;
     for(Pagina pagina : pagini) {
       paginiCarte.add(pagina);
     }
    }
    public void cautaFraza(String Fraza)
    {
        for(Pagina pagina : this.paginiCarte)
        {
            if(pagina.getText().contains(Fraza))
            {
                System.out.println(pagina.getNr()+" "+pagina.getText());
            }
        }
    }
}
