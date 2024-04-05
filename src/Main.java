import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

//        String txt = "Hello World";
//        System.out.println(txt.toUpperCase());
//        System.out.println(txt.toLowerCase());
//        System.out.println(txt.indexOf("Wo"));
        int [] nums2 = new int[] {1,2,3,4,5,6};
        nums2[2] = 9;
        int [] nums4 = new int[8];
        System.arraycopy(nums2, 0, nums4, 1,3);
        System.out.println(Arrays.toString(nums4));


//askar (boyuk ->kicik)
//        double d = 100.04;
//        long l = (long)d;
//        int i = (int)l;
// muraciet olunmatyan (kicik->boyuk)
//        int a=5;
//        double pi=3.14;
//        float b=3.2f;
//        int v= (int) ((a*pi)/b);
//        System.out.println(v);
//String ad=String.valueOf(2);
//        System.out.println(ad);



//        String s1 = "salam";
//        String s2 = "dunya";
//        StringJoiner sj = new StringJoiner(",", "!","!");
//        sj.add(s1);
//        sj.add(s2);
//        System.out.println(sj);

//        int a = 5;
//        Integer a1 = a;
//
//        String s1 = "7";
//        a1 = Integer.valueOf(s1);
//
//        System.out.println(s1 + (a1 + 7));
//
//        double d = 3.14;
//
//        Double d2 = d;
//
//        int a3 = Integer.valueOf("12");
//        System.out.println(a3);
//
//
//
//        System.out.println(a1 + 7);
    }
}
