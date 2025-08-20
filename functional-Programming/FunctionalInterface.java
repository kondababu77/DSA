// package functional-Programming;
interface A{
    int add(int a, int b);
}
class B implements A{
   public int add(int a, int b){
        return a+b; 
    }
}

 interface C {
    void show();
}
public class FunctionalInterface {
 public static void main(String[] args) {
    A obj = new B();
    System.out.println(obj.add(10, 20));

    C obj2 = () -> System.out.println("This is Functional programming");
    obj2.show();
 }
}
