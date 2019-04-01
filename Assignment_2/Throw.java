package throw_and_throws_example;

public class Throw {
    void Vote(int age){
        if(age<18)
            throw new ArithmeticException("You're not eligible to vote");
        else
            System.out.println("Eligible for voting");
    }
    public static void main(String[] args) {
        Throws obj1=new Throws();
        obj1.Vote(1);
        System.out.println("End of the Program");
    }
    
}
