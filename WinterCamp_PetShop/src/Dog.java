public class Dog extends  animal implements petShop{

    private int count=0;

    public int getCount() {
        return count;
    }

    public Dog(String ID, String name, String sex, int age, int price){
        setName(name);
        setAge(age);
        setID(ID);
        setSex(sex);
        setPrice(price);
        count++;

    }


    @Override
    public String toString() {
        return "         Dog [ ID :"+getID()+" 姓名 :" +getName()+ " 性别 :"+getSex()+" 年龄 :"+getAge()+" 价格 :"+getPrice()+ "]";
    }
    @Override
    public void isvaccine(){
        System.out.println("------------------------------------狗----------------------------------");
        System.out.println(toString());
        System.out.println("-------------------------------疫苗接种情况-------------------------------");
        if (vaccine.isAttenuatedVaccine(getID())){
            System.out.println("                          致弱疫苗已注射");
        }
        else
            System.out.println("                          致弱疫苗未注射");
        if (vaccine.isInactivatedVaccine(getID())){
            System.out.println("                          灭活疫苗已注射");
        }
        else
            System.out.println("                          灭活疫苗未注射");
        if (vaccine.isEngineeringVaccine(getID())){
            System.out.println("                          基因工程疫苗已注射");
        }
        else
            System.out.println("                          基因工程疫苗未注射");

    }


    @Override
    public void buy(String ID, String name, String sex, int age, int price) {
        list.add(new Dog(ID,name,sex,age,price));
        setMeal.money-=price;
        System.out.println("购入ID为"+ID+"的动物后,当前店铺资金: "+setMeal.money);
    }
}

