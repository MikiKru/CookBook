package exercise;

import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class ImageChooser {
    public void getFile(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select image file");
        fileChooser.setInitialDirectory(new File("C:\\Users\\PROXIMO\\Desktop\\Cookbook\\Cookbook\\src\\main\\resources\\img"));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("png", "*.png"),
                new FileChooser.ExtensionFilter("jpg", "*.jpg")
        );
        File file = fileChooser.showOpenDialog(new Stage());
        if(file != null) {
            String imagepath = file.getPath();
            String direct_path = "C:\\Users\\PROXIMO\\Desktop\\Cookbook\\Cookbook\\src\\main\\resources";
            imagepath = imagepath.replace(direct_path, "");
            System.out.println("file:"+imagepath);
//            iv_image.setImage(new Image(imagepath));
        }
    }
}
