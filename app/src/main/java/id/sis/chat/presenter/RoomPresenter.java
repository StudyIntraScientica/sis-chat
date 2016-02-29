package id.sis.chat.presenter;

import android.os.Bundle;

import com.firebase.client.Firebase;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import id.sis.chat.data.api.SisChatApi;
import id.sis.chat.data.model.Room;
import id.zelory.benih.presenter.BenihPresenter;

/**
 * Created on : February 29, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class RoomPresenter extends BenihPresenter<RoomPresenter.View> {

    public RoomPresenter(View view) {
        super(view);
    }

    public void create(String roomName) {
        view.showLoading();
        Firebase api = SisChatApi.getInstance().rooms().push();

        Map<String, Object> data = new HashMap<>();
        data.put("roomId", api.getKey());
        data.put("name", roomName);
        data.put("lastMessage", "-");
        data.put("lastSender", "-");
        data.put("lastDate", new Date().getTime());

        api.updateChildren(data, (firebaseError, firebase) -> {
            if (firebaseError != null) {
                view.showError("Failed to create room!");
            } else {
                Room room = new Room();
                room.setRoomId(api.getKey());
                room.setName(roomName);
                room.setLastMessage("-");
                room.setLastSender("-");
                room.setLastDate(new Date());
                view.onRoomCreated(room);
            }
            view.dismissLoading();
        });
    }

    @Override
    public void saveState(Bundle bundle) {

    }

    @Override
    public void loadState(Bundle bundle) {

    }

    public interface View extends BenihPresenter.View {
        void onRoomCreated(Room room);

        void showRooms(List<Room> rooms);

        void onRoomUpdated(Room room);

        void onRoomDeleted(Room room);
    }
}
