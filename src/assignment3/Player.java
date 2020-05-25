
package assignment3;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Halady Raghavendra Prabhu
 * Student ID S10075084
 */

public class Player implements Serializable {
    String userName;
    String tagName;
    public ArrayList <Achievement> arr;
    private static final long serialVersionUID = 5950169519310163575L;

    public Player(String userName, String tagName) {
        this.userName = userName;
        this.tagName = tagName;
        this.arr = new ArrayList<Achievement>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "Achievements of " + this.getTagName() + " at ";
    }    
    
    public void addAchievment(String des, String level, String max) {
        this.arr.add(new Achievement(des,level,max));
    }
}
