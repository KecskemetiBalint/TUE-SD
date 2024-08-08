package pattern.Circular;

public class CircularA {
    public static CircularB circB = new CircularB(CircularA.getNum());
    private static int num = 0;

    public CircularA(int i){
        CircularA.num = i;
    }

    public static int getNum() {
        return num;
    }
}
