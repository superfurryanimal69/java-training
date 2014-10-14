import java.util.ArrayList;

public class DotCom {

private ArrayList<String> locationCells;

//NB: Don't need numOfHits variable

public void setLocationCells(ArrayList<String> loc) {

locationCells = loc;

}

public String checkYourself(String userInput) {

String result = "Miss";

int index = locationCells.indexOf(userInput);

if (index >= 0) {

locationCells.remove(index);

if (locationCells.isEmpty()) {

result = "Kill";

}
else {

result = "hit";

}

}//Close if

return result;
} //Close method

} //Close class

