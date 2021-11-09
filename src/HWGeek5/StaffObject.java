package HWGeek5;

class Person {

    private String name;
    private String position;
    private String mail;
    private String phone;
    private int cash;
    private int year;


       public Person(String name, String position, String mail, String phone, int cash, int year) {
           this.name = name;
           this.position = position;
           this.mail = mail;
           this.phone = phone;
           this.cash = cash;
           this.year = year;
       }
           public void ConsoleOut() {
               System.out.printf("Person: %s, pos: %s, mail: %s, phone: %s, cash: %d, year: %d\n", this.name, this.position, this.phone, this.mail, this.cash, this.year);
       }

       public int getYear() {
           return year;
       }

       public String toString() {
           return name + position + phone + mail + cash + year;
       }
   }
