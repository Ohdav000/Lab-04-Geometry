/**
 * TrapRunner tests the Geometry.trapArea method.
 *
 * @author  Dave Avis
 * @version 7.26.2018
 */
public class TrapRunner
{
    /**
     * main method runs a list of predefined tests.
     *
     * @param args  Not Used
     */
    public static void main( String[] args )
    {
        double[] b1List = { 3, 5, 7, 13, 6, 11 };
        double[] b2List =  { 3, 6, 10, 9, 11, 8 };
        double[] heightList = { 3, 7, 6, 3, 4, 5 };
        double[] answerList = { 9, 38.5, 51, 33, 34, 47.5 };

        for( int i = 0; i < b1List.length; i++ )
        {
            double b1 = b1List[i];
            double b2 = b2List[i];
            double h = heightList[i];
            double answer = answerList[i];
            double area = Geometry.trapArea( b1, b2, h );
            System.out.printf( "Trapezoid with base1 %.1f, base2 %.1f, height %.1f has area of %.2f (should be %.2f)\n", b1, b2, h, area, answer);
        }
    }
}
