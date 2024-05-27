import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//195
        System.out.println("a"+"b");//ab
        System.out.println('a'+3);//100
        System.out.println((char)('a'+3));//d
        System.out.println("a"+1);//a1
        //this is same as: "a" +"1"
        // NOTE-when an integer is concatinated with string it is converted to it wrapper class interger call-toString()
        System.out.println("ujjwal"+new ArrayList<>());//ujjwal[]
        System.out.println("ujjwal"+ new Integer(56));//ujjwal56

        //System.out.println(new Integer(56)+new ArrayList<>());//ERROR
        //  "+" can only use for primitives and (with any complex object with atleast one String) Strings
        //opertor "-" can not be applied on Strings
        //EX.
        System.out.println(new Integer(56)+""+new ArrayList<>());


    }
}
