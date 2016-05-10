package iak.segelaskopi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Intent i;
    String textKetBawah, textKetAtas, textKetDua;
    String[] list = {"Pohon Kopi", "Biji Kopi", "Roast Kopi", "Penggiling Kopi", "Air", "Segelas Kopi", "Rasio Kopi"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_item1);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Pohon Kopi");
                textKetAtas = "Coffea merupakan marga sejumlah tumbuhan berbentuk pohon yang beberapa di antaranya menjadi bahan dasar pembuatan minuman kopi." + "<br />" +
                        "Genus ini memiliki sekitar 100 spesies, namun dari 100 spesies itu hanya dua yang memiliki nilai perdagangan penting, yaitu C. canephora (menghasilkan kopi robusta) dan C. arabica (menghasilkan kopi arabika)." + "<br/>" +
                        "Beberapa jenis lainnya juga dipakai sebagai bahan campuran untuk memengaruhi aroma, seperti C. excelsa dan C. liberica.";
                i.putExtra("ketAtas", textKetAtas);

                i.putExtra("kotakDua", 0);//0 visible, 100 invisible, 200 gone
                textKetDua =  "<small>Ketika pohon kopi sudah dapat dipanen maka untuk menghasilkan biji kopi terdapat beberapa tahapan seperti" + "<br /></small>" +
                        "<b>" + "Pemanenan (picking)" + "</b><br />" +
                        "<small>"+"Pada tahap ini, buah kopi dipanen, baik menggunakan tangan maupun dengan bantuan mesin. Ketika masanya tiba, pemanenan dapat dilakukan sekaligus maupun secara selektif. Hanya buah kopi yang telah matang yang dipetik satu per satu menggunakan tangan. Setiap 8-10 hari tanaman kopi diperiksa kembali untuk dipetik buahnya yang berada di tingkat kematangan puncak." + "<br /></small>" +
                        "<b>" + "Pengolahan (processing)" + "</b><br />" +
                        "<small>"+"Setelah dipanen, kopi harus diproses sesegera mungkin untuk menghindari pembusukan. Secara umum, proses pengolahan ini terbagi menjadi proses kering (dry-process), basah (wet process), dan semi-kering (semi-dry process)." + "<br /></small>" +
                        "<b>" + "Pengeringan (drying)" + "</b><br />" +
                        "<small>"+"Tahap pengeringan ini harus dilakukan dengan pas agar terjadi secara merata tanpa merusak biji kopi sehingga memengaruhi profil rasanya secara negatif. Idealnya kadar air biji kopi setelah pengeringan ada di kisaran 10-12%." + "<br /></small>" +
                        "<b>" + "Penggilingan (milling)" + "</b><br />" +
                        "<small>"+"Yang dimaksud dengan penggilingan di sini bukanlah penggilingan biji menjadi bubuk kopi (grinding), melainkan pembersihan biji kopi lebih lanjut dari lapisan kulit dan sisa-sisa buahnya yang masih menempel untuk kemudian dilakukan penyortiran. Di tahap ini pulalah proses grading dilakukan untuk mengklasifikasikan biji kopi ke dalam berbagai kategori berdasarkan kualitasnya." + "</small>";
                i.putExtra("judDua", "Proses Panen");
                i.putExtra("ketDua", textKetDua);

                i.putExtra("judBawah", "Proses Pengolahan Biji Kopi");
                textKetBawah = "<b>" + "Proses Kering" + "</b>" + "<br />" +
                        "<small>" + "Metode dry ini disebut juga proses natural atau unwashed. Secara sederhana, inti dari proses ini adalah pengeringan buah kopi secara utuh dengan biji di dalamnya—seperti mengeringkan anggur menjadi kismis—dengan menjemurnya di bawah sinar matahari. Proses ini memungkinkan terjadinya fermentasi secara alami yang membentuk profil rasa akhir kopi. Dalam metode ini, biji kopi mulai dipisahkan dari buah dan kulitnya yang sudah mengering pada tahap selanjutnya, yaitu penggilingan." + "<br /><i><b>" + "Karakteristik hasil proses : " + "</b>" + "smooth, body yang berat, tingkat acidity rendah, dengan rasa berry yang tajam." + "</i></small>" + "<br />" +
                        "<br /><b>" + "Proses Basah" + "</b>" + "<br />" +
                        "<small>" + "Metode wet ini disebut juga proses washed. Proses ini melibatkan pencucian buah kopi sekaligus pemisahan biji dari buahnya dengan bantuan mesin. Sampai di sini, relatif masih banyak daging buah (pulp) yang melekat dan biji kopi masih dilapisi oleh lendir (mucilage). Pembersihan lebih lanjut dapat dilakukan dengan 2 cara :" + "<br /><br /><b>" + "Metode ferment-and-wash : " + "</b><br />" + "Proses ini memanfaatkan fermentasi oleh mikroba yang memecah selulosa daging buah kopi serta memecah senyawa gula yang membentuk lendir yang melapisi biji kopi." + "<br />" + "Setelah proses fermentasi selesai, biji kopi kemudian dicuci hingga bersih." + "<br /><b>" + "Metode machine-assisted wet processing :" + "</b><br />" + "Disebut juga aqua pulping atau mechanical demucilaging, proses ini menghilangkan sisa daging buah dan lapisan lendir yang menempel di biji kopi dengan penyikatan secaramekanis, tanpa bantuan fermentasi." + "<br />" + "Setelah terpisah dari buahnya, dan yang tersisa hanya kulit ari (silver skin) dan kulit tanduk (parchment) yang melapisi biji kopi, pemrosesan dapat dilanjutkan ke tahap berikutnya, yakni pengeringan." + "<br /><i><b>" + "Karakteristik hasil proses : " + "</b>" + "Seimbang (balanced), bersih (clean), dan cemerlang (bright/vibrant), dengan esens fruity yang lembut." + "</i></small><br />" +
                        "<br /><b>" + "Proses Semi Kering " + "</b>" + "<br />" +
                        "<small>" + "Metode semi-dry ini dikenal juga dengan proses semi-washed, honey, atau pulped natural. Proses ini merupakan versi hybrid dari proses kering dan basah yang umum digunakan di Brazil dan Indonesia." + "<br />" + "Seperti pada tahap awal proses basah, biji kopi dipisahkan dari buahnya menggunakan alat, namun biji kopi yang masih diselimuti oleh lapisan lendir ini tidak dibersihkan lagi, melainkan langsung dijemur untuk dikeringkan sampai akhirnya lendirnya pun mengering. Corak merah-coklat akan memberi aksen seakan-akan biji kopi yang diproses dengan metode semi-kering dilapisi oleh karamel." + "<br />" + " Proses giling basah di Indonesia yang disebut juga wet hulled dapat dikategorikan juga ke dalam metode semi-kering." + "<br />" + "Pada teknik giling basah, biji kopi dipisahkan dari buahnya secara mekanis menggunakan alat tradisional yang diputar dengan tangan, kemudian biji kopi yang masih dilapisi lendir ini bisa disimpan sampai 1 hari lamanya dan mengalami fermentasi, lalu dicuci dengan tangan. Karena proses fermentasi yang singkat dan pencucian yang seringkali hanya 1 kali, biji kopi tidak sepenuhnya bersih dari lendir, menghasilkan kopi semi-washed." + "<br />" + "Setelah dicuci, biji kopi kemudian dikeringkan. Namun, tidak seperti keadaan normal, pengeringan dilakukan hanya sampai kadar air turun menjadi 30-35%, lalu biji kopi digiling (untuk mengupas kulit tanduknya), baru kemudian dijemur untuk dikeringkan lebih lanjut sampai kadar airnya turun ke 10-12% seperti biasa. Proses spesifik inilah yang menghasilkan profil rasa khas kopi Sumatera." + "<br /><i><b>" + "Karakteristik hasil proses : " + "</b>" + "Sweetness yang intens, body yang tinggi, earthy, dengan acidity yang bulat." + "</i></small>";
                i.putExtra("ketBawah", textKetBawah);

                i.putExtra("kotakEmpat", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judEmpat", "");
                i.putExtra("ketEmpat", "");

                i.putExtra("gambar", R.drawable.pohonkopi);
                startActivity(i);
                break;
            case 1:
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Biji Kopi");
                i.putExtra("ketAtas", "Biji Kopi merupakan biji dari tanaman kopi yang didapat dari dalam buah kopi. Setiap satu buah Kopi terdapat dua buah biji kopi. <br/>Tetapi terkadang ada juga satu biji kopi untuk satu buah kopi, biji kopi seperti ini disebut juga dengan biji kopi Lanang.<br/>Biji kopi yang belum di roast (greenbean) dapat disimpan dalam jangka waktu yang lama, tetapi ketika sudah di roast maka biji kopi memiliki jangka waktu tertentu untuk dikonsumsi, jika tidak maka rasa dan aromanya akan berkurang.");

                i.putExtra("kotakDua", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judDua", "");
                i.putExtra("ketDua", "");

                i.putExtra("judBawah", "Jenis Jenis Biji Kopi");
                i.putExtra("ketBawah", "<b>Arabica</b><br/>" +
                        "<small>Kopi yang diberi nama Arab ini memang diambil dari kata Arab, berasal dari Ethiopia dan ditanam diseluruh dunia. Sehingga populitas Arabica kurang lebih 75% dari semua kopi di dunia.<br/>Kopi Arabica ini memiliki rasa yang berbeda dengan Robusta. Terdapat Acidity dan Sweetness yang lebih jika dibandingkan dengan Robusta.<br/><br/></small>" +
                        "<b>Robusta</b><br/>" +
                        "<small>Robusta memiliki kafein yang lebih banyak dan rasa yang lebih pahit jika dibandingkan dengan Arabica. Tetapi kita tidak dapat membandingkan robusta dengan arabica karena perbedaan grade dan juga harganya yang lebih murah. Tetapi Fine Robusta memiliki rasa yang unik dan sangat berbeda dari karakter Arabica.</small>");

                i.putExtra("kotakEmpat", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judEmpat", "");
                i.putExtra("ketEmpat", "");

                i.putExtra("gambar", R.drawable.greenbean);
                startActivity(i);
                break;
            case 2:
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Roast Kopi");
                i.putExtra("ketAtas", "Dengan memanggang kopi, sifat kimia dan fisik biji kopi hijau (Greenbean) akan berubah menjadi produk kopi panggang(Roasted Bean).<br/><br/>Proses pemanggangan akan menghasilkan rasa khas kopi yang sering kita temui.<br/>Biji kopi yang belum di panggang mengandung komposisi yang sama dengan biji kopi panggang, baik itu asam, protein, gula, dan kafein.Tetapi tidak memiliki rasa yang sama dengan biji kopi yang sudah dipanggang. Hal tersebut dikarenakan proses kimawi yang terjadi saat proses pemanggangan.");

                i.putExtra("kotakDua", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judDua", "");
                i.putExtra("ketDua", "");

                i.putExtra("judBawah", "Jenis Jenis Roast Kopi");
                i.putExtra("ketBawah", "<b>Light roast</b><br/>" +
                        "Memiliki kadar asam dan kafein yang tinggi<br/>" +
                        "<small><b>Cinnamon Roast</b> dan <b>New England Roast</b> merupakan jenis profil yang masuk ke kategori Light roast.<br/>" +
                        "Bedanya adalah connamon roast berhenti sesaat sebelum crack pertama, sedangkan New England Roast berhenti di crack pertama.</small><br/>" +
                        "<br/><b>Medium roast</b><br/>" +
                        "Kopi yang biasa ditemukan di kedai kopi atau coffee shop karena kemudahan untuk menyesuaikan dengan alat kopi yang beraneka ragam<br/>" +
                        "Beberapa jenis medium roast :<br/><small>" +
                        "<b>American Roast<br></b>" +
                        "Tingkat acidity-nya tidak terlalu tinggi dengan body medium. Warnanya coklat sedikit lebih gelap dari New England Roast, disangrai hingga akhir waktu krek pertama (first crack).<br/>" +
                        "City Roast<br>" +
                        "Berwarna coklat agak gelap, memiliki body lebih tebal serta rasa, aroma, dan acidity yang lebih seimbang dibanding tipe light roast.<br/>" +
                                "<b>Full City Roast</b><br/>" +
                                "Roast ini termasuk kedalam Medium - Dark, waktu dan warnanya berada di tengah antara medium roast dan dark roast<br/> warnanya coklat tua dengan permukaan yang sudah mulai berminyak, penyangraian berhenti ketika memasuki tahap awal krek kedua (second crack).<br/>" +
                                "<b>Vienna Roast</b><br/>" +
                                "Banyak perbincangan yang mengatakan vienna roast masuk ke dalam Medium - dark atau ke dark roast, Warnanya lebih gelap dari Full City Roast dan memiliki body yang tebal dengan acidity rendah. Proses penyangraian dilakukan hingga pertengahan krek kedua (second crack).<br/></small>"+
                        "<br/><b>Dark roast</b><br/>" +
                        "Kopi dengan panggangan yang gelap dan memiliki banyak sekali minyak.<br/>" +
                                "<small><b>French Roast</b><br/>" +
                                "Kopi dengan profil panggang ini memiliki kafein yang rendah, ketika diseduh akan meninggalkan rasa pahit.<br/>" +
                                "<b>Italian dan Spanish Roast</b><br/>" +
                                "Karakteristik permukaan yang gosong, berwarna hitam dan sangat berminyak merupakan ciri dari kedua profil diatas. Tingkat Acidity tidak ada lagi dan ketika diseguh akan menghasilkan rasa arang." +
                                "</small>");


                i.putExtra("kotakEmpat", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judEmpat", "");
                i.putExtra("ketEmpat", "");

                i.putExtra("gambar", R.drawable.roastedbean);
                startActivity(i);
                break;
            case 3:
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Penggiling Kopi");
                textKetAtas = "Proses penggilingan kopi sangat berpengaruh untuk menghasilkan kopi yang nikmat." + "<br/>" +
                        "Untuk menghasilkan kopi yang sudah gigiling(disebut juga " + "<i>" + "ground bean" + "</i>" + ") kita membutuhkan alat yang disebut dengan grinder. Yang dibutuhkan oleh sebuah grinder adalah konsistendi akan gilingan yang dihasilkan, biasanya dihitung dalam " + "<b>" + "mikoron" + "</b>" + "." + "<br/>" +
                        "Alat penggiling kopi dibagi menjadi dua kategori, yaitu" + "<br/>" +
                        "<b>" + "Penggiling Manual/" + "<i>" + "Manual Grinder" + "</i></b><br/>" +
                        "Yaitu penggiling yang bergerak tidak menggunakan mesin, tetapi biasanya menggunakan gerakan tangan manusia untuk melakukan penggilingan. Kerena menggunakan tenaga manusia, proses penggilingan akan memakan waktu yang lama.<br/><br/>" +
                        "<b>" + "Penggiling Elektrik/" + "<i>" + "Electronic Grinder" + "</i></b><br/>" +
                        "Sesuai namanya, pengilingan terjadi dengan menggunakan tenaga listrik. Proses yang cepat mejadi kelebihan utama dari gilingan jenis ini." +
                        "";
                i.putExtra("ketAtas", textKetAtas);

                i.putExtra("kotakDua", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judDua", "");
                i.putExtra("ketDua", "");

                i.putExtra("judBawah", "Jenis jenis gilingan");
                i.putExtra("ketBawah", "Perbedaan ukuran gilingan kopi akan sangat mempengaruhi rasa dari kopi yang akan diseduh, berinovasi dengan menggunakan teknik gilingan sendiripun tidak dilarang, tetapi dibawah ini adalah beberapa contoh dari gilingan yang disesuaikan dengan alat yang ada." +
                        "<small><b>Sangat Kasar/<i>Extra Coarse</i></b><br/>" +
                        "Gilingan terkasar ini digunakan untuk membuat cold brewing<br/><br/>" +
                        "<b>Kasar/<i>Coarse</i></b><br/>" +
                        "Biasanya digunakan untuk metode french press<br/><br/>" +
                        "<b>Kasar Sedang/<i>Medium Coarse</i></b><br/>" +
                        "Gilingan ini biasanya digunakan untuk menyeduh dengan alat Chemex<br/><br/>" +
                        "<b>Sedang/<i>Medium</i></b><br/>" +
                        "Biasa digunakan pada metode kopi tetes atau Drip Methode<br/><br/>" +
                        "<b>Halus Sedang/<i>Medium Fine</i></b><br/>" +
                        "Banyak metode yang menggunakan gilingan ini. Seperti Pour Over, Vacuum, Moka Pot dan Siphon<br/><br/>" +
                        "<b>Halus/<i>Fine</i></b><br/>" +
                        "Digunakan untuk membuat espresso. Di Indonesia biasanya digunakan untuk membuat kopi tubruk<br/><br/>" +
                        "<b>Sangat Halus/<i>Extra Fine</i></b><br/>" +
                        "Ukuran gilingan kopi yang paling halus. Gilingan ini hanya digunakan untuk penyeduhan menggunakan Ibrik yaitu teknik dari turki (turkis Method)." +
                        "</small>");


                i.putExtra("kotakEmpat", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judEmpat", "");
                i.putExtra("ketEmpat", "");

                i.putExtra("gambar", R.drawable.penggiling);
                startActivity(i);
                break;
            case 4:
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Air");
                i.putExtra("ketAtas", "Suhu, kualitas dan takaran air dapat mempengaruhi rasa yang akan dihasilkan ketika kopi diseduh");

                i.putExtra("kotakDua", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judDua", "");
                i.putExtra("ketDua", "");

                i.putExtra("judBawah", "Pemilihan Air");
                i.putExtra("ketBawah", "Proses pemilihan air biasanya dibagi menjadi dua yaitu<br/><br/>" +
                        "<small><b>Kualitas</b><br/>" +
                        "Memilih air dengan kualitas yang buruk akan sangat mempengaruhi rasa kopi, air yang di filter terlebih dahulu akan menghasilkan rasa yang menyenangkan dibandingkan dengan air yang tidak difilter. Air mineral yang dijual dipasaran pun akan menghasilkan rasa yang berbeda beda.<br/>" +
                        "<b>Suhu Air</b><br/>" +
                        "Perhitungan suhu air dapat mempengaruhi kopi dengan profil roasting yang berbeda. Misalnya Light Roast yang kita seduh dengan air dengan suhu rendah malah tidak akan menghasilkan rasa kopi yang kuat, sebaliknya Roast dengan profil yang lebih Dark apabila di seduh dengan suhu yang tinggi malah akan memberikan rasa over extracted. Maka pemilihan suhu harus disesuaikan juga dengan profil roast</small>");

                i.putExtra("kotakEmpat", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judEmpat", "");
                i.putExtra("ketEmpat", "");

                i.putExtra("gambar", R.drawable.kualitasair);
                startActivity(i);
                break;
            case 5:
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Segelas Kopi");
                textKetAtas = "Pembuatan segelas kopi disebut juga dengan <i>brewing/brew</i> dalam bahasa inggris.<br/>" +
                        "Merupakan proses ekstaksi kopi dari bubuk menjadi minuman kopi, untuk menghasilkan kopi yang nikmat banyak sekali alat yang bisa kita gunakan. Umumnya alat tersebut terbagi menjadi dua yaitu Manual dan Mesin";
                i.putExtra("ketAtas", textKetAtas);

                i.putExtra("kotakDua", 200);//0 visible, 100 invisible, 200 gone
                i.putExtra("judDua", "");
                i.putExtra("ketDua", "");

                i.putExtra("judBawah", "Menyeduh Segelas Kopi");
                i.putExtra("ketBawah", "<b>Manual Brewing</b><br/>" +
                        "Merupakan penyeduhan kopi yang dilakukan dengan menggunakan alat tanpa mesin.<br/>" +
                        "Metode manual ini memiliki banyak sekali variasi diantaranya :<br/>" +
                        "<small><b>&nbsp;&nbsp;&nbsp;Pour Over<br/>" +
                        "&nbsp;&nbsp;&nbsp;Drip<br/>" +
                        "&nbsp;&nbsp;&nbsp;Vakum</b></small><br/><br/>" +
                        "<b>Coffee Machine</b><br/>" +
                        "Banyak alat pembuat kopi yang beredaran di pasaran, tetapi umumnya coffee machine terbagi menjadi dua<br/>" +
                        "<small><b>Espresso Machine</b><br/>" +
                        "Merupakan alat penghasil espresso, alat ini menggunakan tekanan untuk mengekstrasi kopi dan kopi yang dihasilkan biasanya hanya 1 oz(30ml). Mesin espresso biasanya terdapat steamer yang digunakan untuk membuat foam susu ketika akan membuat variasi kopi susu serperti cappucinno ataupun coffee latte.<br/>" +
                        "<b>Coffee Maker</b><br/>" +
                        "Mesin kopi ini menghasilkan kopi dengan cara memanaskan air kemudian air tersebut disiram ke kopi yang disaring, kopi akan dihasikan setelah proses penyaringan.</small>");

                i.putExtra("kotakEmpat", 0);//0 visible, 100 invisible, 200 gone
                i.putExtra("judEmpat", "Cold Brew/Cold Drip");
                i.putExtra("ketEmpat", "Proses penyeduhan kopi, dilakukan umumnya dengan menggunakan Air panas yang gunanya adalah untuk mengekstraksi kandungan kimia pada kopi agar menjadi secangkir kopi yang siap untuk di nikmati.<br/>" +
                        "Tetapi ada juga cara lain yang dikenal dengan nama <i>Cold Brew</i> dan <i>Cold Drip</i><br/><br/>" +
                        "<small><b>Cold Brew</b> Merupakan metode menyeduh kopi dengan mengunakan air dingin/tidak didihkan. Proses ini dilakukan dengan cara memasukkan campur kopi kedalam air dingin, dan dibiarkan dalam jangka waktu 8 jam lebih, kemudian setelah 8 jam barulah dimasukkan ke dalam lemari pendingin. Hasil kopi yang dihasilkan sangat cocok untuk diminum dalam keadaan dingin.<br/>" +
                        "<b>Cold Drip</b> dilakukan dengan cara meneteskan air dingin ke kopi, proses ini dilakukan setetes demi setetes. Kopi diberi saringan dibagian bawah, sehingga tetesan air yang ada akan dihasilkan dibagian bawah dari cold drip. Karena hanya melewati kopi, hasil akhir yang didapat akan sangat berbeda dengan metode cold brew.</small>");

                i.putExtra("gambar", R.drawable.segelaskopi);
                startActivity(i);
                break;
            case 6:
                i = new Intent(this, ListRasioActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}
