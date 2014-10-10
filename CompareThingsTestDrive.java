class CompareThingsTestDrive {

public static void main(String[] args) {

//Create some CompareThings objects
CompareThings ObjectNumber1 = new CompareThings();
CompareThings ObjectNumber2 = new CompareThings();
CompareThings ObjectNumber3 = new CompareThings();
CompareThings ObjectNumber4 = new CompareThings();

//Create some String Array objects
String[] aurevoir = new String[10];
String[] goodbye = new String[5];
String[] aufwiedersehen = new String[15];


//Display the new CompareThings Objects' instance variables at instantiation
System.out.println("#######Object Instance Variables before anything else happens#######");
System.out.println();
System.out.println();
System.out.println("ObjectNumber1 instance variable 'one': " + ObjectNumber1.getInteger());
System.out.println("ObjectNumber1 instance variable 'string1': " + ObjectNumber1.getString());
System.out.println("ObjectNumber1 instance variable 'stringarray1': " + ObjectNumber1.getStringArray());
System.out.println();
System.out.println();
System.out.println("ObjectNumber2 instance variable 'one': " + ObjectNumber2.getInteger());
System.out.println("ObjectNumber2 instance variable 'string1': " + ObjectNumber2.getString());
System.out.println("ObjectNumber2 instance variable 'stringarray1': " + ObjectNumber2.getStringArray());
System.out.println();
System.out.println();
System.out.println("ObjectNumber3 instance variable 'one': " + ObjectNumber3.getInteger());
System.out.println("ObjectNumber3 instance variable 'string1': " + ObjectNumber3.getString());
System.out.println("ObjectNumber3 instance variable 'stringarray1': " + ObjectNumber3.getStringArray());
System.out.println();
System.out.println();
System.out.println("#######Change Instance Variables#######");
System.out.println();
System.out.println();

//Only change three of the objects
ObjectNumber1.setInteger(-100);
ObjectNumber1.setString("Foo");
ObjectNumber1.setStringArray(aurevoir);

System.out.println("ObjectNumber1 instance variable 'one': " + ObjectNumber1.getInteger());
System.out.println("ObjectNumber1 instance variable 'string1': " + ObjectNumber1.getString());
System.out.println("ObjectNumber1 instance variable 'stringarray1': " + ObjectNumber1.getStringArray());
System.out.println();
System.out.println();

ObjectNumber2.setInteger(999999);
ObjectNumber2.setString("Fighter");
ObjectNumber2.setStringArray(goodbye);

System.out.println("ObjectNumber2 instance variable 'one': " + ObjectNumber2.getInteger());
System.out.println("ObjectNumber2 instance variable 'string1': " + ObjectNumber2.getString());
System.out.println("ObjectNumber2 instance variable 'stringarray1': " + ObjectNumber2.getStringArray());
System.out.println();
System.out.println();

ObjectNumber3.setInteger(27);
ObjectNumber3.setString("Foo Fighter");
ObjectNumber3.setStringArray(aufwiedersehen);

System.out.println("ObjectNumber3 instance variable 'one': " + ObjectNumber3.getInteger());
System.out.println("ObjectNumber3 instance variable 'string1': " + ObjectNumber3.getString());
System.out.println("ObjectNumber3 instance variable 'stringarray1': " + ObjectNumber3.getStringArray());
System.out.println();
System.out.println();

//Check the values of the references to the CompareObjects objects
System.out.println(ObjectNumber1);
System.out.println(ObjectNumber2);
System.out.println(ObjectNumber3);
System.out.println();
System.out.println();

//Now everything is assigned differently 'fanny on' re-assigning and checking for equality
ObjectNumber4 = ObjectNumber1;

if (ObjectNumber1 == ObjectNumber2) {

System.out.println("Reference ObjectNumber1 is the same as reference ObjectNumber2");

} else {

System.out.println("Reference ObjectNumber1 is NOT the same as reference ObjectNumber2");

}

if (ObjectNumber2 == ObjectNumber3) {

System.out.println("Reference ObjectNumber2 is the same as reference ObjectNumber3");

} else {

System.out.println("Reference ObjectNumber2 is NOT the same as reference ObjectNumber3");

}

if (ObjectNumber4 == ObjectNumber1) {

System.out.println("Reference ObjectNumber4 IS the same as reference ObjectNumber1");

} else {

System.out.println("Reference ObjectNumber4 is NOT the same as reference ObjectNumber1");

}





}

}
