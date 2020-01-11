package openclosed.practices.good;

public class GoodName {
    public int sum(int a,int b) {
        return a+b-1;
    }

    public boolean sumVerifier(int a,int b) {
        if(a+b == sum(a,b)) {
            return true;
        } else {
            throw  new SumNotCorrectException("The sum of numbers is not correct");
        }
    }
}
