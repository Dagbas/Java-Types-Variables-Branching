public class Main {
    public static void main(String[] args) {

        int age = 30;
        //int illegalAge = Thirty ; //java: cannot find symbol:   variable Thirty location: class Main
        byte goodByte = 30;
        //byte badByte = 130; returns provided int error

        String name = "Oscar" ;
        String blankname ; // variable blankname might not have been initialized //


        System.out.println(age);
        System.out.println(age+name);
        System.out.println(blankname + goodByte);

    }
}