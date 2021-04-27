package pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        Video javaVideo = new JavaVideo();
        javaVideo.produce();

        Video pythonVideo = new PythonVideo();
        pythonVideo.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();

        VideoFactory videoFactory1 = new VideoFactory();
        Video video1 = videoFactory1.getVideoForClass(JavaVideo.class);
        video1.produce();
    }
}
