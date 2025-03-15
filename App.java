import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int width=360;
        int height=640;
        JFrame frame=new JFrame("Flappy bird");
        //frame.setVisible(true);
        frame.setSize(width,height);
        frame.setLocationRelativeTo(null); //centers window
        frame.setResizable(false); //prevent from being resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits
        bird Bird=new bird(); //bird class object
        frame.add(Bird); //adding bird to window
        frame.pack();//ajusting it's resizing
        Bird.requestFocus();//ensure it gets keyinputs
        frame.setVisible(true);//display window
    }
}
