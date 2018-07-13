package id.co.kreasitindo.ibi.myappscrud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListMember extends AppCompatActivity {

    EditText txtNamaLeng;
    EditText txtJnsKel;
    EditText txtTmpLahir;
    EditText txtTglLahir;
    EditText txtAlamat;
    Button btnSave;
    ListView dataMembers;
    ArrayList<Member> getMember = new ArrayList<Member>();
    Member newMembers = new Member();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_member);
        final ArrayAdapter<Member> memberAdapter = new ArrayAdapter<Member>(ListMember.this, R.layout.activity_list_member, getMember);

        txtNamaLeng = findViewById(R.id.edtTextNama);
        txtJnsKel = findViewById(R.id.edtTextJenisKel);
        txtTmpLahir = findViewById(R.id.edtTextTempatLhr);
        txtTglLahir = findViewById(R.id.edtTextTglLahir);
        txtAlamat = findViewById(R.id.edtTextAlamat);
        btnSave = findViewById(R.id.buttonSave);
        dataMembers = findViewById(R.id.listViewMemberList);
        
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListMember.this, MainActivity.class);


                newMembers.setNamaLengkap(txtNamaLeng.getText().toString());
                newMembers.setJnsKelamin(txtJnsKel.getText().toString());
                newMembers.setTmpLahir(txtTmpLahir.getText().toString());
                newMembers.setTglLahir(txtTglLahir.getText().toString());
                newMembers.setAlamatLengkap(txtAlamat.getText().toString());
                getMember.add(newMembers);

                dataMembers.setAdapter(memberAdapter);
                memberAdapter.notifyDataSetChanged();



                startActivity(intent);
            }
        });
    }
}
