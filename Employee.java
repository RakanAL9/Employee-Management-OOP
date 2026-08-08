public class Employee {
 protected String name;
 protected  int number;
 protected  int salary;

 public Employee(String name , int number , int salary){
     this.name=name;
     this.number=number;
     this.salary=salary;
 }
 public void setName(String name){
     this.name=name;
 }
 public String getName(){
     return name;
 }
 public void setNumber(int number){
     this.number=number;
 }
 public int getNumber(){
     return number;
 }
 public void setSalary(int salary){
     this.salary=salary;
 }
 public int getSalary(){
     return salary;
 }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
