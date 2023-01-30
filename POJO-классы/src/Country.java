public class Country {

    private String country;
    private int populationSize;
    private int area; // Квадратные киллометры
    private String capital;
    private Boolean accessSea;

    public Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(int populationSize) {
        this.populationSize = populationSize;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Boolean getAccessSea() {
        return accessSea;
    }

    public void setAccessSea(Boolean accessSea) {
        this.accessSea = accessSea;
    }
}
