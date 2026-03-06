public interface ComparableContent<ContentType> {

  public boolean isGreater(ContentType pContent, String pAttribut);

  public boolean isEqual(ContentType pContent, String pAttribut);
     
  public boolean isLess(ContentType pContent, String pAttribut);
  
  public boolean isGreater(int pContent, String pAttribut);

  public boolean isEqual(int pContent, String pAttribut);
     
  public boolean isLess(int pContent, String pAttribut);
  
  public boolean isGreater(String pContent, String pAttribut);

  public boolean isEqual(String pContent, String pAttribut);
     
  public boolean isLess(String pContent, String pAttribut);

}
