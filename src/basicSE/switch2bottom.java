package basicSE;
//2022年7月23日15:31:19
//switch贯穿示例
public class switch2bottom {
    public static void main(String[] args){
        int score = 5;
        switch(score){
            case 6:
                score++;
            case 5://第一次进入
                score++;
            case 4://坐电梯开始
                score++;
            case 3:
                score++;
            case 2:
                score++;
            case 1:
                score++;
            case 0://到最低,即贯穿现象
                score++;
            default:
                System.out.println("出电梯并打印score:"+score);
        }
    }
}
