package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 加载界面资源文件
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // 设置标题
        primaryStage.setTitle("计算器");
        // 设置场景到主舞台，场景的高度和宽度
        primaryStage.setScene(new Scene(root, 600, 630));
        // 展示舞台
        primaryStage.show();
    }


    public static void main(String[] args) {
        // 运行程序
        launch(args);
    }
}
