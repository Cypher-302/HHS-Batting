import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Teacher> presentTeachers = new ArrayList<>();
        presentTeachers.add(new Teacher("First1","Sur1", new Period[][]
                {
                    {new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), null, null, null},
                    {null, new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), null, new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B")},
                    {null, new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B")},
                    {new Period("TempName","A1", "10B"), null, new Period("TempName","A1", "10B"), null, new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B")},
                    {new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), new Period("TempName","A1", "10B"), null, null},
                }));
        presentTeachers.add(new Teacher("First2","Sur2", new Period[][]
                {
                        {new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A")},
                        {new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), null, new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), null},
                        {new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), null, new Period("TempName","B2", "9A")},
                        {null, new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A"), new Period("TempName","B2", "9A")},
                        {null, new Period("TempName","B2", "9A"), null, new Period("TempName","B2", "9A"), null, null},
                }));
        presentTeachers.add(new Teacher("First3","Sur3", new Period[][]
                {
                        {new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C")},
                        {new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null, null},
                        {new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null, null, new Period("TempName","C3", "8C")},
                        {new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null, new Period("TempName","C3", "8C")},
                        {null, new Period("TempName","C3", "8C"), null, new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null},
                }));
        presentTeachers.add(new Teacher("First4","Sur4", new Period[][]
                {
                        {null, null, null, new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C")},
                        {new Period("TempName","C3", "8C"), null, new Period("TempName","C3", "8C"), null, new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C")},
                        {null, null, null, new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C")},
                        {new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null, new Period("TempName","C3", "8C"), null},
                        {new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null, new Period("TempName","C3", "8C"), null},
                }));
        presentTeachers.add(new Teacher("First5","Sur5", new Period[][]
                {
                        {null, null, new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null},
                        {null, null, null, new Period("TempName","C3", "8C"), null, null},
                        {new Period("TempName","C3", "8C"), null, null, new Period("TempName","C3", "8C"), null, new Period("TempName","C3", "8C")},
                        {null, new Period("TempName","C3", "8C"), new Period("TempName","C3", "8C"), null, null, null},
                        {null, null, new Period("TempName","C3", "8C"), null, null, null},
                }));


        ArrayList<Teacher> absentTeachers = new ArrayList<>();
        absentTeachers.add(new Teacher("First0","Sur0", new Period[][]
                {
                    {null, null, new Period("LFSC","C17", "10 6"), null, null, new Period("LFSC","C17", "11")},
                    {null, new Period("LFSC","C17", "11"), null, new Period("LFSC","C17", "10 6"), null, new Period("Tech","C9", "9G")},
                    {new Period("Tech","C9", "9B"), new Period("Tech","C9", "8J"), new Period("LFSC","C17", "11"), new Period("LFSC","C17", "10 6"), new Period("LFSC","C17", "10 6"), new Period("LFSC","C17", "10 6")},
                    {null, null, new Period("LFSC","C17", "10 6"), new Period("LFSC","C17", "10 6"), null, new Period("LFSC","C17", "10 6")},
                    {null, null, null, null, null, null},
                }));

        System.out.println("\nPresent Teachers: ");
        for(Teacher t:presentTeachers)
        {
            System.out.println("\t" + t.getFullName());
        }

        //System.out.println("What day is it? ");
        int day = 2;

        System.out.println("\nAbsent Teachers: ");
        for(Teacher a:absentTeachers)
        {
            System.out.println(a.getFullName() + "\n" + a.outputDay(day));
        }

        System.out.println(Arrays.deepToString(generateBattingList(absentTeachers, presentTeachers, day)));

    }

    public static String[][] generateBattingList(ArrayList<Teacher> absentTeachers, ArrayList<Teacher> presentTeachers, int day)
    {
        String[][] battingList = new String[absentTeachers.size()][6];
        for (int i = 0; i < absentTeachers.size(); i++)
        {
            Period[] toFill = absentTeachers.get(i).getDay(day);
            for (int j = 0; j < toFill.length; j++)
            {
                if (toFill[j] == null)
                    continue;

                for (int k = 0; k < presentTeachers.size(); k++)
                {
                    Teacher currentTeacher = presentTeachers.get(k);
                    System.out.println(j + " " + currentTeacher.getDay(day)[j]);
                    if (currentTeacher.getDay(day)[j] == null)
                    {
                        battingList[i][j] = "{" + currentTeacher.getFullName() + " === " + absentTeachers.get(i).getDay(day)[j] + "}";
                        System.out.println("removing " + currentTeacher.getFullName());
                        presentTeachers.remove(k);
                        break;
                    }
                }
            }
        }

        return battingList;
    }
}