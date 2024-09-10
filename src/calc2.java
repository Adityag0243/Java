class Idk{
    void fn(int x ){
        System.out.println("thik hai ");
    }
    void fn(float x ){
        System.out.println("samajh gaya ");
    }
}

public class calc2 {
    public static void main(String[] args) {
        Idk obj = new Idk();
        obj.fn(10);
        obj.fn(10.2f);
        obj.fn(10L);
//         obj.fn(true)  obj.fn(10.2) --> error
    }
}
