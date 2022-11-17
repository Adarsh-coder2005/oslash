import java.util.*;

class Product{
    int sum_purchase=0;
    int sum_discount=0;
    String[] items = new String[100];
    int j=0;
    int temp;
    int total=0;

    public void calc(String[] name, int[] quantity){
        for(int i=0; i<name.length; i++){
            if (Arrays.asList(name).contains("TSHIRT")){
                sum_purchase += quantity[i]*1000;
                System.out.println("ITEM_ADDED");
                items[j] = "TSHIRT";
            }else if (Arrays.asList(name).contains("JACKET")){
                sum_purchase += quantity[i]*2000;
                System.out.println("ITEM_ADDED");
                items[j] = "JACKET";
            }else if (Arrays.asList(name).contains("CAP")){
                sum_purchase += quantity[i]*500;
                System.out.println("ITEM_ADDED");
                items[j] = "CAP";
            }else if (Arrays.asList(name).contains("NOTEBOOK")){
                sum_purchase += quantity[i]*200;
                System.out.println("ITEM_ADDED");
                items[j] = "NOTEBOOK";
            }else if (Arrays.asList(name).contains("PENS")){
                sum_purchase += quantity[i]*300;
                System.out.println("ITEM_ADDED");
                items[j] = "PENS";
            }else if (Arrays.asList(name).contains("MARKERS")){
                sum_purchase += quantity[i]*500;
                System.out.println("ITEM_ADDED");
                items[j] = "MARKERS";
            }
            j= j+1;
        }
        
            if(sum_purchase >= 1000){
            for(int k=0; k<name.length; k++){
                if(Arrays.asList(name).contains("TSHIRT")){
                    sum_purchase = sum_purchase - (quantity[k]*(1000*10)/100);
                    total += quantity[k]*((1000*10)/100);
                }else if(Arrays.asList(name).contains("JACKET")){
                    sum_purchase = sum_purchase - (quantity[k]*(2000*5)/100);
                    total += quantity[k]*((2000*5)/100);
                }else if(Arrays.asList(name).contains("CAP")){
                    sum_purchase = sum_purchase - (quantity[k]*(500*20)/100);
                    total += quantity[k]*((500*20)/100);
                }else if(Arrays.asList(name).contains("NOTEBOOK")){
                    sum_purchase = sum_purchase - (quantity[k]*(200*20)/100);
                    total += quantity[k]*((20*200)/100);
                }else if(Arrays.asList(name).contains("PENS")){
                    sum_purchase = sum_purchase - (quantity[k]*(300*10)/100);
                    total += quantity[k]*((300*10)/100);
                }else if(Arrays.asList(name).contains("MARKERS")){
                    sum_purchase = sum_purchase - (quantity[k]*(500*5)/100);
                    total += quantity[k]*((500*5)/100);
                }
            }
        }else if(sum_purchase >= 3000){
            for(int k=0; k<name.length; k++){
                if(Arrays.asList(name).contains("TSHIRT")){
                    sum_purchase = sum_purchase - (quantity[k]*(1000*10)/100);
                    total += quantity[k]*((1000*10)/100);
                }else if(Arrays.asList(name).contains("JACKET")){
                    sum_purchase = sum_purchase - (quantity[k]*(2000*5)/100);
                    total += quantity[k]*((2000*5)/100);
                }else if(Arrays.asList(name).contains("CAP")){
                    sum_purchase = sum_purchase - (quantity[k]*(500*20)/100);
                    total += quantity[k]*((500*20)/100);
                }else if(Arrays.asList(name).contains("NOTEBOOK")){
                    sum_purchase = sum_purchase - (quantity[k]*(200*20)/100);
                    total += quantity[k]*((200*20)/100);
                }else if(Arrays.asList(name).contains("PENS")){
                    sum_purchase = sum_purchase - (quantity[k]*(300*10)/100);
                    total += quantity[k]*((300*10)/100);
                }else if(Arrays.asList(name).contains("MARKERS")){
                    sum_purchase = sum_purchase - (quantity[k]*(500*5)/100);
                    total += quantity[k]*((500*5)/100);
                }
            }
            sum_purchase = sum_purchase - (sum_purchase*5)/100;
        }
            temp = sum_purchase;

            sum_purchase = sum_purchase + ((temp*10)/100);
            
            System.out.println("TOTAL DISCOUNT: "+total);
            System.out.println("TOTAL AMOUNT TO PAY: "+sum_purchase);
    }
}

class Program{
    public static void main(String[] args) {
        String[] names = new String[2];
        int[] quantities = new int[2];
        String[] items = new String[2];
        
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        while(true){
        System.out.println("SELECT THE OPTION:");
        System.out.println("1.ADD ITEM");
        System.out.println("2.PRINT BILL");

        //p.calc(names, quantities);

         int chosen = sc.nextInt();
         switch(chosen) {
         case 1:
             for(int j=0;j<2;j++){
                 names[j] = sc.next();
                 quantities[j] = sc.nextInt();
             }
             break;
        
         case 2:
             p.calc(names, quantities);
             break;
         }
        
    }
}
}