public class StringConceptPractice {
    public static void main(String[] args) {

        String a = "Coadddding";//1.String literal,2.By creating String object(String Buffer , String builder)
        String a2="Daynamic";
        System.out.println("this String will  give us total length-->" + a.length());
        System.out.println("this String will give us charAt index-->" + a.charAt(3));
        System.out.println("this String will give us index of that specific char-->" + a.indexOf('d'));
        System.out.println("this String will give us last occurance-->" + a.lastIndexOf('d'));
        System.out.println(a.indexOf('d', a.indexOf('d') + 2));
        System.out.println(a.lastIndexOf('d', a.lastIndexOf('d') + 2));  //String concat &

        //String concat
        String a3= a+a2;
        System.out.println(a3);
        a.concat("hellow");
        String a4=a.concat("hellow");
        System.out.println(a);
        System.out.println(a4);
        //String Create object
        StringBuffer sbf = new StringBuffer("Good");  // Synchronized (thread safe)
        sbf.deleteCharAt(1);
        System.out.println(sbf);
        StringBuilder sb = new StringBuilder("Java");  // Non Synchronized (not thread safe/ local)
        sb.append('s');
        System.out.println(sb);
        //String comparison
        String h ="Honey";
        String i ="Island";
        String j ="Honey";
        h.equals(i);
        System.out.println(h.equals(i));//value comprassion
        System.out.println((h==i));//ref variable
        System.out.println(h.equals(j));
        System.out.println(h==j);
        System.out.println(h.equalsIgnoreCase(i));
        System.out.println(h.equalsIgnoreCase(j));
        //String Trim
        String f =" Fine ";//before and after removes whitespaces
        System.out.println(f);
        f.trim();
        String g = f.trim();
        System.out.println(g);
        //String Split
        String w = "whipped:Cream";//between in words ("whiped","Cream")String array is here this style
        System.out.println(w);
        w.split(" ");
        String w1[] = w.split(":");
        for(int k=0;k<w1.length;k++) {  //w1 ;length Dynamic
            System.out.println(w1[k]);

            String v = "Violet is a shade of purple";
            System.out.println(v);
            String v1[] = v.split(" ");

            for (int x = 0; x < v1.length; x++) {
                System.out.println(v1[x]);
            }
            ;//String substring method
            String Y = "Java Learning";
            int l = j.length();
            System.out.println(l);
            System.out.println(j.substring(5));

            String x ="Initialization";
            System.out.println("****************" );
            System.out.println("I am using substring two parameter : " + x.substring(5,9));

            //Starts and End With
            String B ="Work Learning";
            System.out.println( B.startsWith("Work") );
            System.out.println( B.endsWith("Learning") );

        }
    }
}





