public class Main {
    public static void main(String[] args) {
Employee d1=new Employee("Rakan ",123,1000);
System.out.println(d1.toString());
System.out.println("The Employee: " +d1.getSalary());
System.out.println("----------------");
Manager d2=new Manager("Masa" , 133 , 1000,"Grafic",500);
System.out.println(d2.toString());
System.out.println("The manager: " +d2.getSalary());
System.out.println("----------------");
Developer d3=new Developer("salam",244,1000,"java",10,80);
System.out.println(d3.toString());
System.out.println("the developer: " + d3.getSalary());



    }
}


