package com.example.rahul.chatapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionMenuView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.rahul.chatapplication.model.ChatMsgAdapter;
import com.example.rahul.chatapplication.model.ChatMsgItem;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] msg={"MSG1","MSG2"};
    ArrayList<String> msgs=new ArrayList<>();
    EditText edt;
    Button btn;
    ChildEventListener mChildEventListener;
  //  ArrayAdapter<String> adapter;
    ChatMsgAdapter myadapter;
    String userName="test";
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        btn=(Button)findViewById(R.id.btn);
        edt=(EditText)findViewById(R.id.edt);

        List<ChatMsgItem> msg_model=new ArrayList<>();
        myadapter=new ChatMsgAdapter(this,R.layout.chat_msg_item,msg_model);
        //adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,msgs);

        listView.setAdapter(myadapter);
        btn.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         if(edt.getText()!=null){

             FirebaseDatabase database = FirebaseDatabase.getInstance();
              myRef = database.getReference("message");
//here you can add data from ChatMsgItem
             myRef.push().setValue("Hello, World!");

            // msgs.add(edt.getText().toString());
            // myadapter.add(new ChatMsgItem(edt.getText().toString(),userName));
            // edt.setText(new String());
         }
     }
 });
mChildEventListener=new ChildEventListener() {
    @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
        //get Data from database and set it adapter
        ChatMsgItem msgItem=dataSnapshot.getValue(ChatMsgItem.class);
    }

    @Override
    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onChildRemoved(DataSnapshot dataSnapshot) {

    }

    @Override
    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
};

    }


}
