package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.CullFace;
import javafx.stage.Stage;
import javafx.scene.shape.Sphere;

public class SphereCullFace {

    public static void start() {
        Stage stage = new Stage(); // новое окно

        //------------------------------ Рисование Сферы 1
        Sphere sphere1 = new Sphere();
        sphere1.setRadius(50.0);//Установка радиуса сферы
        sphere1.setTranslateX(100); //Установка положения сферы
        sphere1.setTranslateY(150);
        sphere1.setCullFace(CullFace.FRONT);//установка отбраковочной грани сферы спереди

        //------------------------------ Рисование Сферы 2
        Sphere sphere2 = new Sphere();
        sphere2.setRadius(50.0);//Установка радиуса сферы
        sphere2.setTranslateX(300);//Установка положения сферы
        sphere2.setTranslateY(150);
        sphere2.setCullFace(CullFace.BACK);//установка отбраковочной грани сферы спереди

        //------------------------------ Рисование Сферы 3
        Sphere sphere3 = new Sphere();
        sphere3.setRadius(50.0);//Установка радиуса сферы
        sphere3.setTranslateX(500); //Установка положения сферы
        sphere3.setTranslateY(150);
        sphere3.setCullFace(CullFace.NONE); //установка отбраковочной грани сферы спереди

        //сгруппировать
        Group root = new Group(sphere1, sphere2, sphere3);

        Scene scene = new Scene(root, 600, 300);//создать сцену
        stage.setTitle("Drawing a Sphere");//название сцены
        stage.setScene(scene); //добавить на форму
        stage.show(); // отобразить
    }
}
