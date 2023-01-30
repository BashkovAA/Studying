public class Array_10_2 {
    public static void main(String[] args) {
        String text = "сидит желает желает Каждый Каждый охотник , знать где фазан";

        String[] colors = text.split(",?\\s+");

        for (int i = 0; i < colors.length; i++) {
            if (i > 0 && colors[i].equals(colors[i - 1])) {
                continue;
            }
            System.out.println(colors[i]);
        }
    }
}
