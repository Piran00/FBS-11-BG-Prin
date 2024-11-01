public class Nummernanzeige()
{
    public int value;
    public int limit;
    public Nummernanzeige(int anzeigelimit)
    {
        final int limit = anzeigelimit;
        int value;
    }

    public int give_val()
    {
     return value;
    }


    public String give_display_val()
    {
        if (value < 10)
        {
            return "0" + value;
        }
        else
        {
        return ""+ value;
        }
    }


    public void increase_val(int increased_val)
    {
        value += increased_val;
        value %= limit;
    }
    public void change_val(int new_val)
    {
        if (new_val < limit && new_val >= 0)
        {
            value = new_val;
        }
    }

}
