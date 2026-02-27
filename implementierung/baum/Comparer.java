public class Comparer 
{

    public int compareLength(Film f1, Film f2)
    {
      if(f1.getLaenge() < f2.getLaenge())
      {
        return -1;
      }
      if(f1.getLaenge() > f2.getLaenge())
      {
        return 1;
      }
      return 0;
    }
    
    public int compareFsk(Film f1, Film f2)
    {
      if(f1.getFsk() < f2.getFsk())
      {
        return -1;
      }
      if(f1.getFsk() > f2.getFsk())
      {
        return 1;
      }
      return 0;
    }
  
    public int compareRelease(Film f1, Film f2)
    {
      if(f1.getErscheinung() < f2.getErscheinung())
      {
        return -1;
      }
      if(f1.getErscheinung() > f2.getErscheinung())
      {
        return 1;
      }
      return 0;
    }

    public int compareDirector(Film f1, Film f2){
      int i = f1.getRegisseur().compareTo(f2.getRegisseur());
      if (i<0) return -1;
      if (i>0) return 1;
      return 0;
    }  
    
     public int compareTitle(Film f1, Film f2){
      int i = f1.getTitel().compareTo(f2.getTitel());
      if (i<0) return -1;
      if (i>0) return 1;
      return 0;
    }    
  
     public int compareGenre(Film f1, Film f2){
      int i = f1.getGenre().compareTo(f2.getGenre());
      if (i<0) return -1;
      if (i>0) return 1;
      return 0;
    }    
}