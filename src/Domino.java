public class Domino
{
    private int top;
    private int bottom;
    public Domino ()
    {
        top = 0;
        bottom = 0;
    }
    public Domino (int t , int b)
    {
        top = t;
        bottom = b;
    }
    public int getTop()
    {
        return top;
    }
    public int getBottom()
    {
        return bottom;
    }

    public void setTop(int t)
    {
        top = t;
    }

    public void setBottom(int b)
    {
        bottom = b;
    }

    public String toString()
    {
        return ""+top+"/"+bottom;
    }

    public void flip ()
    {
        int t = top;
        top = bottom;
        bottom = t;

    }
    public void settle ()
    {
        if (top > bottom)
            flip();
    }
    public int compareTo (Domino other) {
        //method doesn't say if we can flip the top & bottom properties so I don't use settle
        int th;
        int oth;
        if (top > bottom) {
            th = top;
        }
        else {
            th = bottom;
        }
        if (other.top > other.bottom) {
            oth = other.top;
        }
        else {
            oth = other.bottom;
        }
        while(true) {
            if(th<oth) {
                return -1;
            }
            else if (th>oth) {
                return 1;
            }
            if (th == top) {
                th = bottom;
            }
            else {
                th = top;
            }
            if (oth == other.top) {
                oth = other.bottom;
            }
            else {
                oth = other.top;
            }
        }
    }

    public int compareToWeight(Domino other)
    {
        int sum = bottom+top;
        int othSum = other.bottom+other.top;
        if(sum<othSum)
        {
            return -1;
        }
        if (sum>othSum)
        {
            return 1;
        }
        return 0;
    }

    public boolean canConnect(Domino other)
    {
        if(this.top == other.top||this.top == other.bottom||this.bottom == other.top||this.bottom == other.bottom)
            return true;
        return false;
    }

}
