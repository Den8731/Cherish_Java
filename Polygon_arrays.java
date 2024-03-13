import java.awt.*;
import java.io.File;
import java.sql.SQLOutput;

class Polygons{

    public static <string> void main(String[] args) {


if(!Desktop.isDesktopSupported())//check if desktop is supported by platform
{
    System.out.println("Not supported");
    return;
}
        Desktop desktop = Desktop.getDesktop();


        File file = new File("C:\\desktop\bookone.xlsx");
        if(file.exists())
            desktop.open(file);
        catch(Exception e){
            e.printStackTrace();
        }
    }
}