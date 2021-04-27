package pattern.creational.abstractfactory;

public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("java 手记");
    }
}
