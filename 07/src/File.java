public class File {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void display(){
        System.out.println("Name: " + name +"\nSize: " + size);
    }

}
