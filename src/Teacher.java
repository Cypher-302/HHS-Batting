public class Teacher
{
    private String name;
    private String surname;
    //private String title;
    private Period[][] schedule;

    public Teacher(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        this.schedule = new Period[5][6];
    }

    public Teacher(String name, String surname, Period[][] schedule)
    {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public Period[][] getSchedule()
    {
        return schedule;
    }

    public Period[] getDay(int day)
    {
        return schedule[day-1];
    }

    /**
     * Returns in a format of: Surname, Name
     */
    public String getFullName()
    {
        return surname + ", " + name;
    }

    public String outputSchedule()
    {
        String output = "";

        for (int i = 0; i < schedule.length; i++)
        {
            output += "Day " + (i+1) + ": ";
            for (int j = 0; j < schedule[i].length; j++)
            {
                output += ( schedule[i][j] == null ? "Free" : ("[" + schedule[i][j].toString() + "]" ) ) + ", ";
            }
            output += "\n";
        }

        return output;
    }

    public String outputDay(int day)
    {
        String output = "";
        day--;

        output += "Day " + (day+1) + ": ";
        for (int j = 0; j < schedule[day].length; j++)
        {
            output += ( schedule[day][j] == null ? "Free" : ("[" + schedule[day][j].toString() + "]" ) ) + ", ";
        }

        return output;
    }

    public String toString()
    {
        return getFullName() + "\n" + outputSchedule();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * Format:
     * { day 1: { period1, period2, period3, period4, period5, period6 },
     *   day 2: { ... },
     *   ...etc }
     */
    public void setSchedule(Period[][] schedule)
    {
        if (schedule.length == 5 && schedule[0].length == 6)
            this.schedule = schedule;
        else
            System.out.println("Invalid Schedule! Ensure you enter the correct number of days (5) and periods (6)!");
    }
}
