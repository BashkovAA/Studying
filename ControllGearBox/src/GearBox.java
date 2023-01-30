public class GearBox {
    /**
     * 0 - neatral
     * -1 - rear
     * 1-6 -
     */
    public static final int MIN_GEAR = 1;
    public static final int MAX_GEAR = 6;
    private int gear = 0;

    public final GearBoxType type;

    public GearBox(GearBoxType type) {
        this.type = type;
    }

    public GearBoxType getType() {
        return type;
    }

    public void shigtUp() {
        gear = gear < MAX_GEAR ? gear + 1 : gear;
    }
    public void shiftDown() {
        gear = gear > MIN_GEAR ? gear - 1 : gear;
    }
    public void switchGear() {
        gear = (gear > 1)? gear : -1;
    }
    public void switchNeatral() {
        gear = 0;
    }
    public int getCurrentGear() {
        return gear;
    }
}
