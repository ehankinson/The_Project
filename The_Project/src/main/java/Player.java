import java.util.*;
import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;

public class Player extends Creature{
    private int projAngle;
    private static ArrayList<Projectile> projList = new ArrayList<>();

    public Player() {
//        ethan was here at 1:41
        super(100,10, 10, 100, 100, 5, 20);
        DrawCircle(posX, posY, size, RED);
    }
//move function that updates player posistions and redraws the position.
    public void move() {
        if (IsKeyDown(KEY_W) && posY > 3 + size) {
            posY -= moveSpeed;
        }
        if (IsKeyDown(KEY_S) && posY < GetScreenHeight() - size) {
            posY += moveSpeed;
        }
        if (IsKeyDown(KEY_D) && posX < GetScreenWidth() - size) {
            posX += moveSpeed;
        }
        if (IsKeyDown(KEY_A) && posX > 3 + size) {
            posX -= moveSpeed;
        }
    }
    public void createProjecitle(){
        if (IsMouseButtonPressed(MOUSE_BUTTON_LEFT)) {
            DrawCircle(posX, posY, 10, PURPLE);
            setProjecitleDirection();
            projList.add(new Projectile(10,posX,posY,10, projAngle));
        }
        checkProjectilesBounds();
    }
    public void checkProjectilesBounds(){
        for(int i = 0; i < projList.size(); i++){
            Projectile current = projList.get(i);
            current.boundsCheck();
            if(!(current.isInBounds())){
                projList.remove(i);
            }
            current.move();
        }
    }
    public void setProjecitleDirection(){
        if (IsKeyDown(KEY_W) && IsKeyDown(KEY_A)){
            projAngle = 315;
        }
        else if (IsKeyDown(KEY_W) && IsKeyDown(KEY_D)){
            projAngle = 45;
        }
        else if (IsKeyDown(KEY_D) && IsKeyDown(KEY_S)){
            projAngle = 135;
        }
        else if (IsKeyDown(KEY_A) && IsKeyDown(KEY_S)){
            projAngle = 225;
        }
        else if (IsKeyDown(KEY_W)){
            projAngle = 0;
        }
        else if (IsKeyDown(KEY_D)) {
            projAngle = 90;
        }
        else if (IsKeyDown(KEY_S)){
            projAngle = 180;
        }

        else if (IsKeyDown(KEY_A)){
            projAngle = 270;
        }

    }
//    redraws the players position
    public void update(){
        move();
        createProjecitle();
        DrawCircle(posX, posY, size, RED);
    }
}

