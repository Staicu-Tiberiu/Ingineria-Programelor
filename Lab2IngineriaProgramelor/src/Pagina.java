public class Pagina {
    int Nr;
    String Text;
    public void setNr(int nr)
    {
        this.Nr=nr;
    }
    public void setText(String text)
    {
        this.Text=text;
    }
    public String getText()
    {
        return Text;
    }
    public int getNr()
    {
        return Nr;
    }
    public Pagina(int nr,String text)
    {
        this.Nr=nr;
        this.Text=text;
    }
    public void afisarePagina()
    {
        System.out.println("Nr:"+ Nr+" Text:"+Text);
    }
}
