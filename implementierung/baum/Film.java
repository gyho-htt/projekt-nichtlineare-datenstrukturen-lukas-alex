class Film implements ComparableContent<Film>
{
  private int erscheinung;
  private String titel;
  private String regisseur;
  private String genre;
  private int fsk;
  private int laenge;
  Comparer vergleicher; 
  
  public Film(int pErscheinung, String pTitel, String pRegisseur, String pGenre, int pFsk, int pLaenge){
    this.erscheinung = pErscheinung;
    this.titel = pTitel;
    this.regisseur = pRegisseur;
    this.genre = pGenre;
    this.fsk = pFsk;
    this.laenge = pLaenge;
    this.vergleicher = new Comparer(); 
  }
  
  public boolean isGreater(Film pFilm, String pAttribut)
  {
    if(pAttribut.equals("laenge")){
      int pErgebnis = vergleicher.compareLength(this, pFilm);
      if(pErgebnis == 1) return true;
      if(pErgebnis == -1 || pErgebnis == 0) return false;
    }else if(pAttribut.equals("regisseur")) {
      int pErgebnis = vergleicher.compareDirector(this, pFilm);
      if(pErgebnis == 1) return true;
      if(pErgebnis == -1 || pErgebnis == 0) return false;
    } else if (pAttribut.equals("titel")) {
      int pErgebnis = vergleicher.compareTitle(this, pFilm);
      if(pErgebnis == 1) return true;
      if(pErgebnis == -1 || pErgebnis == 0) return false;  
    } else if (pAttribut.equals("genre")) {
      int pErgebnis = vergleicher.compareGenre(this, pFilm);
      if(pErgebnis == 1) return true;
      if(pErgebnis == -1 || pErgebnis == 0) return false;  
    } else if (pAttribut.equals("fsk")) {
      int pErgebnis = vergleicher.compareFsk(this, pFilm);
      if(pErgebnis == 1) return true;
      if(pErgebnis == -1 || pErgebnis == 0) return false;  
    } else if (pAttribut.equals("erscheinung")) {
      int pErgebnis = vergleicher.compareRelease(this, pFilm);
      if(pErgebnis == 1) return true;
      if(pErgebnis == -1 || pErgebnis == 0) return false;  
    } 
    return false;  
  }
  
  public boolean isEqual(Film pFilm, String pAttribut)
  {
    if(pAttribut.equals("laenge")){
      int pErgebnis = vergleicher.compareLength(this, pFilm);
      if(pErgebnis == 0) return true;
      if(pErgebnis == -1 || pErgebnis == 1) return false;
    }else if(pAttribut.equals("regisseur")) {
      int pErgebnis = vergleicher.compareDirector(this, pFilm);
      if(pErgebnis == 0) return true;
      if(pErgebnis == -1 || pErgebnis == 1) return false;
    } else if (pAttribut.equals("titel")) {
      int pErgebnis = vergleicher.compareTitle(this, pFilm);
      if(pErgebnis == 0) return true;
      if(pErgebnis == -1 || pErgebnis == 1) return false;  
    } else if (pAttribut.equals("genre")) {
      int pErgebnis = vergleicher.compareGenre(this, pFilm);
      if(pErgebnis == 0) return true;
      if(pErgebnis == -1 || pErgebnis == 1) return false;  
    } else if (pAttribut.equals("fsk")) {
      int pErgebnis = vergleicher.compareFsk(this, pFilm);
      if(pErgebnis == 0) return true;
      if(pErgebnis == -1 || pErgebnis == 1) return false;  
    } else if (pAttribut.equals("erscheinung")) {
      int pErgebnis = vergleicher.compareRelease(this, pFilm);
      if(pErgebnis == 0) return true;
      if(pErgebnis == -1 || pErgebnis == 1) return false;  
    } 
    return false;  
  }
  
  public boolean isLess(Film pFilm, String pAttribut)
  {
    if(pAttribut.equals("laenge")){
      int pErgebnis = vergleicher.compareLength(this, pFilm);
      if(pErgebnis == -1) return true;
      if(pErgebnis == 1 || pErgebnis == 0) return false;
    }else if(pAttribut.equals("regisseur")) {
      int pErgebnis = vergleicher.compareDirector(this, pFilm);
      if(pErgebnis == -1) return true;
      if(pErgebnis == 1 || pErgebnis == 0) return false;
    } else if (pAttribut.equals("titel")) {
      int pErgebnis = vergleicher.compareTitle(this, pFilm);
      if(pErgebnis == -1) return true;
      if(pErgebnis == 1 || pErgebnis == 0) return false;  
    } else if (pAttribut.equals("genre")) {
      int pErgebnis = vergleicher.compareGenre(this, pFilm);
      if(pErgebnis == -1) return true;
      if(pErgebnis == 1 || pErgebnis == 0) return false;  
    } else if (pAttribut.equals("fsk")) {
      int pErgebnis = vergleicher.compareFsk(this, pFilm);
      if(pErgebnis == -1) return true;
      if(pErgebnis == 1 || pErgebnis == 0) return false;  
    } else if (pAttribut.equals("erscheinung")) {
      int pErgebnis = vergleicher.compareRelease(this, pFilm);
      if(pErgebnis == -1) return true;
      if(pErgebnis == 1 || pErgebnis == 0) return false;  
    } 
    return false; 
  } 
  
  public int getLaenge()
  {
    return laenge;
  }
  
   public int getFsk()
  {
    return fsk;
  }
  
   public int getErscheinung()
  {
    return erscheinung;
  }
  
   public String getRegisseur()
  {
    return regisseur;
  }
  
   public String getTitel()
  {
    return titel;
  }
  
   public String getGenre()
  {
    return genre;
  }
  }