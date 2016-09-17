package id.sch.smktelkom_mlg.tugas01.xirpl4002.pendaftaranmeticsmktelkommalang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etUserID;
    EditText etEmail;
    EditText etHP;
    Button bDaftar;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserID = (EditText) findViewById(R.id.editTextUserID);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etHP = (EditText) findViewById(R.id.editTextHP);
        bDaftar = (Button) findViewById(R.id.buttonDaftar);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });
    }

    private void doProcess() {
        if (isValid()) {
            String userid = etUserID.getText().toString();
            String email = etEmail.getText().toString();
            int HP = Integer.parseInt(etHP.getText().toString());
            tvHasil.setText(userid + " EMAIL: " + email + " NO. HP: ");
        }
    }

    private boolean isValid() {
        boolean valid = true;
        String userid = etUserID.getText().toString();
        String email = etEmail.getText().toString();
        String HP = etHP.getText().toString();

        if (userid.isEmpty()) {
            etUserID.setError("USER ID belum diisi");
            valid = false;
        } else if (userid.length() < 4) {
            etUserID.setError("USER ID minimal 4 karakter");
            valid = false;
        } else {
            etUserID.setError(null);
        }

        if (email.isEmpty()) {
            etEmail.setError("EMAIL belum diisi");
            valid = false;
        } else if (email.length() < 8) {
            etEmail.setError("Email minimal 8 karakter");
            valid = false;
        } else {
            etEmail.setError(null);
        }

        if (HP.isEmpty()) {
            etHP.setError("NOMOR HP belum diisi");
            valid = false;
        } else if (HP.length() < 11) {
            etHP.setError("NOMOR HP minimal 11 karakter");
            valid = false;
        } else {
            etHP.setError(null);
        }

        return valid;
    }
}
