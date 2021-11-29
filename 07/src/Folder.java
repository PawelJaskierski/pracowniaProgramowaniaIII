import  java.util.List;
public class Folder {
    private List<File> files;
    public void addFile(File file){
        files.add(file);
    }
    public void removeFile(String name){
        int number = 0;
        for(File file : files){
            if(name == file.getName()){
                files.remove(number);
                break;
            }
            number +=1;
        }
    }
    public void displayFolder(){
        for (File file: files) {
            file.display();
        }
    }
}
