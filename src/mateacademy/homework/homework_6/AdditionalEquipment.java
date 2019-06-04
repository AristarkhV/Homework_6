package mateacademy.homework.homework_6;

public class AdditionalEquipment implements Cloneable {
    private boolean сruiseСontrol;
    private boolean freshenerHerringbone;

    @Override
    protected Object clone(){
        try {
            return (AdditionalEquipment) super.clone();
        } catch (CloneNotSupportedException ex) {
            return new AdditionalEquipment(this.сruiseСontrol, this.freshenerHerringbone);
        }
    }

    public AdditionalEquipment(boolean сruiseСontrol, boolean freshenerHerringbone) {
        this.сruiseСontrol = сruiseСontrol;
        this.freshenerHerringbone = freshenerHerringbone;
    }

    public boolean isСruiseСontrol() {
        return сruiseСontrol;
    }

    public void setСruiseСontrol(boolean сruiseСontrol) {
        this.сruiseСontrol = сruiseСontrol;
    }

    public boolean isFreshenerHerringbone() {
        return freshenerHerringbone;
    }

    public void setFreshenerHerringbone(boolean freshenerHerringbone) {
        this.freshenerHerringbone = freshenerHerringbone;
    }
}
