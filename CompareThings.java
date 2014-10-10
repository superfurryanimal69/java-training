class CompareThings {

//instance variables
private int one = 0;
private String string1 = null;
private String[] stringarray1 = null;

//Assign a value to instance integer variable "one"
public void setInteger(int intparam) {

one = intparam;

}

//Assign a value to instance String variable "string1"
public void setString(String stringparam) {

string1 = stringparam;

}

//Assign a value to String array reference variable "stringarray1"
public void setStringArray(String[] strarrypointer) {

stringarray1 = strarrypointer;

}

public int getInteger() {

return one;

}

public String getString() {

return string1;

}

public String[] getStringArray() {

return stringarray1;

}

}
