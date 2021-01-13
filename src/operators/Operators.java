/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author NAVTTC07
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5;
        int b=10;
        a++;//increment (pre/post)(a++ post)(++a)
        //a--;//decrement
        System.out.println("a "+a);//6
        int d=a++;//post
        int c=++a;//pre
        
        System.out.println("d = "+d);//6
        //System.out.println("b = "+b);
        System.out.println("c = "+c);//8
        System.out.println("a "+a);//8
        
        int num=2;
        int value=1;
        
        System.out.println(num +" * "+value+" = "+ (num*value++));
       // value++;
        System.out.println(num +" * "+value+" = "+ (num*value++));
         //value++;
        System.out.println(num +" * "+value+" = "+ (num*value++));
         //value++;
        System.out.println(num +" * "+value+" = "+ (num*value++));
        // value++;
        System.out.println(num +" * "+value+" = "+ (num*value++));
         //value++;
        System.out.println(num +" * "+value+" = "+ (num*value++));
      
        
        //5 * 1 = 5
        //5*2=10
        //5*3=10
        //5*4=10
        //5*5=10
        
    }
    
}
