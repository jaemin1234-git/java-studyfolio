package greet;
/*
MyGreet 클래스는
인삿말을 콘솔창으로 출력하는 기능을 갖고 있는 클래쓰
 */
public class MyGreet {

//    public String message = "Hello"; // Field : 선언 + 할당
    public String message = "Hi"; // 유지보수성이 높음

    public void greet(String name) { //Method : 선언부, 구현부}
        System.out.println(message + ", " + name);
    }

}