import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;

//    creating arrays
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int [GAME_UNITS];

//    We will begin with 6 body parts
    int bodyParts = 6;

    int applesEaten;
    int appleX;
    int appleY;

//    Snake will begin by going right
    char direction = 'R';
    boolean running = false;

    Timer timer;
    Random random;


//Methods
    public void startGame(){
//        We are starting with 1 apple for the sanke
        newApple();
//        We are setting the boolean to true so it starts its default to false
        running = true;
//        We are using the delay instance
        timer = new Timer(DELAY,this);
        timer.start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g){

    }

    public void newApple(){}

    public void move() {

    }

    public void checkApple(){

    }

    public void checkCollisions(){

    }

    public void gameOver(Graphics g){

    }

    //    Constructor
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


//    inner class
    public class MyKeyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e){

        }
}


} // End of GamePanel
