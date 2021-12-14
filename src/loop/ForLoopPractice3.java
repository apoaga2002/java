package loop;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        // today is snow.

        String str = ("today is snowy");

        System.out.println(str.charAt(0));
        for (int index =0; index < str.length()      ; index++){
            System.out.println(index+"*"+str.charAt(index));
          // print out only letter 'y' from the string
            for ( int i = 0   ;    i < str.length()      ; i++    ){
                if ( str.charAt(i) == 'y'){
                    System.out.println(str.charAt(i));

                }

            }
          //
            int count = 0;

            for (int i =0;i< str.length(); i++){
                if (str.charAt(i)== 'n')
                count++;

            }

        }
    }
}
