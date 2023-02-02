
package strategypatternsample;

import strategypatternsample.behavior.BowAndArrowBehavior;
import strategypatternsample.behavior.SwordBehavior;
import strategypatternsample.behavior.WeaponBehavior;
import strategypatternsample.model.King;
import strategypatternsample.model.Character;
import strategypatternsample.model.Queen;
import strategypatternsample.model.Troll;

/**
 *
 * @author ThinhLD
 */
public class StrategyPatternSample {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("King time!");
        Character king = new King();
        WeaponBehavior SwordBehavior = new SwordBehavior();
        king.setWeaponBehavior(SwordBehavior);
        king.getWeaponBehavior().useWeapon();
        king.useWeapon();
        System.out.println("---------------------");
        
        System.out.println("Queen time!");
        Character queen = new Queen();
        WeaponBehavior BowAndArrowBehavior = new BowAndArrowBehavior();
        queen.setWeaponBehavior(BowAndArrowBehavior);
        queen.getWeaponBehavior().useWeapon();
        System.out.println("---------------------");
        
        System.out.println("Troll time!");
        Character troll = new Troll();
        troll.getWeaponBehavior().useWeapon();
        System.out.println("---------------------");
    }
    
}
