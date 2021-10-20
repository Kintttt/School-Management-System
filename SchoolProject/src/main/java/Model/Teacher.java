package Model;

import enums.Level;
import enums.Role;
import java.util.Set;

public class Teacher extends Staff{




    private Set<Student> listOfStudents;
    private Level classBeingTaught;



   public Teacher(String name, int age, double salary, Role role, Set<Student> listOfStudents,Level classBeingTaught){
       super(name,age,salary,role);
       this.listOfStudents = listOfStudents;
       this.classBeingTaught = classBeingTaught;
   }

    public Set<Student> getListOfStudents() {
        return listOfStudents;
    }


    public void setListOfStudents(Set<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public Level getClassBeingTaught() {
        return classBeingTaught;
    }

    public void setClassBeingTaught(Level classBeingTaught) {
        this.classBeingTaught = classBeingTaught;
    }

}
