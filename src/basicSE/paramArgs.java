package basicSE;

public class paramArgs {
    /*
     *@param args
     */
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));
    }
}
