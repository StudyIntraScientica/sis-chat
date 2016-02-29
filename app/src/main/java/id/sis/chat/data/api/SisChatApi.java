package id.sis.chat.data.api;

import com.firebase.client.Firebase;

/**
 * Created on : February 29, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public enum SisChatApi {
    INSTANCE;

    private final Firebase api;

    SisChatApi() {
        api = new Firebase("https://sis-chat.firebaseio.com/");
    }

    public static SisChatApi getInstance() {
        return INSTANCE;
    }

    public Firebase rooms() {
        return api.child("rooms");
    }

    public Firebase messages(String roomId) {
        return api.child("messages").child(roomId);
    }
}
