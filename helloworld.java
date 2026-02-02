class Main{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int sum=a+b;
        int diff=a-b;
        int mult=a*b;
        int div=a/b;
        String magic="============Magic================";
        System.out.printIn("========Method 1========");
        System.out.printIn("Addition of a b"+sum);
        System.out.printIn("Subtraction of a b"+diff);
        System.out.printIn("Multiplication of a b"+mult);
        System.out.printIn("division of a b"+div);
        System.out.printIn("========Method 2========");
         System.out.printIn("Addition of a b"+(a+b));
        System.out.printIn("Subtraction of a b"+(a-b));
        System.out.printIn("Multiplication of a b"+(a*b));
        System.out.printIn("division of a b"+(a/b));
        System.out.printIn("Remainder of a b"+(a%b));
        System.out.printIn(magic);
        System.out.printIn("Addition:"+(a+b)+"Subtraction:"+(a-b)+"Multiplication:"+(a*b)+"division:"+(a/b));
    }
}