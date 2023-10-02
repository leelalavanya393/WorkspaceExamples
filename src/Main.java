class SingletonExample{
    private static  SingletonExample   s = null;
    public String str;

    private SingletonExample (){
        str = "hello i am a singleton example";
    }

    public static  SingletonExample getInstance(){
        if(s==null){
            s=new SingletonExample();
        }
        return s;
    }
}



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
            SingletonExample a = SingletonExample.getInstance();
        SingletonExample b = SingletonExample.getInstance();
        SingletonExample c = SingletonExample.getInstance();

        a.str = a.str.toLowerCase();
        System.out.println("String from a  = " +a.str);
        System.out.println("String from b  = " +b.str);
        System.out.println("String from c  = " +c.str);
    }
}