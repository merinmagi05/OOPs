package operations;

public class multiply implements calculate{
    public void cal(int x, int y){
        int mul = x*y;
        System.out.println("Multiplication of Numbers "+x+" and "+y+":"+mul);
    }
}
