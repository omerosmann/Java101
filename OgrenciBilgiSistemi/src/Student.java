public class Student {

    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student(String name,String stuNo,String classes,Course mat,Course fizik,Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0.0;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int note1,int note2,int note3){
        if(note1 >= 0 && note1 <= 100){
            this.mat.note = note1;
        }

        if(note2 >= 0 && note2 <= 100){
            this.fizik.note = note2;
        }

        if(note3 >= 0 && note3 <= 100){
            this.kimya.note = note3;
        }

    }

    public void addProjectNote(int project1,int project2,int project3){
        if(project1 >= 0 && project1 <= 100){
            this.mat.projectNote = project1;
        }

        if(project2 >= 0 && project2 <= 100){
            this.fizik.projectNote = project2;
        }

        if(project3 >= 0 && project3 <= 100){
            this.kimya.projectNote = project3;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.projectNote == 0 || this.fizik.projectNote == 0 || this.kimya.projectNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.mat.note * 0.80) + (this.mat.projectNote * 0.20)) + ((this.fizik.note * 0.80) + (this.fizik.projectNote * 0.20)) + ((this.kimya.note * 0.80) + (this.kimya.projectNote * 0.20))) / 3;
    }


    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }


    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü/Proje Notu : " + this.mat.projectNote);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü/Proje Notu : " + this.fizik.projectNote);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü/Proje Notu : " + this.kimya.projectNote);
    }



}
