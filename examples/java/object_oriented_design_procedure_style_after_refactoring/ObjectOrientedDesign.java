package object_oriented_design_procedure_style_after_refactoring;

class ObjectOrientedDesign {
    {
        Прораб прораб = new Прораб();
        Строитель строитель = new Строитель();
        Стройплощадка стройплощадка = new Стройплощадка();
        прораб.замешай_бетон(строитель, стройплощадка);
        ...
    }
}