package com.example.rahul.chatapplication.model;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rahul.chatapplication.R;

import java.util.List;

/**
 * Created by rahul on 4/3/2017.
 * we have created custom adapter
 */

public class ChatMsgAdapter extends ArrayAdapter<ChatMsgItem> {
    public ChatMsgAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<ChatMsgItem> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            convertView=((Activity)getContext()).getLayoutInflater().inflate(R.layout.chat_msg_item,parent,false);
            TextView msgbd=(TextView)convertView.findViewById(R.id.msg_body);
            TextView msgSndr=(TextView)convertView.findViewById(R.id.sende_name);

            ChatMsgItem msgItem=getItem(position);
            msgbd.setText(msgItem.getMsgBody());
            msgSndr.setText(msgItem.getSenderName());


        return super.getView(position, convertView, parent);
    }
}
