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
public class Message implements Parcelable {
    private String messageId;
    private String sender;
    private String content;
    private Date date;
    private int seenCount;

    public Message() {

    }

    protected Message(Parcel in) {
        messageId = in.readString();
        sender = in.readString();
        content = in.readString();
        date = new Date(in.readLong());
        seenCount = in.readInt();
    }

    public static final Creator<Message> CREATOR = new Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel in) {
            return new Message(in);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(int seenCount) {
        this.seenCount = seenCount;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(messageId);
        dest.writeString(sender);
        dest.writeString(content);
        dest.writeLong(date.getTime());
        dest.writeInt(seenCount);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Message) {
            Message message = (Message) o;
            return message.messageId.equals(messageId);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", seenCount=" + seenCount +
                '}';
    }
}
