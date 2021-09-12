/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2;

/**
 *
 * @author akifkilic
 */
public class cityfortablework {

    //here is our field
    private int id;
    private String name;
    private int population;
    private String district;
    private String countrycode;

    // field is above the constructor
    // constructor always stay on high, if not u should come it there
    // Here is our contsructor
    public cityfortablework(int id, String name, int population, String district, String countrycode) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.district = district;
        this.countrycode = countrycode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

}
