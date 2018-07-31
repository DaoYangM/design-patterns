import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean hook() {
        String userInput = getUserInput();
        return userInput.equals("y");
    }

    public String getUserInput() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Would you like milk and sugar with you coffee (y/n) ? ");
            String answer = bufferedReader.readLine();

            return answer != null? answer: "no";
        } catch (IOException e) {
            System.out.println("IO error trying to read your answer");
        }

        return "no";
    }
}
