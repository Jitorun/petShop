public  class setMeal {
    private static double discount[] ={384,288,152,0};//套餐
    public static int money=10000;

    public static String listmenu(){
        return "套餐1:三种疫苗都打,疫苗总价打八折,   " +
                "套餐2:打致弱疫苗和灭活疫苗两种疫苗,疫苗总价打九折   " +
                "套餐3:只打基因工程疫苗种疫苗,打九点五折   " +
                "套餐4:不打疫苗,不打折" ;

    }
    /*
    返回折扣
     */
    public static double pag(int i){

        try{
            return  discount[i-1];
        } catch (Exception e){
            System.out.println("------------------请选择正确套餐-----------------------");
            System.exit(0);
        }
        return 0;
    }
}
