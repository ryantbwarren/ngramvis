package uk.ac.lancaster.warrenr.clonetypes;

/**
 * Project One - Type II Code Clones
 */
public class TypeII {
    public void methodSignature(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
    }

    public void renamingIdentifiers(String s) {
        long number = 1L;
        System.out.println(s + number);
    }
}