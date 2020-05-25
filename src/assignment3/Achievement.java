
package assignment3;

import java.io.Serializable;

/**
 *
 * @author Halady Raghavendra Prabhu
 * Student ID S10075084
 */
public class Achievement implements Serializable {
    String description;
    String level;
    String outOfPossible;
    private static final long serialVersionUID = 5950169519310163575L;

    public Achievement(String description, String level, String outOfPossible) {
        this.description = description;
        this.level = level;
        this.outOfPossible = outOfPossible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getOutOfPossible() {
        return outOfPossible;
    }

    public void setOutOfPossible(String outOfPossible) {
        this.outOfPossible = outOfPossible;
    }
}
