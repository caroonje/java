package Quiz;

public class Box {
    private int width, height;
    private char fillChar;
    public Box() {
        this(10,1);
    }
    public Box(int width,int height){
        this.width = width;
        this.height = height;
    }
    public void draw(){
        for (int i =0; i<height; i++){
            for(int j =0; j<width; j++){
                System.out.println("*");
            }

        }
    }
    public void  fill(char C){

    }

    public static void main(String[] args) {
        Box a = new Box();
        a.draw();
    }
}
