public class Exception {
    public static void main(String[] args) {
       // String x = null;
        //System.out.println(x.length());when you run the program,it will show you an exception
        try {//method of try throws the exception;
            //when you divide by 0,the output will show you an exception thus  handling this exception using the try catch method
            int m = 5, n = 0;
            int c = m / n;
            System.out.println("Result=" + c);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
    }
}
