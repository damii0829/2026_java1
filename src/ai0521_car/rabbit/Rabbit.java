package ai0521_car.rabbit;

public class Rabbit {
    private String shape; //토끼의 모양
    private int xPos; //X 위치
    private int yPos; //Y 위치

    public Rabbit(){
    }

    public Rabbit(String shape){
        this.shape = shape;
    }
    public String getShape() {
        return shape;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}


