package HelloWorld;
import java.util.Scanner;
// Users class is to check the user input and insure that user is authorized
public class UsersClass {


  private String UserData[][] =new String [5][2] ;
  public Boolean UserLogin  ;
  UsersClass(){
    AddUser("kareem","password");
    
    CheckUser();
  }
  // this function is for adding username and password for the userdata array 
  public void AddUser(String UserName, String Password){
   
        UserData[0][0]= UserName;
        UserData[0][1]=Password;
          
          
  }
  // checking if username and password are correct
 
  public void  CheckUser(){
    // user is not logged in yet
    UserLogin = false ;
    // add user interface input 
    Scanner scanner = new Scanner(System.in);
    // check user data array usernames and passwords
    System.out.println("User Name");
      String InputUser =scanner.nextLine();
      
      System.out.println("Password");
      String InputPass =scanner.nextLine();
      
    for (int counter=0 ; counter<5 ;counter++ ) {
      
      
      // if user didn't input username and password 
      if (InputUser.equals("") || InputPass.equals( "")){ System.out.println("Please enter username and password");}
      
      if (InputUser.equals( UserData[counter][0]) && InputPass.equals(UserData[counter][1])) {
        
          UserLogin=true ;

        
        
        break ;
      }
     
    }
  
  // if user is logged in thank him and print HelloWorld
  
  if (UserLogin == true) {
     System.out.println("Thank you for loging in " + UserLogin);
     printing Prnt = new printing() ;
     
  } else {
     System.out.println("You are not authorized to print Hello World");
     CheckUser();
  }
  
}
}