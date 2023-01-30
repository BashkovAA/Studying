public class Printer {
    private String queue = "";
    private int pendingPagesCount = 0;
    private int printedPagesCount = 0;

    public void append(String text) {
        append(text, "Без названия", 0);
    }
    public void append(String text, String name) {
        append(text, name, 0);
    }
    public void append(String text, String name, int pages) {
        queue = queue + "\n" + name + "\n" + text + "\n" + "Количество страниц: " + pages;
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }
    public int getPrintedPagesCount() {
        return printedPagesCount;
    }

    public void clear() {
        queue = "";
    }
    public void print() {
        System.out.print("Очередь печати:");
        if (queue.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println(queue);
        }
        clear();
    }
}
