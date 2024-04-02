package object_oriented_design_procedure_style_1;

import object_oriented_design.Прораб;

class ObjectOrientedDesign {
    {
        Прораб прораб = new Прораб();
        Строитель строитель = new Строитель();
        Стройплощадка стройплощадка = new Стройплощадка();
        прораб.замешай_бетон(строитель, стройплощадка);
        ...
    }
}