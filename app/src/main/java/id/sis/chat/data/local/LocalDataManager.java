package id.sis.chat.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import id.sis.chat.SisChatApp;

/**
 * Created on : April 11, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public enum LocalDataManager {
    INSTANCE;

    private final SharedPreferences sharedPreferences;

    LocalDataManager() {
        sharedPreferences = SisChatApp.pluck()
                .getSharedPreferences("sis.data", Context.MODE_PRIVATE);
    }

    public static LocalDataManager getInstance() {
        return INSTANCE;
    }

    public String getSavedName() {
        if (!sharedPreferences.contains("name")) {
            throw new RuntimeException("name is not found!");
        }
        return sharedPreferences.getString("name", "anonymous");
    }

    public void saveName(String name) {
        sharedPreferences.edit().putString("name", name).apply();
    }
}
