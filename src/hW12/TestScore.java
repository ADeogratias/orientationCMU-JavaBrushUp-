package hW12;

/**
 * This is a helper class for encapsulating a TestScore. It is not complete.
 *
 * Note: no comments on purpose! See if you can folllow the code.
 *
 *  On my honor, as a Carnegie-Mellon Africa student,
 *  I have neither given nor received unauthorized assistance on this work.
 *
 *  giving credits to
 *  @author Cathy Bishop I used her codes that were posted online.
 *   *  http://public.africa.cmu.edu/cbishop/orientation/java/
 *
 * 2nd @author Deogratias Amani
 */

/**
  *  changed point/score to double and not int to allow fractions
  *  check if score and maxscore provided is a valid value.
 *
  */


public class TestScore
{
    // changing points datatype to
    // double to allow floats
    private double points;
    private int maxPoints;

    public TestScore()
    {
        points = 0;
        maxPoints = 20;
    }

    public TestScore(int maxScore)
    {
        points = 0;
        maxPoints = maxScore;
    }

    // change score to double to allow fractions too
    public TestScore(double score, int maxScore)
    {
        points = score;
        maxPoints = maxScore;
    }

    public double getPercentage() { return((double) points/maxPoints); }

    public String getLetterGrade()
    {
        double percent = getPercentage() * 100;

        if (percent >= 90)
            return "A";
        if (percent >= 80)
            return "B";
        if (percent >= 70)
            return "C";
        if (percent >= 60)
            return "D";
        return "F";
    }

    public void setPoints(double score, int maxScore)
    {
        points = score;
        maxPoints = maxScore;
    }

    public void setPoints(double score) { points = score; }
    public void setMaxPoints(int maxScore) { maxPoints = maxScore; }
    public double getPoints() { return points; }
    public int getMaxPoints() { return maxPoints; }

    // we can validate points provided.
    // to only allow positive values.
    // public boolean isValidScore(){return points > 0;}
    // public boolean isValidMaxPoints(){return maxPoints > 0;}


    public String toString()
    {
        return("Score: " + points + " out of " + maxPoints);
    }
}