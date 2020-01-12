package facade;

public class GeneralHello implements Facade {

    private FrenchHello frenchHello;
    private GermanHello germanHello;
    private RomanianHello romanianHello;

    public GeneralHello() {
        this.frenchHello = new FrenchHello();
        this.germanHello = new GermanHello();
        this.romanianHello = new RomanianHello();
    }

    @Override
    public String sayHelloInDifferentLanguages() {
        return this.romanianHello.sayRomanianHello() + "\n" + this.frenchHello.sayFrenchHello() + "\n" + this.germanHello.sayHelloInGerman();
    }
}
