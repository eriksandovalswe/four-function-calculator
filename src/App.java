import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("Calculator");

        GridPane grid = new GridPane();
        grid.setHgap(10); // horizontal gap in pixels of grid cells
        grid.setVgap(10); // vertical gap in pixels of grid cells

        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button equals = new Button("=");
        Button clear = new Button("C");
        Button dot = new Button(".");
        Button zero = new Button("0");
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");

        grid.add(plus, 0, 0);
        grid.add(minus, 1, 0);
        grid.add(multiply, 2, 0);
        grid.add(divide, 3, 0);
        grid.add(equals, 4, 0);
        grid.add(clear, 5, 0);
        grid.add(dot, 6, 0);
        grid.add(zero, 0, 1);
        grid.add(one, 1, 1);
        grid.add(two, 2, 1);
        grid.add(three, 3, 1);
        grid.add(four, 0, 2);
        grid.add(five, 1, 2);
        grid.add(six, 2, 2);
        grid.add(seven, 3, 2);
        grid.add(eight, 0, 3);
        grid.add(nine, 1, 3);

        window.setScene(new Scene(grid, 300, 250));
        window.show();

    }
}
