package object_oriented_design_procedure_style_after_refactoring;

public class Прораб {
    public void замешай_бетон(Строитель строитель, Стройплощадка стройплощадка) {
        идти_на_стройплощадку(строитель, стройплощадка);
        замешать_бетон(строитель, стройплощадка);
    }

    private void замешать_бетон(Строитель строитель, Стройплощадка стройплощадка) {
        Рация рация = строитель.дать_рацию();
        рация.сообщить("Я пошёл замешивать бетон");
        строитель.замешивать_бетон(стройплощадка);
        рация.сообщить("Я замешал бетон");
    }

    private void идти_на_стройплощадку(Строитель строитель,
                                       Стройплощадка стройплощадка) {
        Рация рация = new Рация(this);
        строитель.взять(рация);
        рация.сообщить("Я пошёл на стройплощадку");
        строитель.идти(стройплощадка);
        рация.сообщить("Я пришёл со стройплощадки");
    }

    void принять_сообщение(String сообщение) {}
}