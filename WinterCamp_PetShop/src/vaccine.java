import java.util.HashMap;
import java.util.Map;

public class vaccine {
    private static int attenuatedPrice=160;//致弱疫苗价格
    private static int InactivatedPrice=160;//灭活疫苗价格
    private static int engineeringPrice=160;//基因工程疫苗价格
    private static Map<String,Integer> attenuatedVaccine =new HashMap<>();//致弱疫苗
    private static Map<String,Integer> InactivatedVaccine  =new HashMap<>();//灭活疫苗
    private static Map<String,Integer> engineeringVaccine  =new HashMap<>();//基因工程疫苗
    public static boolean isAttenuatedVaccine(String id){
        if (attenuatedVaccine.containsKey(id)){
            return true;
        }
        else
            return false;
    }
    public static boolean isInactivatedVaccine(String id){
        if (InactivatedVaccine.containsKey(id)){
            return true;
        }
        else
            return false;
    }
    public static boolean isEngineeringVaccine(String id){
        if (engineeringVaccine.containsKey(id)){
            return true;
        }
        else
            return false;
    }

    public static int getAttenuatedPrice() {
        return attenuatedPrice;
    }
    public static int getInactivatedPrice(){
        return InactivatedPrice;
    }
    public static int getEngineeringPrice(){
        return engineeringPrice;
    }
    public static void takeFirstVaccine(String ID){
        attenuatedVaccine.put(ID,1);

    }
    public static void takeScondVaccine(String ID){
        InactivatedVaccine.put(ID,1);

    }
    public static void takeThirdVaccine(String ID){
        engineeringVaccine.put(ID,1);
    }
    //宠物卖出后疫苗档案消除
    public static void costVaccine(String ID){
        if (attenuatedVaccine.containsKey(ID)){
            attenuatedVaccine.remove(ID);
        }
        if (InactivatedVaccine.containsKey(ID)){
            InactivatedVaccine.remove(ID);
        }
        if (engineeringVaccine.containsKey(ID)){
            engineeringVaccine.remove(ID);
        }
    }
}
