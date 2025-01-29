/*
 * Purpose: The purpose of this program is to create and understand various methods in our program to work and alter
 * images provided to us.
 *
 * < Trisha Ganesh >
 * < 7/1/2021 >
 */

/**
 * This class contains class (static) methods
 * that will help us test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }

  //Method to negate a picture
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  //Method to grayscale a picture
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  //Method to test mirrorVerticalRightToLeft
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  //Method to test mirrorHorizontal
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  //Method to test mirrorHorizontalBotToTop
  public static void testMirrorHorizontalBotToTop()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.mirrorHorizontalBotToTop();
    swan.explore();
  }

  //Method to test mirrorTemple
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  //Method to test mirrorArms
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  //Method to test mirrorArms
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /** Main method for testing.  Every class can have a main
   * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and
    // comment out the ones we don't want to run

    //testZeroBlue();
    //testKeepOnlyRed();
    //testNegate();
    //testGrayscale();

    //testFixUnderwater();

    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();

    //testMirrorDiagonal();

    //testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();

    //testCollage();
    //testCopy();
    //testMyCollage();

    //testEdgeDetection();
    //testEdgeDetection2();

    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}