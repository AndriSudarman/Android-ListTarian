package id.ac.poliban.mi.andri.listtarian;

public class Tarian {
    private String tarian;
    private String tarianName;
    private String tarianDesc;

    public Tarian(String tarian, String tarianName, String tarianDesc) {
        this.tarian = tarian;
        this.tarianName = tarianName;
        this.tarianDesc = tarianDesc;
    }

    public String getTarian() {
        return tarian;
    }

    public void setTarian(String tarian) {
        this.tarian = tarian;
    }

    public String getTarianName() {
        return tarianName;
    }

    public void setTarianName(String tarianName) {
        this.tarianName = tarianName;
    }

    public String getTarianDesc() {
        return tarianDesc;
    }

    public void setTarianDesc(String tarianDesc) {
        this.tarianDesc = tarianDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getTarianName(), getTarianDesc());
    }
}
