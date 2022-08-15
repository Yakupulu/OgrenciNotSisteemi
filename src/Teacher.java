public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name,String branch,String mpno ){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }

    void print(){
        System.out.println("Isim:\t"+this.name);
        System.out.println("Brans:\t"+this.branch);
        System.out.println("Tel:\t"+this.mpno);
    }
}
