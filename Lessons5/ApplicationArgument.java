package Lesson5;

public class ApplicationArgument {
    public static void main(String[] args) {

 //       for (String arg: args) {
 //          StringBuffer sbf = new StringBuffer(arg);//
        //        sbf.reverse();
//           System.out.print(sbf);
 //      }

           for (int i = args.length - 1; i >= 0 ; i--) {
               System.out.println(args[i]);
        }
    }
}
