package pattern.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;

public class VideoFactory {

    public Video getVideoForClass(Class<? extends Video> c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return video;
    }

    public Video getVideo(String type) {
        switch (type) {
            case "java":
                return new JavaVideo();
            case "python":
                return new PythonVideo();
            default:
                return null;
        }
    }
}
