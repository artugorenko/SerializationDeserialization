import org.json.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String stringForTask1 = "[\"Коля\", \"Вася\", \"Петя\"]";
        String stringForTask2 = "{a: 'aaa', b: 'bbb'}";
        String stringForTask3 = new String(Files.readAllBytes(Paths.get("src/main/resources/task3.txt")),
                StandardCharsets.UTF_8);

        //Task1
        JSONArray jsonArrayTask1 = new JSONArray(stringForTask1);
        System.out.println("Task1 " + jsonArrayTask1.toList());

        //Task2
        JSONObject jsonObjectTask2 = new JSONObject(stringForTask2);
        System.out.println("Task2 " + jsonObjectTask2);

        //Task3
        JSONObject jsonObjectTask3 = new JSONObject(stringForTask3);
        JSONArray jsonArrayTask3 = jsonObjectTask3.getJSONArray("data");
        JSONArray resultNameArray = new JSONArray();

        for (int i = 0; i < jsonArrayTask3.length(); i++)
            resultNameArray.put(jsonArrayTask3.getJSONObject(i).getJSONObject("from").get("name"));
        System.out.println("Task3 " + resultNameArray.toList());
    }
}
