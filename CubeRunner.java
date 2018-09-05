/**
 * CubeRunner tests the Geometry.cubeArea method.
 *
 * @author  Dave Avis
 * @version 7.26.2018
 */
public class CubeRunner
{
    /**
     * main method runs a list of predefined tests.
     *
     * @param   args  Not Used
     */
    public static void main( String[] args )
    {
        double[] edgeList = { 112, 4, 33, 50, 5, 19, 111 };
        double[] answerList = { 75264, 96, 6534, 15000, 150, 2166, 73926 };

        for( int i = 0; i < edgeList.length; i++ )
        {
            double edge = edgeList[i];
            double answer = answerList[i];
            double area = Geometry.cubeArea( edge );
            System.out.printf( "Cube with edge length %.1f has surface area of %.2f (should be %.2f)\n", edge, area, answer);
        }
    }
}
