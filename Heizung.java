public class Heizung
{
    double temperature; // Datenfelder
    double min;
    double max;
    double schrittweite;
    public Heizung(double usr_min ,double usr_max )
    {
        min = usr_min; // Konstruktor
        max = usr_max;
        temperature = 15;
        schrittweite = 5.0;
    }

    public void set_schrittweite(double usr_in)
    {
        if (usr_in > 0) // CHecken ob schrittweite goesser also 0 ist
        {
            schrittweite = usr_in;
        }

    }

    public void waermer()
    {
        if (temperature + schrittweite > max) // Ueberpruefen ob die neue Temperatur goesser als das maximum waere
        {
            temperature = max;
        }
        else
        {
        temperature += schrittweite; //mit += kuerzen wir temperature = temperature + schrittweite ab;
        }
    }


    public void kaelter()
    {
        if (temperature - schrittweite <min)
        {
            temperature = min;
        }
        else
        {
            temperature -= schrittweite; //mit -= kuerzen wir temperature = temperature - schrittweite ab
        }
    }


    public double return_temp()
    {
        return temperature;
    }

}
