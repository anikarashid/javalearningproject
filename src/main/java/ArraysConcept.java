import java.util.ArrayList;
import java.util.LinkedList;
public class ArraysConcept {
    public static void main(String[] args) {


        String s = "purple";
        String s1 = "White";
        String s2 = "Green";
        String s3 = "Black";
        String s4 = "Yellow";
        //Static , Dynamic,2D,3D
        //Static 1D ARRAY
        int a[] = new int[4];//Static 1D
        a[0] = 2;
        a[1] = 6;
        a[2] = 15;
        a[3] = 20;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("**********");

        //Static 2D ARRAY
        //arraylist [Dynamic]
        ArrayList al = new ArrayList();

        al.add("purple");
        al.add(4);
        al.add(false);
        al.add(3.0);
        al.add('a');
        al.add(3.5);
        System.out.println(al.get(2));


        System.out.println("***************");

        for (int k = 0; k < al.size(); k++) {
            System.out.println(al.get(k));
        }
        System.out.println("************");

        LinkedList lk = new LinkedList();
        lk.add(5);
        lk.add("nice");
        lk.add(10.10);
        lk.add(10.10);
        for (int i = 0; i < lk.size(); i++) {
            System.out.println(lk.get(i));
        }


    }
}
