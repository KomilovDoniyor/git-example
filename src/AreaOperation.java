public enum AreaOperation implements Shape {

    SQUARE("Kvadrat"), RECTANGLE("To'g'ri to'rtburchak");

    private final String name;

    AreaOperation(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Nomi: " + name);
    }
}
