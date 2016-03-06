import java.util.Scanner;
import java.util.ArrayList;

//The Library Catalog definition
public class libraryCatalog{

    //Variables
    static int choice;
    static Scanner userInput = new Scanner(System.in);
    static Scanner choiceInput = new Scanner(System.in);
    // Public variables
    public String bookName;
    public String bookType;//It can be novel or art album
    public String novelType;//Example: SF or mystery etc.
    public String paperQuality;//Paper Quality for art album (Example:Bronze, Silver, Gold)
    public int numberOfPages;
    
    //Constructor
    static ArrayList<String> UserList = new ArrayList<String>();
    static ArrayList<libraryCatalog> BookList = new ArrayList<libraryCatalog>();
    
    //Book creator method
    public void createBook(){
        System.out.println("> Enter the name of the book: ");
        bookName = userInput.nextLine();
        System.out.println("> Enter the type of book(Novel or Art Album): ");
        bookType = userInput.nextLine();
        if(bookType.equals("novel") || bookType.equals("Novel")){
            System.out.println("> Enter the type of novel: ");
            novelType = userInput.nextLine();
        }else{
            System.out.println("> Enter paper quality for art album: ");
            paperQuality = userInput.nextLine();
        }
        System.out.println("> Enter the number of pages: ");
        numberOfPages = userInput.nextInt();
    }
    
    public String displayBook() {
        String BookInfo = "NAME" + bookName + bookType + numberOfPages;
        return BookInfo;
    }
    
    public void addBook(){
        libraryCatalog newBook = new libraryCatalog();
        newBook.createBook();
        BookList.add(newBook);
        System.out.println("> You have added the book. ");
    }
    
    public void displayBookList(){
        if(BookList.size() == 0){
            System.out.println("There Library is Empty!");
        }else{
            for(int i = 0 ; i < BookList.size(); i++){
                System.out.println(BookList.get(i).displayBook());
            }
        }
    }
    
    public void removeBook(){
        int i = 0;
        System.out.println("Here are all the books.");
        while (i < BookList.size() && BookList.size() > 0){
            System.out.printf(i+1,BookList.get(i));
            i= i+1;
        }
        
        System.out.println("Choose an avaiable book :");
        int BookChoice = choiceInput()-1;
    }
    
    public static void main(String[] args){
        
        //Create an object myBook using Book constructor from Book class.
        libraryCatalog secondBook = new libraryCatalog();
        secondBook.addBook();
        secondBook.displayBookList();
        //Acces getBookName method from Book class.
        
      
    }
}