public class Main {
    public static void main(String[] args) {
        int a=5,b=3,c=-1,d=0,e=-5;
        int res;
        res= --c - a-- + ++e + --b -d-- + ++d -a++ + ++b + c++ -b-- + --a;

        System.out.println("a: "+ a +"  b: "+b+"  c: "+c+"  d: "+d+"  e: "+e );
        System.out.println("overall result is "+res);
    }
}