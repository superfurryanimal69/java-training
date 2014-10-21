public class UseADuck {

public static void main (String[] args) {

//Local variables
int duckSize = 0;
String userInput = null; 
//boolean isInteger = false;

//Create a GameHelper Object to get a response from the user
GameHelper getDuckSize = new GameHelper();

while(true) {

try {

userInput = getDuckSize.getUserInput("Enter the size of the duck you want to create");
duckSize = Integer.decode(userInput);

//If an error isn't thrown it means the user has entered something that can be converted in to an integer
//isInteger = true;

break;

} catch (NumberFormatException num) {

System.out.println("Sorry! I can't convert this (" + userInput +") to an integer");

}
}

//Create a duck
Duck d = new Duck(duckSize);
}
}
