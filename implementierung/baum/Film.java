public class Film implements ComparableContent<Film>
{
  private int erscheinung;
  private String titel;
  private String regisseur;
  private String genre;
  private int fsk;  
  public Film(int pErscheinung, String pTitel, String pRegisseur, String pGenre, int pFsk){
    this.erscheinung = pErscheinung;
    this.titel = pTitel;
    this.regisseur = pRegisseur;
    this.genre = pGenre;
    this.fsk = pFsk;
  }
  
  public boolean isGreater(Film pFilm)
  {
    if(this.groesse > pFilm.groesse)
    {
      return true;
    }else {
      return false;
    } // end of if-else
  }

  public boolean isEqual(Film pFilm)
  {
    if(this.groesse == pFilm.groesse)
    {
      return true;
    }else {
      return false;
    } 
  }
    
  public boolean isLess(Film pFilm)
  {
    if(this.groesse < pFilm.groesse)
    {
      return true;
    }else {
      return false;
    } // end of if-else
}
}