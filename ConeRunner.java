/**
 * ConeRunner tests the Geometry.coneVolume method.
 *
 * @author  Dave Avis
 * @version 7.26.2018
 */
public class ConeRunner
{
    /**
     * main method runs a list of predefined tests.
     *
     * @param   args  Not Used
     */
    public static void main( String[] args )
    {
        double[] radiusList = { 4, 4, 9, 1, 1, 7, 1.5, 1.5 };
        double[] heightList = { 4, 3, 3, 3, 5, 7, 3, 5 };
        double[] answerList = { 67.02, 50.27, 254.47, 3.14, 5.24, 359.19, 7.07, 11.78 };

        for( int i = 0; i < radiusList.length; i++ )
        {
            double radius = radiusList[i];
            double height = heightList[i];
            double answer = answerList[i];
            double volume = Geometry.coneVolume( radius, height );
            System.out.printf( "Cone of radius %.1f and height %.1f has a volume of %.2f (should be %.2f)\n", radius, height, volume, answer);
        }
    }
}
