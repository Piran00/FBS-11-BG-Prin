public class US_Clock
{
    private Nummernanzeige minuten;
    private Nummernanzeige stunden;
    private String zeitanzeige;
    private int US_stunde;

public US_Clock()
{
    minuten = new Nummernanzeige(60);
    stunden = new Nummernanzeige(24);
}

public US_Clock(int stunde,int minute)
{
    minuten = new Nummernanzeige(60);
    stunden = new Nummernanzeige(24);
    set_Time(stunde,minute);
}
public void tic()
{
    minuten.increase_val(1);
    if (minuten.give_val() == 0)
    {
    stunden.increase_val(1);
    }
    refresh_time();
}
public void set_Time(int st,int min)
{
    minuten.change_val(min);
    stunden.change_val(st);
    refresh_time();

}
private void refresh_time()
{
    System.out.println(stunden.give_display_val() + ":" + minuten.give_display_val());

}
private void US_time()
{
    if (stunden.give_val() > 12)
    {
        US_stunde = stunden.give_val()-12;
        System.out.println( US_stunde + ":" + minuten + "PM");
    }
    else
    {
        refresh_time();
        System.out.println("AM");
    }
}
}
