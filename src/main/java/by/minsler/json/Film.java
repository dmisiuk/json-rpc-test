package by.minsler.json;

/**
 * Created with IntelliJ IDEA.
 * User: minsler
 * Date: 11/12/12
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Film {
    private String ru_name;
    private String eng_name;

    public Film() {
    }

    public String getRu_name() {
        return ru_name;
    }

    public void setRu_name(String ru_name) {
        this.ru_name = ru_name;
    }

    public String getEng_name() {
        return eng_name;
    }

    public void setEng_name(String eng_name) {
        this.eng_name = eng_name;
    }

    @Override
    public String toString() {
        return "ru_name: " + ru_name + "; eng_name: " + eng_name;
    }
}
