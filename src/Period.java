public class Period
{
    private String subject;
    private String location;
    private String gradeAndClass;

    public Period(String subjectName, String location, String gradeAndClass)
    {
        this.subject = subjectName;
        this.location = location;
        this.gradeAndClass = gradeAndClass;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getGradeAndClass()
    {
        return gradeAndClass;
    }

    public void setGradeAndClass(String gradeAndClass)
    {
        this.gradeAndClass = gradeAndClass;
    }

    public String toString()
    {
        return location + " - " + subject + ", " + gradeAndClass;
    }
}
