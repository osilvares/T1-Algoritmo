public class SelectionSortAuto {
    public static int num[] = {40000,80000,160000,320000,640000,1280000,2560000};
    public static int v,a;
    private static String[] args;

    public static void main(String[] args) {
      
       rodar();
       for(int i = 1; i < 8;i++){
            if (a> 21){
                a=0;
                v+=1;
                rodar();
            }
        }
    }

    public static void rodar(){
        System.out.println("Valor atual:" + num[v]);

        for(int i = 1; i<21;i++){
            SelectionSort bb = new SelectionSort();
            bb.main(args);;
            a += i;
        }
    }

    public int nu() {
        return num[v];
    }
}


