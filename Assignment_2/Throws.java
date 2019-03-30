
package throw_and_throws_example;

public class Throws {
     void Vote(int age)throws ArithmeticException {
        if(age<18)
            System.out.println("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }
    public static void main(String[] args) {
        Throw obj1=new Throw();
        obj1.Vote(1);
        System.out.println("End of the Program");
    }
}
