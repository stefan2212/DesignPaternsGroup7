package adapter;

public class Adapter implements USASnuff, IRomanianSnuff {

    @Override
    public void plugInUsaSocket() {
        RomanianSnuff romanianSnuff = new RomanianSnuff();
        romanianSnuff.plugInRomanianSnuff();
    }

    @Override
    public void plugInRomanianSnuff() {
        USASnuff usaSnuff = new UsaSnuffImpl();
        usaSnuff.plugInUsaSocket();
    }
}
