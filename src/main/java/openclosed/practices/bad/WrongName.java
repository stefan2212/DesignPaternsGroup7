package openclosed.practices.bad;

public class WrongName {
    public int x(int a,int b) {
        return a+b-1;
    }

    public int y(int a, int b) {
        if(a+b == x(a,b)){
            return 1;
        } else {
            return -1;
        }
    }
}
