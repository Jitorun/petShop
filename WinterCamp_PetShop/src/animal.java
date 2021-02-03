public class animal {
    private String ID;
    private String name;
    private String sex;
    private int age;
    private int price=0;
    public int getPrice() {
        return price;
    }
    public void isvaccine(){
        System.out.println(toString());
    };
    void setPrice(int price){
        this.price=price;
    }
    void setName(String name){
        this.name=name;
    }
    void setID(String ID){
        this.ID=ID;
    }
    void setSex(String sex){
        this.sex=sex;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    String getSex(){
        return sex;
    }
    int getAge(){
        return age;
    }
}
