
package ınuyazeditor;

import java.util.Stack;


public class InuYazEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EditorPage frm = new EditorPage();
        frm.show();
        Stack test = new Stack();
        
        test.push(" test ");
        test.push(5);
        test.push(8);
        test.push(9);
        test.push(2);
        test.push(3);
        test.push(1);
        
        System.out.println(test);
        
      
        
        
        try
        {
            int sayi2 = (char)test.peek();
        }
        catch(Exception ex)
        {
           
            System.out.println(ex);
        }
        
    }
    
}
