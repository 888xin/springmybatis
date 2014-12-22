package cn.springmvc.model;

/**
 * Created by lhx on 14-12-22 上午10:56
 *
 * @project springmybatis
 * @package cn.springmvc.model
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @Description 照片
 */
public class Image {
    private int id ;
    private String imageName ;
    private String imagePath ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
