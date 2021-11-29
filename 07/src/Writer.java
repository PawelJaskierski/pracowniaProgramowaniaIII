public class Writer {
    private String name;
    private  String surname;


    public Writer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String sign(){
        return name + " " +surname;

    }
}
