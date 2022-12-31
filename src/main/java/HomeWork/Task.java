package HomeWork;

public class Task {

    /*
     * 01.Create a method with no arguments;
     * 02.Create a method which return void;
     * 03.Create a method which return a boolean value;
     * 04.Create a method with one parameter Data type is integer;
     * 05.Create a method with Two parameter Data type is String;
     * 06.Create a method with Two parameter Data type is integer and String;
     * 07.Create a method with Three parameter Data type is integer,String , boolean;
     * 08.Create a method which accept two integer arguments and return sum of those two integer;
     * 09.Create a method which accept two string arguments and return boolean value;
     * 10.Print 1 to 10 using while loop;
     *
     */

    //* 01.Create a method with no arguments;
    public void sum() {
        System.out.println();
    }

    // * 02.Create a method which return void;
    public void sumone() {
        System.out.println();
    }

    //* 03.Create a method which return a boolean value;
    public boolean sumtwo() {
        int i = 10;
        int j = 10;
        if (i == j) {
            return true;
        } else {
            return false;
        }

    }
    public boolean sumthree(){
      boolean f=false;
      return f;
}
    //  * 04.Create a method with one parameter Data type is integer;
    public void one(int x) {
        System.out.println(x);
    }

    // * 05.Create a method with Two parameter Data type is String;
    public void tree(String l, String m) {
        System.out.println();
    }

    // * 06.Create a method with Two parameter Data type is integer and String;
    public void lamp (int k, String t) {
        System.out.println(k+t);
    }

        //* 07.Create a method with Three parameter Data type is integer,String , boolean;
        public void three ( int x, String a,boolean t){
            System.out.println(x + a + t);
        }

        //    * 08.Create a method which accept two integer arguments and return sum of those two integer;
        public int key ( int x, int y){
            int z = x + y;
            return z;
        }
        public int keytwo () {
            int x = 5;
            int y = 10;
            int z = x + y;
            return z;
        }
        //* 09.Create a method which accept two string arguments and return boolean value;
        public boolean pot () {
            String t = "Insha";
            String u = "Masud";
            if (t == u) {
                return true;
            } else {
                return false;
            }
        }

        // * 10.Print 1 to 10 using while loop;
        public void juice () {


            int i = 1;
            while (i <= 10) {
                System.out.println(i);
                i++;
            }
        }

    }

