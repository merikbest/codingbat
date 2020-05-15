package String1;

/*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

        helloName("Bob") → "Hello Bob!"
        helloName("Alice") → "Hello Alice!"
        helloName("X") → "Hello X!"*/

class HelloName {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}

public class S1_helloName {
    public static void main(String[] args) {
        HelloName helloName = new HelloName();
        System.out.println(helloName.helloName("asd"));
    }
}
