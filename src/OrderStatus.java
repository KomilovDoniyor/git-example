public enum OrderStatus {
    NEW("Yangi buyurtma","Yangi buyurtma","Yangi buyurtma"),
    PROCESSING("Tayyorlanmoqda","Tayyorlanmoqda","Tayyorlanmoqda"),
    DONE("Tugatildi","Tugatildi","Tugatildi");

    private final String nameUz;
    private final String nameRu;
    private final String nameEn;

    OrderStatus(String nameUz, String nameRu, String nameEn) {
        this.nameUz = nameUz;
        this.nameRu = nameRu;
        this.nameEn = nameEn;
    }

    public String getNameUz() {
        return nameUz;
    }

    public String getNameRu() {
        return nameRu;
    }

    public String getNameEn() {
        return nameEn;
    }
}
