package comw.example.rplrus26.gridpict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail_Grid extends AppCompatActivity {

    ImageView img_nama;
    TextView text_nama, text_deskrispsi;
    String nama_novel, deskripsi;
    int gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__grid);

        text_nama = findViewById(R.id.tusername);
        text_deskrispsi = findViewById(R.id.tdeskripsi);
        img_nama = findViewById(R.id.img_photo);
        setTitle("Detail");
        Intent i = getIntent();
        Bundle bundle = i.getExtras();
        nama_novel = bundle.getString("nama");
        deskripsi = bundle.getString("deskripsi");
        gambar = bundle.getInt("gambar");
        text_nama.setText(nama_novel);
        text_deskrispsi.setText(deskripsi);
        Glide.with(Detail_Grid.this)
                .load(gambar)
                .into(img_nama);
    }
}