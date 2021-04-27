package pattern.creational.abstractfactory;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python 课程视频");
    }
}
