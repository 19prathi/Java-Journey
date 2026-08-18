package Functions;

public class CallByVaue {

    public static void main(String[] args){
        int a = 10;
        int b = 6;
        
        //Swap-By  values
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
