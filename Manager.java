public class Manager extends Employee{
    String type;
    int price;

   public Manager(String name , int number , int salary , String type , int price){
       super(name , number , salary);
       this.type=type;
       this.price=price;
   }
   public void setType(String type){
       this.type=type;
   }
   public  String getType(){
       return type;
   }
   @Override
    public int getSalary(){
        return super.getSalary()+price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public  int getPrice(){
       return price;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Manager{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", salary=").append(salary);
        sb.append(", type='").append(type).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
