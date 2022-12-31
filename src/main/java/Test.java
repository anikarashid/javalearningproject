public class Test {

    public static void main(String[] args){
        ClassEleven classeleven = new ClassEleven();

        System.out.println(classeleven.a);  //classeleven
        System.out.println(classeleven.i);
        System.out.println(classeleven.sum(20,30,5));

        ClassTwelve classtwelve = new ClassTwelve();

        System.out.println(classtwelve.i);        //classtwelve
        System.out.println(classtwelve.o);
        System.out.println(classtwelve.sum2());
        classtwelve.rose(10, "anika");

        ClassThirteen classthirteen = new ClassThirteen(); //classthirteen

        System.out.println(classthirteen.m);
        System.out.println(classthirteen.p);
        System.out.println(classthirteen.sum3());

    }
}
