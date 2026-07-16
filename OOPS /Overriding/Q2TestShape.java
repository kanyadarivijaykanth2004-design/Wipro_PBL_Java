package OOPS.Overriding;

public abstract class Q2TestShape {

    public static void main(String[] args) {

        Q2Circle c = new Q2Circle();
        Q2Triangle t = new Q2Triangle();
        Q2Square s = new Q2Square();

        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();
    }

    public abstract void draw();
}