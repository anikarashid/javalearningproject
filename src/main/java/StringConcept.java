public class StringConcept {

    public static void main(String[] args) {

        String a = "coadddding";//1.String literal,2.By creating String object(String Buffer , String builder)

        System.out.println("this String will  give us total length-->" + a.length());
        System.out.println("this String will give us charAt index-->" + a.charAt(3));
        System.out.println("this String will give us index of that specific char-->" + a.indexOf('d'));
        System.out.println("this String will give us last occurance-->" + a.lastIndexOf('d'));
        System.out.println(a.indexOf('d', a.indexOf('d') + 2));
        System.out.println(a.lastIndexOf('d', a.lastIndexOf('d') + 2));  //String concat &

        String s = "Seleneium"; //1. String literal , 2.By creating string object(String Buffer, String builder)
        String s1 = "Seleneium";

        System.out.println("It will give us total length of sting : " + s.length());
        System.out.println("It will give us char at that index " + s.charAt(2));
        System.out.println("It will give us index of that specific char " + s.indexOf('e'));
        System.out.println("It will give us last occurance " + s.lastIndexOf('e'));
        System.out.println("" + s.indexOf('e', s.indexOf('e') + 1));

        //String concat &
        String S3 = s + s1;
        System.out.println(S3);
        String s4 = s.concat("hellow");
        System.out.println(s);
        System.out.println(s4);

        // String By creating object
        StringBuffer sbf = new StringBuffer("Good");//Sychronized ( Thread Safe )
        sbf.deleteCharAt(0);
        System.out.println(sbf);
        StringBuilder sb = new StringBuilder("Java");// Non Sychronized ( Not Thread Safe )
        sb.append('a');
        System.out.println(sb);

        //String comparison
        String p = "Java";
        String q = "Learning";
        String r = "java";
        p.equals(q);
        System.out.println(p.equals(q));//value
        System.out.println(p == q);//ref variable
        System.out.println(p.equals(r));
        System.out.println(p == r);
        System.out.println(p.equalsIgnoreCase(q));
        System.out.println(p.equalsIgnoreCase(r));

        ////Trim
        String g = " Good ";
        System.out.println(g);
        String b = g.trim();
        System.out.println(b);

        //Split
        String f = "i am Navigating to java Learning";
        System.out.println(f);
        String f1[] = f.split(" ");

        for (int i = 0; i < f1.length; i++) {
            System.out.println(f1[i]);
        }
        ;//String substring method
        String j = "Java Learning";
        int l = j.length();
        System.out.println(l);
        System.out.println(j.substring(3));
        String k ="Knowledge";
        System.out.println("#########################" );
        System.out.println("I am using substring two parameter : " + k.substring(2,5));

        //Starts and End With
        String B ="Book Learning";
        System.out.println( B.startsWith("Book") );
        System.out.println( B.endsWith("Learning") );
    }
}



