package iak.segelaskopi;

import android.app.ActionBar;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    Intent i;
    String textKetBawah,textKetAtas;
    String[] list = {"Pohon Kopi","Biji Kopi","Roast Kopi","Penggiling Kopi", "Air"};
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
        switch (position){
            case 0 :
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Pohon Kopi");
                textKetAtas = "Coffea merupakan marga sejumlah tumbuhan berbentuk pohon yang beberapa di antaranya menjadi bahan dasar pembuatan minuman kopi."+"<br/>"+
                              "Genus ini memiliki sekitar 100 spesies, namun dari 100 spesies itu hanya dua yang memiliki nilai perdagangan penting, yaitu C. canephora (menghasilkan kopi robusta) dan C. arabica (menghasilkan kopi arabika)."+"<br/"+
                              "Beberapa jenis lainnya juga dipakai sebagai bahan campuran untuk memengaruhi aroma, seperti C. excelsa dan C. liberica."+"<br/><br/>"+
                              "Ketika pohon kopi sudah dapat dipanen maka untuk menghasilkan biji kopi terdapat beberapa tahapan seperti"+"<br/>"+
                              "<b>"+"Pemanenan (picking)"+"</b><br/>"+
                              "Pada tahap ini, buah kopi dipanen, baik menggunakan tangan maupun dengan bantuan mesin. Ketika masanya tiba, pemanenan dapat dilakukan sekaligus maupun secara selektif. Hanya buah kopi yang telah matang yang dipetik satu per satu menggunakan tangan. Setiap 8-10 hari tanaman kopi diperiksa kembali untuk dipetik buahnya yang berada di tingkat kematangan puncak."+"<br/>"+
                              "<b>"+"Pengolahan (processing)"+"</b><br/>"+
                              "Setelah dipanen, kopi harus diproses sesegera mungkin untuk menghindari pembusukan. Secara umum, proses pengolahan ini terbagi menjadi proses kering (dry-process), basah (wet process), dan semi-kering (semi-dry process)."+"<br/>"+
                              "<b>"+"Pengeringan (drying)"+"</b><br/>"+
                              "Tahap pengeringan ini harus dilakukan dengan pas agar terjadi secara merata tanpa merusak biji kopi sehingga memengaruhi profil rasanya secara negatif. Idealnya kadar air biji kopi setelah pengeringan ada di kisaran 10-12%."+"<br/>"+
                              "<b>"+"Penggilingan (milling)"+"</b><br/>"+
                              "Yang dimaksud dengan penggilingan di sini bukanlah penggilingan biji menjadi bubuk kopi (grinding), melainkan pembersihan biji kopi lebih lanjut dari lapisan kulit dan sisa-sisa buahnya yang masih menempel untuk kemudian dilakukan penyortiran. Di tahap ini pulalah proses grading dilakukan untuk mengklasifikasikan biji kopi ke dalam berbagai kategori berdasarkan kualitasnya."+"<br/>";
                i.putExtra("ketAtas",textKetAtas);
                i.putExtra("judBawah", "Proses Pengolahan Biji Kopi");
                textKetBawah = "<b>" + "Proses Kering" + "</b>" +  "<br />" +
                        "<small>" + "Metode dry ini disebut juga proses natural atau unwashed. Secara sederhana, inti dari proses ini adalah pengeringan buah kopi secara utuh dengan biji di dalamnya—seperti mengeringkan anggur menjadi kismis—dengan menjemurnya di bawah sinar matahari. Proses ini memungkinkan terjadinya fermentasi secara alami yang membentuk profil rasa akhir kopi. Dalam metode ini, biji kopi mulai dipisahkan dari buah dan kulitnya yang sudah mengering pada tahap selanjutnya, yaitu penggilingan."+"<br /><i><b>"+"Karakteristik hasil proses : "+"</b>"+"smooth, body yang berat, tingkat acidity rendah, dengan rasa berry yang tajam." + "</i></small>" + "<br />" +
                        "<br /><b>" + "Proses Basah" + "</b>" +  "<br />" +
                        "<small>" + "Metode wet ini disebut juga proses washed. Proses ini melibatkan pencucian buah kopi sekaligus pemisahan biji dari buahnya dengan bantuan mesin. Sampai di sini, relatif masih banyak daging buah (pulp) yang melekat dan biji kopi masih dilapisi oleh lendir (mucilage). Pembersihan lebih lanjut dapat dilakukan dengan 2 cara :"+"<br /><br/><b>"+"Metode ferment-and-wash : "+"</b><br/>"+"Proses ini memanfaatkan fermentasi oleh mikroba yang memecah selulosa daging buah kopi serta memecah senyawa gula yang membentuk lendir yang melapisi biji kopi."+"<br/>"+"Setelah proses fermentasi selesai, biji kopi kemudian dicuci hingga bersih."+"<br/><b>"+"Metode machine-assisted wet processing :"+"</b><br />"+"Disebut juga aqua pulping atau mechanical demucilaging, proses ini menghilangkan sisa daging buah dan lapisan lendir yang menempel di biji kopi dengan penyikatan secaramekanis, tanpa bantuan fermentasi."+"<br/>"+"Setelah terpisah dari buahnya, dan yang tersisa hanya kulit ari (silver skin) dan kulit tanduk (parchment) yang melapisi biji kopi, pemrosesan dapat dilanjutkan ke tahap berikutnya, yakni pengeringan."+"<br/><i><b>"+"Karakteristik hasil proses : "+"</b>"+"Seimbang (balanced), bersih (clean), dan cemerlang (bright/vibrant), dengan esens fruity yang lembut." + "</i></small><br/>"+
                        "<br /><b>" + "Proses Semi Kering " + "</b>" +  "<br />" +
                        "<small>" + "Metode semi-dry ini dikenal juga dengan proses semi-washed, honey, atau pulped natural. Proses ini merupakan versi hybrid dari proses kering dan basah yang umum digunakan di Brazil dan Indonesia."+"<br/>"+ "Seperti pada tahap awal proses basah, biji kopi dipisahkan dari buahnya menggunakan alat, namun biji kopi yang masih diselimuti oleh lapisan lendir ini tidak dibersihkan lagi, melainkan langsung dijemur untuk dikeringkan sampai akhirnya lendirnya pun mengering. Corak merah-coklat akan memberi aksen seakan-akan biji kopi yang diproses dengan metode semi-kering dilapisi oleh karamel."+"<br/>" +" Proses giling basah di Indonesia yang disebut juga wet hulled dapat dikategorikan juga ke dalam metode semi-kering."+"<br/>"+"Pada teknik giling basah, biji kopi dipisahkan dari buahnya secara mekanis menggunakan alat tradisional yang diputar dengan tangan, kemudian biji kopi yang masih dilapisi lendir ini bisa disimpan sampai 1 hari lamanya dan mengalami fermentasi, lalu dicuci dengan tangan. Karena proses fermentasi yang singkat dan pencucian yang seringkali hanya 1 kali, biji kopi tidak sepenuhnya bersih dari lendir, menghasilkan kopi semi-washed."+"<br/>"+"Setelah dicuci, biji kopi kemudian dikeringkan. Namun, tidak seperti keadaan normal, pengeringan dilakukan hanya sampai kadar air turun menjadi 30-35%, lalu biji kopi digiling (untuk mengupas kulit tanduknya), baru kemudian dijemur untuk dikeringkan lebih lanjut sampai kadar airnya turun ke 10-12% seperti biasa. Proses spesifik inilah yang menghasilkan profil rasa khas kopi Sumatera."+"<br/><i><b>"+"Karakteristik hasil proses : "+"</b>"+"Sweetness yang intens, body yang tinggi, earthy, dengan acidity yang bulat."+"</i></small>";
                i.putExtra("ketBawah",textKetBawah);
                startActivity(i);
                break;
            case 1 :
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Biji Kopi");
                i.putExtra("ketAtas", "Biji Kopi berasal dari tanaman kopi");
                i.putExtra("judBawah", "Jenis Jenis Biji Kopi");
                i.putExtra("ketBawah", "Terdapat beberapa jenis biji kopi, tapi yang paling populer adalah\nArabica\nYaitu varietas yang rasanya asam\nRobusta\nVarietas yang cenderung pahit karena memiliki kadar kafein yang lebih banyak");
                startActivity(i);
                break;
            case 2 :
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Roast Kopi");
                i.putExtra("ketAtas", "(Roasting Coffee) Memanggang kopi mengubah sifat kimia dan fisik biji kopi hijau (Greenbean) menjadi produk kopi panggang. \n\nProses pemanggangan menghasilkan rasa khas kopi dengan mengubah rasa dari greenbean menjadi rasa yang berbeda.\n\nBiji kopi yang belum di panggang mengandung komposisi yang sama baik itu asam, protein, gula, dan kafein apabila di bandingkan dengan biji kopi yang sudah di panggang, tetapi tidak memiliki rasa yang sama dengan biji kopi yang sudah dipanggang. Karena Maillard dan reaksi kimia lainnya yang terjadi selama pemanggangan.");
                i.putExtra("judBawah", "Jenis Jenis Roast Kopi");
                i.putExtra("ketBawah", "Light roast\nMemiliki kadar asam dan kafein yang tinggi\n\nMedium roast\nKopi yang biasa ditemukan di kedai kopi atau coffee shop\n\nDark roast\n\n\nFrench Roast\nLebih gelap daripada Dark roast, memiliki warna hitam dan terlihat banyak sekali minyak yang keluar dari biji kopi\n\nEspresso Roast\nRoasting Tergelap, biasanya digunakan untuk membuat espresso");
                startActivity(i);
                break;
            case 3 :
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Penggiling Kopi");
                textKetAtas = "Proses penggilingan kopi sangat berpengaruh untuk menghasilkan kopi yang nikmat." +"<br/>"+
                        "Untuk menghasilkan kopi yang sudah gigiling(disebut juga "+"<i>"+"ground bean"+"</i>"+") kita membutuhkan alat yang disebut dengan grinder. Yang dibutuhkan oleh sebuah grinder adalah konsistendi akan gilingan yang dihasilkan, biasanya dihitung dalam "+"<b>"+"mikoron" +"</b>"+"."+"<br/>"+
                        "Alat penggiling kopi dibagi menjadi dua kategori, yaitu"+"<br/>"+
                        "<b>"+"Penggiling Manual/"+"<i>"+"Manual Grinder"+"</i></b><br/>"+
                        "Yaitu penggiling yang bergerak tidak menggunakan mesin, tetapi biasanya menggunakan gerakan tangan manusia untuk melakukan penggilingan. Penggiling Manual ini biasanya memerlukan waktu yang lama dalam proses penggilingannya."+
                        "";
//              //i.putExtra("ketAtas", "Proses penggilingan kopi sangat berpengaruh untuk menghasilkan kopi yang nikmat.\n");
                i.putExtra("ketAtas",textKetAtas);
                i.putExtra("judBawah", "Jenis jenis gilingan");
                i.putExtra("ketBawah", "Gilingan Kasar/Corse\nBiasa digunakan untuk alat kopi seperti French Press\n\nGilingan Sedang/Medium\nDigunakan untuk kopi drip atau manual brew seperti pour over(V60,Kono,dst) maupun Aeropress\n\nGilingan Halus/Fine\nDigunakan untuk espresso dan apabila lebih halus lagi maka bisa digunakan untuk kopi dengan metode turkish, Tetapi masyarakat indonesia biasa menggunakan gilingan ini untuk membuat kopi tubruk rumahan.");
                startActivity(i);
                break;
            case 4 :
                i = new Intent(this, DetailInfoActivity.class);
                i.putExtra("judAtas", "Air");
                i.putExtra("ketAtas", "Suhu, kualitas dan takaran air dapat mempengaruhi rasa yang akan dihasilkan ketika kopi diseduh");
                i.putExtra("judBawah", "Pemilihan Air");
                i.putExtra("ketBawah", "Proses pemilihan air biasanya dibagi menjadi dua yaitu\n\nKualitas\nMemilih air dengan kualitas yang buruk akan sangat mempengaruhi rasa kopi, air yang di filter terlebih dahulu akan menghasilkan rasa yang menyenangkan dibandingkan dengan air yang tidak difilter. Air mineral yang dijual dipasaran pun akan menghasilkan rasa yang berbeda beda dengan suhu air dan jenis/gilingan kopi yang sama\n\nSuhu Air\nPerhitungan suhu air dapat mempengaruhi kopi dengan profil roasting yang berbeda. Misalnya Light Roast yang kita seduh dengan air dengan suhu rendah malah tidak akan menghasilkan rasa kopi yang kuat, sebaliknya Roast dengan profil yang lebih Dark apabila di seduh dengan suhu yang tinggi malah akan memberikan rasa over extracted. Maka pemilihan suhu harus disesuaikan juga dengan profil roast");
                startActivity(i);
                break;
            default:break;
        }
    }
}
