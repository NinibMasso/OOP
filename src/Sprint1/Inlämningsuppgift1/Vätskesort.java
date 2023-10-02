package Sprint1.Inlämningsuppgift1;

public enum Vätskesort {
    KRANVATTEN("kranvatten"),
    PROTEINVATTEN("proteinvatten"),
    MINERALVATTEN("mineralvatten");

    public final String vätskeSort;

    Vätskesort(String s) {
        this.vätskeSort = s;
    }
}
