/**
 * LineRunner tests the Geometry.lineSlope method.
 *
 * @author  Dave Avis
 * @version 7.26.2018
 */
public class LineRunner
{
    /**
     * main method runs a list of predefined tests.
     *
     * @param   args  Not Used
     */
    public static void main( String[] args )
    {
        double[] x1List = { 1,1,6,4,1,1 };
        double[] y1List =  { 9,7,4,4,1,7 };
        double[] x2List = { 14,18,2,5,2,2 };
        double[] y2List = { 2,3,2,3,9,9 };
        double[] answerList = { -0.54, -0.24, 0.5, -1, 8, 2 };

        for( int i = 0; i < x1List.length; i++ )
        {
            double x1 = x1List[i];
            double y1 = y1List[i];
            double x2 = x2List[i];
            double y2 = y2List[i];
            double answer = answerList[i];
            double slope = Geometry.lineSlope( x1, y1, x2, y2 );
            System.out.printf( "Line connecting (%.1f, %.1f) and (%.1f, %.1f) has a slope of %.2f (should be %.2f)\n", x1, y1, x2, y2, slope, answer);
        }
    }
}
