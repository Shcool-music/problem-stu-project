package pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
//        Video javaVideo = new JavaVideo();
//        javaVideo.produce();
//
//        Video pythonVideo = new PythonVideo();
//        pythonVideo.produce();
//
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        video.produce();
//
//        VideoFactory videoFactory1 = new VideoFactory();
//        Video video1 = videoFactory1.getVideoForClass(JavaVideo.class);
//        video1.produce();

        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory factory = new FeVideoFactory();
        Video video1 = factory.getVideo();
        video1.produce();
    }
}
