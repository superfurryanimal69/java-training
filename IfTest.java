class IfTest {

public static void main (String[] args) {
int x = 10;

while(x > 2) {

if (x == 3) {
System.out.println("x must be 3");
} else {
  
  System.out.println("x is NOT 3");
}

x = x - 1;

}

System.out.println("This runs no matter what");
}

}
