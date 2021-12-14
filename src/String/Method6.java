package String;

public class Method6 {
    public static void main(String[] args) {
        String name = "  Techtorial Acaemy  is located at plains  ";

        String updateName = name.trim();
        System.out.println(updateName);
        System.out.println(name);

      String part1 =  updateName.substring(4);
     String part2 = updateName.substring(4,12);
        System.out.println(part2);




    }
}
