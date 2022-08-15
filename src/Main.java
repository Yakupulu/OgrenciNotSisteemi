public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "111");
        Teacher t2 = new Teacher("Kulyutmaz", "FZK", "222");
        Teacher t3 = new Teacher("Ahmet Hoca", "BIO", "333");

        Course tarih = new Course("Tarih", "1", "TRH");
        Course fizik = new Course("Fizik", "2", "FZK");
        Course biyo = new Course("Biyo", "3", "BIO");

        tarih.addcourseTeacher(t1);
        tarih.printTeacher();
        fizik.addcourseTeacher(t2);
        fizik.printTeacher();
        biyo.addcourseTeacher(t3);
        biyo.printTeacher();

        Student s1 = new Student("ahmet", 1, 4, tarih, fizik, biyo);
        Student s2 = new Student("mehmet", 2, 4, tarih, fizik, biyo);
        Student s3 = new Student("veli", 3, 4, tarih, fizik, biyo);

        s1.addBulkExamNote(50, 40, 40);
        s1.addVerbalNote(80, 80, 90);
        s1.calcAvarage();
        s1.isPass();
        System.out.println("==========================");

        s2.addBulkExamNote(50, 70, 60);
        s2.addVerbalNote(40, 50, 60);
        s2.calcAvarage();
        s2.isPass();
        System.out.println("==========================");

        s3.addBulkExamNote(100, 100, 100);
        s3.addVerbalNote(100, 100, 100);
        s3.calcAvarage();
        s3.isPass();
        System.out.println("==========================");
    }
}
