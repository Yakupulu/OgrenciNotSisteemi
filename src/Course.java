public class Course {
    //Course Sınıfı Özellikleri :
    //    //
    //    //Nitelikler : name,code,prefix,note,Teacher
    //    //Metotlar : Course() , addTeacher) , printTeacher()
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote=0;

    }

    void addcourseTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("islem basarili");
        } else {
            System.out.println(t.name + "\tAkademisyen bu dersi veremez");
        }
    }

    void printTeacher() {
        if (courseTeacher != null) {
            this.courseTeacher.print();
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamistir.");
        }
        System.out.println("=====================================");
    }


}
