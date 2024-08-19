public class ConstructorExample {
    
    ConstructorExample() {
        System.out.println("Constructor");
    }

    
    ConstructorExample(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        
        ConstructorExample obj = new ConstructorExample();
        ConstructorExample obj1 = new ConstructorExample(10);
    }
}
