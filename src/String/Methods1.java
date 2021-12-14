package String;

public class Methods1 {
    public static void main(String[] args) {

        String device = "microphone";
        device.concat("is an input device");

        System.out.println(device);
        char ch = device.charAt(1);
        System.out.println(ch);

        String example = "this is a numbers";
        char lastChar = example.charAt(example.length() -1);
        System.out.println(lastChar);

        String example2 = "is over";
        int count = example2.length();
        char lastLetter =example2.charAt(+1);
        System.out.println(lastLetter);


    }
}
