package comw.example.rplrus26.gridpict;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Novel>NovelArrayList = new ArrayList<Novel>();
    GridView gv_nama;
    Novel data;
    String[][] Novel = new String[][]{
            {"  Cinta Dalam Diam", "Seindah cinta yang dimiliki oleh Ali Dan Fatimah. Mereka menyimpan cinta mereka dalam diam, hanya doalah yang menjadi jalan agar rasa itu tetap dapat terjaga kesuciannya. Dapatkan aku mencintaimu seperti Fatimah yang mencintai Ali dalam diam? Atau dapatkah aku seperti Ali yang dapat menjaga kesucian cintanya pada Fatimah? Saking sucinya cinta itu hingga setan pun tak tahu akan perasaan cinta yang Ali simpan untuk Fatimah. Jalan yang mempertemukan cinta dan semua perasaan dengan tanggung jawab. Dan disini, cinta tak pernah minta untuk dinanti. Seperti Ali, cinta mempersilahkan, atau mengambil kesempatan, yang pertama adalah pengorbanan dan yang kedua adalah keberanian. "},
            {"  Ada Cinta di SMA", " Novel  ADA CINTA DI SMA  mengisahkan tentang 2 teman yang menjalin ikatan persahabatan di SMA. Mereka berdua adalah Iqbal ( Iqbal Dhiafakhri Ramadhan ) dan Aldi ( Alvaro Maldini ). Dimana masa SMA tentunya dipenuhi dengan berbagai perasaan cinta, solidaritas, rasa ingin diakui dan juga persaingan antar siswa. Hal tersebut tidak dihindari oleh kedua sahabat tersebut. Diawali dengan Iqbal yang seringkali menjadi Biang onar. Hal tersebut dilakukan oleh Iqbal dengan cara mendaftar sebagai calon ketua OSIS di sekolahnya, agar dia buktikan bahwa dia juga bisa menjadi siswa yang dipandang baik dengan guru dan berprestasi. Sedangkan Aldi adalah siswa yang sangat suka dengan musik, bahkan jika ingin latihan musik, ia update Instagram terlebih dahulu. Sebagai murid yang berprestasi, Ayla ( Caitlin Halderman ) dan teman nya Tara ( Gege Elisa ) selalu menganggap Iqbal dan Aldi adalah biang onar di sekolah. Ayla dan Iqbal dahulu berteman sejak kecil, lama kelamaan Ayla muak dengan sifatnya Iqbal yang tengil. Masa pemilihan ketua OSIS, Tara akan menjadi Tim sukses nya Ayla, dan Aldi akan emnjadi Tim suksesnya Iqbal pun melakukan hal yang sama dengan cara yang berbeda. Mulai dari akun social media membuat para murid tertarik kepada Iqbal sampai cara yang sangat buruk dan sampai membuat Iqbal marah kepada Aldi , yaitu Aldi memberikan uang kepada murid yang mendukung Iqbal sampai mencuri Program Kerja Ayla dalam pemilihan kandidat OSIS. Karena itu membuat Ayla semakin jauh dengan Iqbal. Setelah kejadian itu Aldi sadar bahwa perbuatan itu sangat tidak baik. Tiba saatnya ternyata yang terpilih adalah Ayla Dara Sagita. Iqbal tetap merasa senang dan ayahnya Iqbal sangat bangga kepada putranya karena sudah melakukan yang terbaik. Tidak hanya keluarganya yang sudah tdiak memandang Iqbal sebelah mata, tetapi sahabat, teman bahkan Ayla pun sekarang sudah tidak meremehkannya. Sejak itu pula hubungan Ayla dan Iqbal menjadi baik lagi, bahkan mereka sekarang telah menjalin hubungan yang lebih serius lebih tepatnya \"Pacaran\" ."},
            {"  Dear Nathan", "Dimulai dari keterlambatan seorang gadis mengikuti upacara pertama di sekolah baru, yaitu Salma Alvira bertemu dengan seorang laki-laki yang membantunya menyelusup melalui gerbang samping. Selidik punya selidik, lelaki itu ternyata bernama Nathan, yakni akan nakal yang sering menjadi bahan gosip murid-murid satu sekolah. Seperti apa hidup kita ke depan, tidak ada pernah yang tahu seperti apa nantinya. Begitu juga dengan kehidupan salma yang berubah drastis ketika dia pindah ke sekolah barunya yaitu SMA Garuda. Teman-temannya tidak sealim seperti di sekolah lamanya. Beberapa dari mereka memiliki sifat sebagai tukang rusuh dan senang berantem, termasuk Nathan. Nathan, ia tidak mengira akhirnya bisa jatuh cinta kepada Salma, anak baru yang nampak ingin menangis pada saat terlambat datang ke sekolah. Kalau menurut Nathan, terlambat adalah hal biasa baginya, ternyata jauh berbeda apabila situasi itu dihadapi oleh wanita manis yang membuatnya berubah menjadi lelaki yang penuh perasaan. Nathan baru sadar, jatuh cinta kepada wanita lugu yang belum pernah pacaran jadi hal yang cukup menguras tenaganya. Awalnya, ia begitu menikmati pengejaran cintanya. Tak hanya cinta yang memberi warna dalam kehidupn Nathan. Tapi ada juga masalah yang besar yang memang sudah lama dihadapinya, yaitu masalah keluarga yang sangat berat, hingga Nathan merasa berat menanggungnya. Kehilangan orang yang sangat di sayanginya, merasa ditinggalkan oleh ayahnya, dan masih banyak lagi masalah-masalah yang ada dalam otak Nathan. Dan muncul masalah lain yaitu, perjalanan cinta nya dengan Salma yang tak berjalan mulus, yang mengakibatkan mereka harus putus.Nathan pun melarikan diri dari rumah dan bolos sekolah. Salma pun yang mulai mengkhawatirkan Nathan mulai mencari-cari Nathan dan membujuk Nathan untuk kembali ke rumah dan keluarga nya."},
    };

    int [] gambar = new int[]{
           R.drawable.cintadalamdiam, R.drawable.adacintadisma, R.drawable.dearnathan
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv_nama = findViewById(R.id.gv_nama);
        NovelArrayList = new ArrayList<Novel>();
        for (int i = 0; i<Novel.length; i++){
            data = new Novel();
            data.setNama(Novel[i][0]);
            data.setGambar(gambar[i]);
            data.setDeskripsi(Novel[i][1]);
            NovelArrayList.add(data);
        }
        Custom_Adapter custom_adapter = new Custom_Adapter(NovelArrayList,MainActivity.this);
        gv_nama.setAdapter(custom_adapter);
        gv_nama.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Detail_Grid.class);
                intent.putExtra("nama", data.getNama());
                intent.putExtra("gambar", data.getGambar());
                intent.putExtra("deskripsi", data.getDeskripsi());
                startActivity(intent);
            }
        });
    }
}
