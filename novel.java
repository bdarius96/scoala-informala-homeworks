 
 public class Novel extends Book{
  	
 static Scanner novelInput = new Scanner(System.in);
  	
  static ArrayList<Novel> novelInventory = new ArrayList<Novel>();
  static Book bookInventoryObject;	
 	
  public Novel(){
  public Novel(String bookName, int numberpage, String novelType) {
  super(bookName, numberpage);
  this.novelType = novelType;

}