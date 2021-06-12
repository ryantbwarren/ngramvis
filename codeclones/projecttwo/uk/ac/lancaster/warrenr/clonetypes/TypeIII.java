package uk.ac.lancaster.warrenr.clonetypes;

/**
 * Project Two - Type III Code Clones
 */
public class TypeIII {
    public void reordering(List<String> names) {
        names.forEach(System.out::println);
        System.out.println("Names:");
        names.clear();
    }

    public void deletion() {
        for (int i = 0; i < 100; i++) {}
    }

    public void duplication() {
        System.out.print("duplicated");
        System.out.print("duplicated");
        System.out.print("duplicated");
    }
}