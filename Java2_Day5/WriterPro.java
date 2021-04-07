package HomeWork;

import java.io.Serializable;
import java.util.List;

public class WriterPro implements Serializable {
    private String path, content;

    public WriterPro(){
    }

    public WriterPro(String path, String content){
        this.path = path;
        this.content = content;
    }
    public String getPath(){
        return path;
    }
    public void setPath(String path){
        this.path = path;
    }
    public String getContent(){
        return content;
    }
    public String toString(){
        return content + " ";
    }
}
