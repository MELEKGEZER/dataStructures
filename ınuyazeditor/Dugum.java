
package ınuyazeditor;


public class Dugum {
    int index;
    String kelime;
    
    public Dugum(int i, String s)
    {
        index = i;
        kelime = s;
    }
    
    public String ToString()
    {
       return index + " - " + kelime;
    }
    
}
