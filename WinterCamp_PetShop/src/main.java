import sun.security.pkcs11.wrapper.CK_ATTRIBUTE;
import java.util.Scanner;
/*
Github
 */
public class main {
    public static void main(String[] args) {
        /*
        进货
         */
        new Cat("001","小白","雌",5,1000).buy("001","小白","雌",5,1000);
        new Dog("002","小黑","雌",5,1200).buy("002","小黑","雌",5,1200);
        new Dog("003","小黄","雄",3,1100).buy("003","小黄","雄",3,1100);


        /*
        寄养测试
         */
        petShop.adopt(new Cat("011","小青","雄",4,0));//寄养
        petShop.printAdopt();
        petShop.takeadopt("010");//测试输入错误序号
        petShop.takeadopt("011");//领走寄养宠物
        petShop.printAdopt();

        for (animal test : petShop.list){
            System.out.println("-----------------------------------------------------------");
            System.out.println(test.toString());
            System.out.println("-----------------------------------------------------------");
        }
        //分割开来，比较明朗
        for (int i =0 ;i<4;i++){
            System.out.println(" ");
        }
        System.out.println(setMeal.listmenu());
        for (int i =0 ;i<4;i++){
            System.out.println(" ");
        }
        petShop.cost("001",1);
        petShop.cost("003",2);
        System.out.println("下面进行测试序号错误的异常");
        petShop.cost("001",1);//1号已经被购买走
        System.out.println("下面进行测试序号错误的异常");
        petShop.cost("004",2);
        System.out.println("下面进行测试套餐错误的异常");
        petShop.cost("002",6);//选择不正常套餐的异常捕获

    }
}
