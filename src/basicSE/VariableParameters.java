package basicSE;
//2022年9月11日23:27:46
//传入参数是可变的
public class VariableParameters {
    public static int add(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("不传入参数 "+add());
        System.out.println("传递1个参数 "+add(1));
        System.out.println("传递多个参数 "+add(2,1));
        System.out.println("传递数组 "+add(new int[]{1,3,2}));
    }
}
