package code;
import gui.MainController;
import gui.Helicopter;
import gui.Submarine;
import gui.Tank;
/**
 *
 * @author TWINTECH
 */
public class Defence_system {

    public static void main(String[] args) {
        
       MainController main=new MainController();
       main.addDefence(new Helicopter(main));
       main.addDefence(new Submarine(main));
       main.addDefence(new Tank(main) );
    }
}
