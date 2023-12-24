import static com.raylib.Raylib.*;
import static com.raylib.Jaylib.*;
public class Main {
    public static void main(String[] args) {
        final int SCREENWIDTH = 1920;
        final int SCREENHEIGHT = 1080;
//        create new window
        InitWindow(SCREENWIDTH, SCREENHEIGHT, "testing game mechanics");
//      target fps

        SetTargetFPS(60);

        Player player1 = new Player();
//        this checks if they cloes the window or press escape
//        if not, run the loop and update stuff
        while (!WindowShouldClose()){
            BeginDrawing();
            ClearBackground(RAYWHITE);
            player1.update();
            DrawFPS(100,100);
            EndDrawing();
        }
//        close the window
        CloseWindow();
    }
}
