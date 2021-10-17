public class Rectangle {
    float width;
    float height;
    float giveSurface() {
        return width * height;
    }
    float givePerimeter(){
        return 2*width  + 2*height;
        }
    void displayDimensions(){
        String display = String.format("width: %f height: %f", width, height);
        System.out.println(display);

    }
}

