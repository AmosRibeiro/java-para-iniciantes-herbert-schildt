package capitulo12.enums;

public enum Speed {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;

    Speed(int s){speed = s;}

    int getSpeed(){ return speed;}
}
