public class Student {
    public int id;
    public String Name;
    public String Surname;
    public Student (int id,String Name,String Surname){
        this.id = id;
        this.Name = Name;
        this.Surname = Surname;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String lastName) {
        this.Surname = lastName;
    }
}

