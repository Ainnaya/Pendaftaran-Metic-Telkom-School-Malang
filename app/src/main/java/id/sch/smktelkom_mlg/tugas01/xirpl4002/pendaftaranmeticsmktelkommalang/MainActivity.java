package id.sch.smktelkom_mlg.tugas01.xirpl4002.pendaftaranmeticsmktelkommalang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etUserID;
    EditText etEmail;
    EditText etHP;
    RadioButton rbLK, rbPR;
    Spinner spJurusan;
    CheckBox cbPG, cbSG, cbSR;
    Button bDaftar;
    TextView tvHasil1, tvHasil2, tvHasil3, tvHasil4, tvHasil5, tvHasil6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserID = (EditText) findViewById(R.id.editTextUserID);
        etEmail = (EditText) findViewById(R.id.editTextEmail);
        etHP = (EditText) findViewById(R.id.editTextHP);
        rbLK = (RadioButton) findViewById(R.id.radioButtonLK);
        rbPR = (RadioButton) findViewById(R.id.radioButtonPR);
        spJurusan = (Spinner) findViewById(R.id.spinnerJurusan);
        cbPG = (CheckBox) findViewById(R.id.checkBoxPG);
        cbSG = (CheckBox) findViewById(R.id.checkBoxSG);
        cbSR = (CheckBox) findViewById(R.id.checkBoxSR);
        bDaftar = (Button) findViewById(R.id.buttonDaftar);
        tvHasil1 = (TextView) findViewById(R.id.textViewHasil1);
        tvHasil2 = (TextView) findViewById(R.id.textViewHasil2);
        tvHasil3 = (TextView) findViewById(R.id.textViewHasil3);
        tvHasil4 = (TextView) findViewById(R.id.textViewHasil4);
        tvHasil5 = (TextView) findViewById(R.id.textViewHasil5);
        tvHasil6 = (TextView) findViewById(R.id.textViewHasil6);
        findViewById(R.id.buttonDaftar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)

            {
                doClick();
            }
        });
    }

    private void doClick() {
        String userid = etUserID.getText().toString();
        tvHasil1.setText("USER ID: " + userid);

        String email = etEmail.getText().toString();
        tvHasil2.setText("EMAIL: " + email);

        int HP = Integer.parseInt(etHP.getText().toString());
        tvHasil3.setText("NOMOR HP: " + HP);

        String gender = null;
        if (rbLK.isChecked()) {
            gender = rbLK.getText().toString();
        } else if (rbPR.isChecked()) {
            gender = rbPR.getText().toString();
        }
        if (gender == null) {
            tvHasil4.setText("Anda belum memilih GENDER");
        } else {
            tvHasil4.setText("GENDER anda: " + gender);
        }

        tvHasil5.setText("JURUSAN yang dipilih: " + spJurusan.getSelectedItem().toString());

        String kelas = "KELAS dimulai:\n";
        int startlen = kelas.length();
        if (cbPG.isChecked()) kelas += cbPG.getText() + "\n";
        if (cbSG.isChecked()) kelas += cbSG.getText() + "\n";
        if (cbSR.isChecked()) kelas += cbSR.getText() + "\n";
        tvHasil6.setText(kelas);

        if (kelas.length() == startlen) kelas += "Anda belum memilih kelas" + "\n";



    }
}
