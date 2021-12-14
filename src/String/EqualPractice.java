package String;

public class EqualPractice {
    public static void main(String[] args) {

        String name1 ="David";
        String name2 = "David";
        String name3 = new String(("David"));
        String name4 = new String("David");
        String name5 = name3;
        String name6 = "jenny";
        String name7 = "jenny";
        System.out.println(name5.equals(name4));


    }
}
