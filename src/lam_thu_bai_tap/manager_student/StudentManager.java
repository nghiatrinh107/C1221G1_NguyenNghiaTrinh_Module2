package lam_thu_bai_tap.manager_student;

public class StudentManager {
    private static Student[] students = new Student[100];
    static {
        students[0]= new Student(1,"Trinh","10-7","C1221","NT");
        students[1]= new Student(2,"Hoa","10-7","C1221","BK");
        students[2]= new Student(3,"Hung","10-7","C1221","NN");
        students[3]= new Student(4,"Tho","10-7","C1221","SP");
    }
    // hien thi
    public void showisStudent(){
        for (Student s:students){
            if (s!=null){
                System.out.println(s);
            }else {
                break;
            }
        }
    }
    // them moi
    public void add(){

    }
    public void edit(){

    }
    public void delete(){

    }
}
