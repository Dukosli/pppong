import java.awt.Graphics;
import java.awt.Color;

public class Paddle {

    // Fields 
    int x; 
    int y; 
    int w = 10; // x 
    int h = 100; // y 

    // Constructor
    Paddle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(this.x, this.y, this.w, this.h);
    }

}
