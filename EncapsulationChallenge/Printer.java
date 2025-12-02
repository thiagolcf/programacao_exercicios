public class Printer {
   private int tonerLevel;
   private int pagesPrinted;
   private boolean duplex; 

   public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
    this.tonerLevel = tonerLevel;
    this.pagesPrinted = pagesPrinted;
    this.duplex = duplex;
    }

    public int addToner(int tornerAmount) {
        tonerLevel += tornerAmount;
        if(tonerLevel > 100) {
            return -1;
        }
        if(tonerLevel < 0){
            return -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages){
        if(duplex){
            System.out.println("Its a duplex printer");
             pagesPrinted += (pages / 2);
        }
        pagesPrinted += pages;
        return pagesPrinted;
    }
}


