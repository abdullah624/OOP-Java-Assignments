
package throw_and_throws_example;

public class Finally {
    public static void main(String[] args) {
        int[] ar = new int[5];
        try{
            ar[4] = 10;
            System.out.println("Inside the Try Block.");
        }
        catch(NullPointerException e){
            System.out.println("Exception Happened.");
        }
        finally{
            System.out.println("Finally Executed.");
        }
        System.out.println("Outside try-catch-finally block");
    }
}
