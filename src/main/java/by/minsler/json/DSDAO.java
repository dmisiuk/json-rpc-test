package by.minsler.json;

import com.google.gson.Gson;


/**
 * Created with IntelliJ IDEA.
 * User: minsler
 * Date: 11/12/12
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class DSDAO implements DAO {

    @Override
    public boolean addFilm(String filmJson) {

        Gson gson = new Gson();
        Film film = gson.fromJson(filmJson,Film.class);

        System.out.println("added film \n" + film);
        return true;

    }
}
