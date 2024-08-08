package pattern.Circular;

public class CircularB {
    public static CircularA circA = new CircularA(CircularB.getNum());
    private static int num = 0;

    public CircularB(int i){
        CircularB.num = i;
    }

    public static int getNum() {
        return num;
    }
}
