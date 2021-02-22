public class main {
    public static void main(String[] args){

        int[] zahlen={4, 8, 3, 9};

        for (int i = 0; i <zahlen.length ; i++) {
            int sortieren = zahlen[i];
            int j= i;

            while (j>0 && sortieren<zahlen[j - 1]){
                zahlen[j]=zahlen[j - 1];
                j--;
            }
            zahlen[j]= sortieren;
        }
        System.out.println(zahlen[0]);
        System.out.println(zahlen[1]);
        System.out.println(zahlen[2]);
        System.out.println(zahlen[3]);
    }
}
