public class Baumverwaltung
{
  BinarySearchTree bstLaenge = new BinarySearchTree();
  BinarySearchTree bstErscheinung = new BinarySearchTree();
  BinarySearchTree bstRegisseur = new BinarySearchTree();
  BinarySearchTree bstTitel = new BinarySearchTree();
  BinarySearchTree bstGenre = new BinarySearchTree();
  BinarySearchTree bstFsk = new BinarySearchTree();
  public Baumverwaltung()
  {
    
  }
  
  public void einfuegen(Film pFilm)
  {
    bstLaenge.insert(pFilm, "laenge");
    bstErscheinung.insert(pFilm, "erscheinung");
    bstRegisseur.insert(pFilm, "regisseur");
    bstTitel.insert(pFilm, "titel");
    bstGenre.insert(pFilm, "genre");
    bstFsk.insert(pFilm, "fsk");
  }
  
  public void loeschen(Film pFilm)
  {
    bstLaenge.remove(pFilm, "laenge");
    bstErscheinung.remove(pFilm, "erscheinung");
    bstRegisseur.remove(pFilm, "regisseur");
    bstTitel.remove(pFilm, "titel");
    bstGenre.remove(pFilm, "genre");
    bstFsk.remove(pFilm, "fsk");
  }
  
  public Film suchen(BinarySearchTree pBst, String pWort)
  {
    if(pBst == bstRegisseur)
    {
      
    } else if(pBst == bstTitel){
    
    } else if (pBst == bstGenre) {
        
      } else {
      return null;
        } // end of if-else
    return eFilm;
  }
  
  public Film suchen(BinarySearchTree pBst, int pZahl)
  {
    if(pBst == bstErscheinung)
    {
      pBst.search(pZahl, "erscheinung");
    } else if(pBst == bstFsk){
    
    } else if (pBst == bstLaenge) {
        
      } else {
      return null;
        } // end of if-else
    return eFilm;
  }
}