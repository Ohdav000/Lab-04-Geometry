import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GeometryTest.
 *
 * @author  Dave Avis
 * @version 7.26.2018
 */
public class GeometryTest
{
    /**
     * Default constructor for test class GeometryTest.
     */
    public GeometryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Tests Geometry.circleArea.  Runs 7 tests.
     */
    @Test
    public void circleAreaTest()
    {
        double[] radiusList = { 7.5, 10, 72.534, 55, 101, 99.952, 100 };
        double[] answerList = { 176.71, 314.16, 16528.49, 9503.32, 32047.39, 31385.77, 31415.93 };

        for( int i = 0; i < radiusList.length; i++ )
        {
            double radius = radiusList[i];
            double answer = answerList[i];
            double area = Geometry.circleArea( radius );
            assertEquals( "Testing circleArea(" + radius + "), ", answer, area, 0.1 );
        }
    }

    /**
     * Tests Geometry.coneVolume.  Runs 8 tests.
     */
    @Test
    public void coneVolumeTest()
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
            assertEquals( "Testing coneVolume(" + radius + ", " + height + "), ", answer, volume, 0.1 );
        }
    }

    /**
     * Tests Geometry.cubeArea.  Runs 8 tests.
     */
    @Test
    public void cubeAreaTest()
    {
        double[] edgeList = { 112, 4, 33, 50, 5, 19, 111, 14.5 };
        double[] answerList = { 75264, 96, 6534, 15000, 150, 2166, 73926, 1261.5 };

        for( int i = 0; i < edgeList.length; i++ )
        {
            double edge = edgeList[i];
            double answer = answerList[i];
            double area = Geometry.cubeArea( edge );
            assertEquals( "Testing cubeArea(" + edge + "), ", answer, area, 0.1 );
        }
    }

    /**
     * Tests Geometry.rectPerimeter.  Runs 8 tests.
     */
    @Test
    public void rectAreaTest()
    {
        double[] lengthList = { 12, 131, 20, 9, 36, 8, 18, 2.5 };
        double[] widthList =  { 5, 75, 25, 256, 72, 6, 16, 14.2 };
        double[] answerList = { 34, 412, 90, 530, 216, 28, 68, 33.4 };

        for( int i = 0; i < lengthList.length; i++ )
        {
            double l = lengthList[i];
            double w = widthList[i];
            double answer = answerList[i];
            double perim = Geometry.rectPerimeter( l, w );
            assertEquals( "Testing rectPerimeter(" + l + ", " + w + "), ", answer, perim, 0.1 );
        }
    }

    /**
     * Tests Geometry.trapArea.  Runs 7 tests.
     */
    @Test
    public void trapAreaTest()
    {
        double[] b1List = { 3, 5, 7, 13, 6, 11, 2.4 };
        double[] b2List =  { 3, 6, 10, 9, 11, 8, 6.1 };
        double[] heightList = { 3, 7, 6, 3, 4, 5, 5.5 };
        double[] answerList = { 9, 38.5, 51, 33, 34, 47.5, 23.375 };

        for( int i = 0; i < b1List.length; i++ )
        {
            double b1 = b1List[i];
            double b2 = b2List[i];
            double h = heightList[i];
            double answer = answerList[i];
            double area = Geometry.trapArea( b1, b2, h );
            assertEquals( "Testing trapArea(" + b1 + ", " + b2 + ", " + h + "), ", answer, area, 0.1 );
        }
    }

    /**
     * Tests Geometry.lineSlope.  Runs 7 tests.
     */
    @Test
    public void lineSlopeTest()
    {
        double[] x1List = { 1, 1, 6, 4, 1, 1, 4.2 };
        double[] y1List =  { 9, 7, 4, 4, 1, 7, 21.5 };
        double[] x2List = { 14, 18, 2, 5, 2, 2, 2.1 };
        double[] y2List = { 2, 3, 2, 3, 9, 9, 14.8 };
        double[] answerList = { -0.54, -0.24, 0.5, -1, 8, 2, 3.19 };

        for( int i = 0; i < x1List.length; i++ )
        {
            double x1 = x1List[i];
            double y1 = y1List[i];
            double x2 = x2List[i];
            double y2 = y2List[i];
            double answer = answerList[i];
            double slope = Geometry.lineSlope( x1, y1, x2, y2 );
            assertEquals( "Testing lineSlope(" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + "), ", answer, slope, 0.1 );
        }
    }
}
