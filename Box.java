import java.util.ArrayList;

public abstract class Box<Type extends Comparable<Type>>
{
    private int width; // width is equal to rows
    private int height; // height is equal to columns
    private ArrayList<ArrayList<Type>> box = new ArrayList<ArrayList<Type>>();
    
    /**
     * Sets the size of the box and each index is set to null
     * @param width
     * @param height
     */
    public Box(int width, int height)
    {
        if(width <= 0 || height <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.height = height;
        this.width = width;
        for(int i=0; i<height; i++)
        {
            box.add(new ArrayList<Type>());
            for(int j=0; j<width; j++)
            {
                box.get(i).add(null);
            }
        }
    }

    public int getWidth()
    {
        return this.width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public ArrayList<ArrayList<Type>> getBox()
    {
        return box;
    }

    public void putInBox(Type value, int row, int column)
    {
        try
        {
            box.get(row).set(column, value);
        }
        catch(IndexOutOfBoundsException ex)
        {
            throw new IndexOutOfBoundsException("There is no room over there!!!");
        }
    }

    public void displayBox()
    {
        for(int i=0; i<box.size(); i++)
        {
            for(int j=0; j<box.get(i).size(); j++)
            {
                if(box.get(i).get(j) == null)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(box.get(i).get(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}