package id.sis.chat.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created on : February 29, 2016
 * Author     : zetbaitsu
 * Name       : Zetra
 * Email      : zetra@mail.ugm.ac.id
 * GitHub     : https://github.com/zetbaitsu
 * LinkedIn   : https://id.linkedin.com/in/zetbaitsu
 */
public class Room implements Parcelable {
    private String roomId;
    private String name;
    private String lastMessage;
    private String lastSender;
    private Date lastDate;

    public Room() {

    }

    protected Room(Parcel in) {
        roomId = in.readString();
        name = in.readString();
        lastMessage = in.readString();
        lastSender = in.readString();
        lastDate = new Date(in.readLong());
    }

    public static final Creator<Room> CREATOR = new Creator<Room>() {
        @Override
        public Room createFromParcel(Parcel in) {
            return new Room(in);
        }

        @Override
        public Room[] newArray(int size) {
            return new Room[size];
        }
    };

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastSender() {
        return lastSender;
    }

    public void setLastSender(String lastSender) {
        this.lastSender = lastSender;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Room) {
            Room room = (Room) o;
            return room.roomId.equals(roomId);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", name='" + name + '\'' +
                ", lastMessage='" + lastMessage + '\'' +
                ", lastSender='" + lastSender + '\'' +
                ", lastDate=" + lastDate +
                '}';
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(roomId);
        dest.writeString(name);
        dest.writeString(lastMessage);
        dest.writeString(lastSender);
        dest.writeLong(lastDate.getTime());
    }
}
