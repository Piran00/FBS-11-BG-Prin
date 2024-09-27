public class Fernseher { //Datenfeld
    boolean aus;
    boolean mute;
    int volume;
    int channel;

    public Fernseher() { //Konstruktor
        aus = true;
        mute = false;
        volume = 5;
        channel = 1;

    }

    public void An_schalten() {
        aus = !aus; // Mit ! koennen wir den wert eines Boolean umkehren
    }

    public void Mute() {
        mute = !mute; // Hier kehren wir wieder den wert von mute um jedes mal wenn wir diese methode benutzen

    }

    public void increase_volume()
    {
        if (mute) // Da mute ein Boolean ist koennen wir hier das if abkuerzen indem wir abfragen ob mute true ist
        {
            mute = !mute; // Wie vorher kehren wir mute einfach um
        }
        if (volume + 1 <= 10)
        {
            volume++; // Mit ++ koennen wir den wert von volumen um 1 erhoehen
        }
    }

    public void decrease_volume()
    {
        if (!mute)
        {
            mute = !mute;
        }
        if (volume - 1 >= 0)
        {
            volume --;
        }


    }

    public void select_channel(int usr_selection)
    {
        if (usr_selection <= 30)
        {
            channel = usr_selection;
        }
    }

    public void return_state()
    {
        if (aus) // Wenn aus true ist also der Fernseher aus ist
        {
            System.out.println("Der Fernseher ist aus");

        }
        else
        {
            System.out.println("Der Fernseher ist an");
            System.out.println("Der Fernseher ist Gemuted" + mute);
            System.out.println("Lautstaerke" + volume);
            System.out.println("Sender" + channel);
        }
    }































}
