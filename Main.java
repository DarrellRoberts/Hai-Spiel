// compile all Java files: javac -cp ./*.class *.java
// remove all .class files (with confirmation): find . -name "*.class" -type f -ok rm {} \;

public class Main {
    public static void main (String[] args) {
        new Gui();
        new Var();
        new KeyHandler();
        new Label();
        new Background();
        new PlayerMovement();
        new FlammeAnimation();
        new GegnerBewegung();
    }
}