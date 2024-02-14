
public class CircularBox<Type extends Comparable<Type>> extends Box<Type>
{
    public CircularBox(int width, int height)
    {
        super(width, height);
    }

    @Override
    public void putInBox(Type value, int row, int column)
    {
        if(row == 0 && column == 0 || row == 0 && getBox().get(0).size() - 1 == column || row == getBox().size() - 1 && column == 0 || row == getBox().size() - 1 && column == getBox().get(0).size() - 1)
        {
            System.out.println("This is a circular box it doesn't have corners!");
        }
        else
        {
            super.putInBox(value, row, column);
        }
    }

    @Override 
    public void displayBox()
    {
        for(int i=0; i<getBox().size(); i++)
        {
            for(int j=0; j<getBox().get(i).size(); j++)
            {
                if(i==0&&j==0 || i==getBox().size()-1&&j==0 || i==0&&j==getBox().get(j).size()-1 || i==getBox().size()-1&&j==getBox().get(i).size()-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(getBox().get(i).get(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}