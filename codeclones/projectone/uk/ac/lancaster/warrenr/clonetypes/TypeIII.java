package uk.ac.lancaster.warrenr.clonetypes;

/**
 * Project One - Type III Code Clones
 */
public class TypeIII {
    public void reordering(List<String> names) {
        names.clear();
        names.forEach(System.out::println);
        System.out.println("Names:");
    }

    public void deletion() {
        for (int i = 0; i < 100; i++) {
            System.out.print("looping" + i);
        }
    }

    public void duplication() {
        System.out.print("duplicated");
    }
}