package sample;

public class SortMaster {
 public void SortByDate(Check[] lib){

     boolean isSorted = false;
     Check buf;
     while(!isSorted) {
         isSorted = true;
         for (int i = 0; i < lib.length-1; i++) {
             if(lib[i].Date > lib[i+1].Date){
                 isSorted = false;

                 buf = lib[i];
                 lib[i] = lib[i+1];
                 lib[i+1] = buf;
             }
         }
     }
 }
    public void SortByPrice(Check[] lib){

        boolean isSorted = false;
        Check buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lib.length-1; i++) {
                if(lib[i].Price > lib[i+1].Price){
                    isSorted = false;

                    buf = lib[i];
                    lib[i] = lib[i+1];
                    lib[i+1] = buf;
                }
            }
        }
    }

    public void Diagramm(){

    }

}
