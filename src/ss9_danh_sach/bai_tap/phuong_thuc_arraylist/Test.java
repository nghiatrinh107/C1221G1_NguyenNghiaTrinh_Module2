package ss9_danh_sach.bai_tap.phuong_thuc_arraylist;

public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "trinh");
        Student b = new Student(1, "trinh");
        Student c = new Student(1, "trinh");
        Student d = new Student(1, "trinh");
        Student e = new Student(1, "trinh");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        System.out.println(studentMyList.get(2).getName());
        System.out.println(studentMyList.contains(e));

        newMyList = studentMyList.clone();
        Student student = newMyList.remove(0);
        System.out.println(student.getName());
        System.out.println(newMyList.indexOf(c));

    }

}
