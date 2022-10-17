public class Employee {

    String name;
    int hireYear;
    int workHours;
    double salary;
    double taxAmount;
    int premium;
    double zam;




    public Employee(String name,int hireYear, int workHours,double salary){

        this.name = name;
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
    }

    public double taxCalculate(){
        if(salary < 1000 ){

            return  salary;
        }else {
            this.taxAmount = this.salary * 0.03;
            return taxAmount;
        }

    }

    public double bonus(){
        if(workHours > 40){
            premium = this.workHours - 40;
            premium *= 30;
            return premium;
        }
        return 0;
    }

    public double raiseSalary(){
        if(hireYear <= 0 || hireYear > 2021){
            System.out.println("Çalışma yılınızı yanlış girdiniz. Lütfen kontrol ediniz.");
        }else{
            int fark = 2021 - hireYear;

            
            if(fark > 0 && fark < 10){
                zam = this.salary * 0.05;
                return zam;
            } else if (fark > 9  && fark < 20) {
                zam = this.salary * 0.1;
                return zam;
            } else if (fark > 19) {
                zam = this.salary * 0.15;
                return zam;
            }else if(fark == 0){
                System.out.println("İşe başlangıç tarihiniz henüz 1 senelik değil.");
            }
        }
            return 0;
    }

    public void print(){

        double realSalary = this.salary - taxCalculate() + bonus() + raiseSalary();
        double total = this.salary +bonus() + taxCalculate() + raiseSalary();

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Vergi : " + taxCalculate());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + realSalary );
        System.out.println("Toplam Maaş : " + total );


    }











}
