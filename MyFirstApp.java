public class MyFirstApp {
public static void main (String[] args) {
System.out.println("I Rule!");
System.out.println("The World");

//A comment: I'm adding this other stuff

//Statements: declarations, assignments,
//method calls, etc.
int x = 3;
String name = "Dirk";
x = x * 17;
System.out.print("x is " + x);
double d = Math.random();


//While looping!
//Do something again and again
//Loops: for and while

while (x > 12) {
x = x - 1;
}

for (x = 0; x < 10; x = x + 1) {
System.out.print("x is now " + x);
}

//do something under this condition
//Branching: if/else tests
if (x == 10) {
System.out.print("x must be 10");
} else {
System.out.print("x isn’t 10");
}
if ((x < 3) & (name.equals("Dirk"))) {
System.out.println("Gently");
}

//Just a statement
System.out.print("this line runs no matter what");

}
}
