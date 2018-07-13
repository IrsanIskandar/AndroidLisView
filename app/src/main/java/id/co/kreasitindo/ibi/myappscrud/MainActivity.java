package id.co.kreasitindo.ibi.myappscrud;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.ListView;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView dataMember;
    Button createNew;
    ArrayList<Member> getMembers = new ArrayList<Member>();
    Member newMember = new Member();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayAdapter<Member> memberMain = new ArrayAdapter<Member>(this, R.layout.activity_main, getMembers);


        dataMember = findViewById(R.id.listViewMemberList);
        createNew = findViewById(R.id.buttonCreateNew);

        createNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ListMember.class);
                newMember.getNamaLengkap();
                newMember.getJnsKelamin();
                newMember.getTmpLahir();
                newMember.getTglLahir();
                newMember.getAlamatLengkap();
                getMembers.add(newMember);

                dataMember.getAdapter();
                memberMain.notifyDataSetChanged();

                startActivity(intent);
            }
        });
    }
}
