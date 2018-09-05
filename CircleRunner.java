/**
 * CircleRunner tests the Geometry.circleArea method.
 *
 * @author  Dave Avis
 * @version 7.26.2018
 */
public class CircleRunner
{
    /**
     * main method runs a list of predefined tests.
     *
     * @param   args  Not Used
     */
    public static void main( String[] args )
    {
        double[] radiusList = { 7.5, 10, 72.534, 55, 101, 99.952, 100 };
        double[] answerList = { 176.71, 314.16, 16528.49, 9503.32, 32047.39, 31385.77, 31415.93 };

        for( int i = 0; i < radiusList.length; i++ )
        {
            double radius = radiusList[i];
            double answer = answerList[i];
            double area = Geometry.circleArea( radius );
            System.out.printf( "Circle of radius %f has an area of %.2f (should be %.2f)\n", radius, area, answer);
        }
    }
}
