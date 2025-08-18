
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if (elements.isEmpty()){
            return "The collection " + name + " is empty.";
        } else {
            int len = elements.size();
            String elementss = "";
            int i = 0;
            for (String s: elements){
                elementss +=s;
                if (!(i == len - 1)){
                 elementss += "\n";   
                }
                i++;
            }
            if (elements.size() == 1){
              return "The collection " + name + " has " + len + " element:\n" + elementss;  
            }
            return "The collection " + name + " has " + len + " elements:\n" + elementss;
        }
    }
    
}
