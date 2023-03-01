import java.util.Random;
public class Snake extends Obstacle {
    public Snake() {
        super("Snake", 4, 0, 12, 0, 12);
        Random rnd=new Random();
        this.setDamage(rnd.nextInt(3)+3);
    }
}
