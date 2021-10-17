public class Books {
    int pageCount;
    String name;
    String genre;
    boolean isHardcover;

     void  describe(){
        String description = String.format("%s in genre of %s", name, genre);
        System.out.print(description);
    }
    boolean scheckIfHardcover(){
        return isHardcover;
    }

}
