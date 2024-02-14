public class Basement {
    
    public static void main(String[] args)
    {
        CircularBox<Integer> myCircularBox = new CircularBox<Integer>(5, 5);
        myCircularBox.putInBox(4, 1, 4);
        myCircularBox.displayBox();

        System.out.println();

        RectangularBox<String> myRectangularBox = new RectangularBox<String>(2, 3);
        myRectangularBox.putInBox("Cookie", 0, 0);
        myRectangularBox.displayBox();

    }
}
