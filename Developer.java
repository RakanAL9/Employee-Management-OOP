public class Developer  extends Employee{
    String porogram;
    int workTime;
    int bonas;

    public Developer(String name , int number , int salary ,String porogram,int workTime , int bonas){
        super(name , number , salary);
        this.porogram=porogram;
        this.workTime=workTime;
        this.bonas=bonas;
    }
    public void setPorogram(String porogram){
        this.porogram=porogram;
    }
    public String getPorogram(){
        return porogram;
    }
    public void setWorkTime(int workTime){
        this.workTime=workTime;
    }
    public int getWorkTime(){
        return workTime;
    }
    public void setBonas(int bonas){
        this.bonas=bonas;
    }
    public  int getBonas(){
        return bonas;
    }
    @Override
    public int getSalary(){
        return workTime*bonas+super.getSalary();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Developer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", salary=").append(salary);
        sb.append(", porogram='").append(porogram).append('\'');
        sb.append(", workTime=").append(workTime);
        sb.append(", bonas=").append(bonas);
        sb.append('}');
        return sb.toString();
    }
}
