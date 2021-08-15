package F2fExercicise13;
/**
 *
 * @author Cathy Bishop, Deogratias Amani
 * On my honor, as a Carnegie-Mellon Africa student,
 * I have neither given nor received unauthorized assistance on this work.
 *
 */

public class Breakout
{
    String exercise;
    int value;

    public Breakout() {}

    public Breakout(int value, String exercise)
    {
        this.exercise = exercise;
        this.value = value;
    }

    private void setExercise(String s) {}
    private void setValue(int i) {}

    public String getExercise() { return this.exercise; }

    private static void displayExercise(String exercise) {}

    private void changeExercise(String s){}

    public static void main(String[] args)
    {
        Breakout breakout = new Breakout();
        breakout.setExercise("Exercise 1");
        breakout.setValue(13);
        breakout.changeExercise(" Second Exercise");
        Breakout breakout2 = new Breakout(10, "Another Exercise");
        Breakout.displayExercise(breakout.getExercise());
    }

}
