import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType {
        SOCCER, HOCKEY, RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
        String file = "";
        String content = "";
        switch (game) {
            case RUGBY:
                file = "rugby.txt";
                content = "15";
                break;
            case HOCKEY:
                file = "hockey.txt";
                content = "6";
                break;
            case SOCCER:
                file = "soccer.txt";
                content = "11";
                break;
        }
        Game.createFile(file);
        Game.writeToFile(file, content);
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error. cannot write... ");
            e.printStackTrace();
        }

    }

}