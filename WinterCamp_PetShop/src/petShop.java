import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public interface petShop {

    static List<animal> list =new ArrayList<>();

    public static void cost(String ID, int i)//出售
    {
        //System.out.println("");
        for (animal testi:list){
            if (ID==testi.getID()){
                //出售

                double num=testi.getPrice()+setMeal.pag(i);
                //注射疫苗
                if (i==1){
                    vaccine.takeFirstVaccine(ID);
                    vaccine.takeScondVaccine(ID);
                    vaccine.takeThirdVaccine(ID);
                }
                else if (i==2){
                    vaccine.takeFirstVaccine(ID);
                    vaccine.takeScondVaccine(ID);
                    //vaccine.takeThirdVaccine(ID);
                }
                else if (i==3){
                    //vaccine.takeFirstVaccine(ID);
                    //vaccine.takeScondVaccine(ID);
                    vaccine.takeThirdVaccine(ID);
                }

                testi.isvaccine();
                petShop.NowString();
                vaccine.costVaccine(ID);

                System.out.println("                                                    价格为:"+num);
                setMeal.money+=testi.getPrice()+setMeal.pag(i);
                System.out.println("                                                    当前店铺资金为:"+setMeal.money);
                list.remove(testi);
                System.out.println("--------------------------操作完成--------------------------");
                return;
            }

        }
        System.out.println("--------------------------请输入正确序号--------------------------");
    }

    public  void buy(String ID,String name,String sex,int age,int price);//进货

    public static void NowString() {
            SimpleDateFormat df = new SimpleDateFormat("                                                    yyyy-MM-dd HH:mm:ss");//设置日期格式
            System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

    }

}
