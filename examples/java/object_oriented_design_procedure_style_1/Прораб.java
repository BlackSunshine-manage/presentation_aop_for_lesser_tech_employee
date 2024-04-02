package object_oriented_design_procedure_style_1;

public class Прораб {
    public void замешай_бетон(Строитель строитель, Стройплощадка стройплощадка) {
        Рация рация = new Рация(this);
        строитель.положить_в_инвентарь(рация);
        строитель.идти(стройплощадка);
        строитель.замешивать_бетон(стройплощадка);
    }
    void принять_сообщение(String сообщение) {}
}