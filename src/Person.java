import java.util.Calendar;

public class Person {

    String FirstName;
    String LastName;
    String ID;
    String Title;
    int YOB;

    //Contrustors///


    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        FirstName = firstName;
        LastName = lastName;
        this.ID = ID;
        Title = title;
        this.YOB = YOB;
    }


    //Getter And Setters//

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    //To String///


    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID='" + ID + '\'' +
                ", Title='" + Title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    //Additional Methods//
      //FullName//
    public String FullName()
    {
        return FirstName + "" + LastName;
    }

      //Formal Name//
    public String FormalName()
    {
        return Title + "" + FirstName + "" + LastName;
    }

    ///Age///
    public int getAge()
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return (year - YOB);
    }

    public int getAge(int year)
    {
        return (year - YOB);
    }

    //CVS//
    public String toCSVDataRecord()
    {
        return ID + "," + FirstName + "," + LastName + "," + Title + "," + YOB;
    }
}


