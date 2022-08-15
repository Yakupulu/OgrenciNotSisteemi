public class Student {

    //Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    //Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

    Course c1, c2, c3;
    double tarihAvarage,fizikAvarage,biyoAvarage;
    String name;
    int stuNo;
    int clases;
    double avarage;
    boolean isPass;
    Student(String name, int stuNo, int clases, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.clases = clases;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = true;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
    }


    void addVerbalNote(int verbalNote1,int verbalNote2,int verbalNote3){
        if (verbalNote1>= 0 &&verbalNote1<= 100) {
            c1.verbalNote=verbalNote1;
        }
        if (verbalNote2>= 0 &&verbalNote2<= 100) {
            c2.verbalNote =verbalNote2;
        }
        if (verbalNote3 >= 0 &&verbalNote3<= 100) {
            c3.verbalNote =verbalNote3;
        }

    }



    void calcAvarage(){
        this.tarihAvarage= ((c1.note*0.8)+(c1.verbalNote*0.2));
        System.out.println("tarih ortalama:"+tarihAvarage);
        this.fizikAvarage=+ ((c2.note*0.8)+(c2.verbalNote*0.2));
        System.out.println("Fizik ortalama:"+fizikAvarage);
        this.biyoAvarage=((c3.note*0.8)+(c3.verbalNote*0.2));
        System.out.println("biyo ortalama:"+biyoAvarage);
        this.avarage=(tarihAvarage+fizikAvarage+biyoAvarage)/3.0;
        System.out.println("genel ortalama:"+avarage);
    }


    boolean isPass() {
        if (this.avarage >= 55)
            System.out.println(this.name + "\tSinifi gectiniz");
        else {
            System.out.println(this.name + "\tSinifta kaldiniz");
        }
            return true;
    }

}



