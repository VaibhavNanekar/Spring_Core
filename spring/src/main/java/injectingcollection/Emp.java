package injectingcollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String,String> courses;
    private Properties config;

    public Properties getConfig() {
        return config;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }


       public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Emp(Set<String> addresses, Properties config, Map<String, String> courses, String name, List<String> phones) {
        this.addresses = addresses;
        this.config = config;
        this.courses = courses;
        this.name = name;
        this.phones = phones;
    }

    public Emp(){
        super();
    }
}
