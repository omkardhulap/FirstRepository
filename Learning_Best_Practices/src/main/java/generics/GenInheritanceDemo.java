package generics;

import java.util.ArrayList;
import java.util.List;

public class GenInheritanceDemo {

    public static void main(String[] args) {
        ParentGen parentGen = new ParentGen();
        ChildGen childGen = new ChildGen();

        childGen.cMe1();

        List<ParentGen> parentGenList = new ArrayList<ParentGen>();

        parentGenList.add(parentGen);
        parentGenList.add(new ParentGen());
        parentGenList.add(new ChildGen());
        parentGenList.add(childGen);

        //parentGenList.get(3).cMe1();

        List<ChildGen> childGenList = new ArrayList<ChildGen>();
        childGenList.add(new ChildGen());
        childGenList.add(childGen);

        ChildGen abc = new ChildGen();

		//foo(childGenList);
		foo(parentGenList);

		//bar(parentGenList);
                bar(childGenList);
		
		qwerty(abc);
    }

    public static void qwerty(ParentGen gen) {
    }

    public static void foo(List<ParentGen> gens) {
    }

    public static void bar(List<ChildGen> gens) {
    }
}
