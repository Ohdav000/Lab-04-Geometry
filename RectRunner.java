/**
 * RectRunner tests the Geometry.rectArea method.
 *
 * @author  Dave Avis
 * @version 7.26.2018
 */
public class RectRunner
{
    /**
     * main method runs a list of predefined tests.
     *
     * @param   args  Not Used
     */
    public static void main( String[] args )
    {
        double[] lengthList = { 12, 131, 20, 9, 36, 8, 18 };
        double[] widthList =  { 5, 75, 25, 256, 72, 6, 16 };
        double[] answerList = { 34, 412, 90, 530, 216, 28, 68 };

        for( int i = 0; i < lengthList.length; i++ )
        {
            double l = lengthList[i];
            double w = widthList[i];
            double answer = answerList[i];
            double perim = Geometry.rectPerimeter( l, w );
            System.out.printf( "Rectangle with length %.1f and width %.1f has a perimiter of %.2f (should be %.2f)\n", l, w, perim, answer);
        }
    }
}
