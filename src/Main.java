class Calculator{
    int add(int x,int y){
        return x+y;
    }
    double add( int x,float y , double z){
        return x+y+z;
    }
    double add( int x,float y ){
        return x+y;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int   a = calc.add(2,3);
        float b = calc.add(2,3);
//        float d = calc.add(2,3.0f);
        double c = calc.add(2,3);
//        double e = calc.add(2.5f,3);

        System.out.println(a+" "+b + " " + c);



    }
}