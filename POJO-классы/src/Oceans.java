public class Oceans {
    private String ocean;
    private int area;
    private int maxDepth;
    private String riversFlowIn;
    private int numberSize; // Номер по величине среди океанов

    public Oceans(String ocean, String riversFlowIn) {
        this.ocean = ocean;
        this.riversFlowIn = riversFlowIn;
    }

    public String getOcean() {
        return ocean;
    }

    public void setOcean(String ocean) {
        this.ocean = ocean;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public String getRiversFlowIn() {
        return riversFlowIn;
    }

    public void setRiversFlowIn(String riversFlowIn) {
        this.riversFlowIn = riversFlowIn;
    }

    public int getNumberSize() {
        return numberSize;
    }

    public void setNumberSize(int numberSize) {
        this.numberSize = numberSize;
    }
}
