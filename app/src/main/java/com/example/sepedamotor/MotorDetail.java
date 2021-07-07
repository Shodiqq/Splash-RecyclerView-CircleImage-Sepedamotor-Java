package com.example.sepedamotor;

import java.util.ArrayList;

public class MotorDetail {

    private static String [] motorName = {
            "Vario 150",
            "Vario125",
            "Vario110",
            "Beat",
            "Scoopy",
            "Genio",
            "Supra 125",
            "Supra GTR 150",
            "CBR 150",
            "CBR 250",
            "CRF 150 L"
    };

    private static String [] motorHarga = {
            "Rp 23.000.000",
            "Rp 22.500.000",
            "Rp 20.000.000",
            "Rp 18.000.000",
            "Rp 19.350.000",
            "Rp 17.850.000",
            "Rp 16.945.000",
            "Rp 17.000.000",
            "Rp 33.550.000",
            "Rp 60.000.000",
            "Rp 35.000.000"
    };

    private static String [] motorDetail = {
        "Salah satu motor matic keluaran Honda lainnya yang tidak hanya laris di Indonesia namun juga laris di pasar ekspor adalah Honda VARIO 150 eSP. Dilengkapi dengan mesin 150cc yang bertenaga dan irit bahan bakar. Alhasil banyak masyarakat Indonesia yang memilih Honda VARIO 150 eSP, meski harga Honda Vario 150 tersebut melebihi 20 Juta Rupiah, namun ini sebanding dengan mesinnya yang berkualitas.",
                "Honda Vario 125 2020 telah hadir di pasaran dengan membawa desain yang lebih elegan dan kekinian. Selain itu beberapa fiturnya juga menggunakan teknologi canggih. Kemudian kekuatan mesin menggunakan generasi terbaru. Supaya lebih menawan, motor ini dilengkapi dengan lampu Full LED sehingga terkesan modern.",
                "Saat ini kebutuhan atau permintaan terhadap motor matik di Indonesia sangat pesat. Setiap tahunnya, para produsen berlomba-lomba mengeluarkan varian terbaru untuk menarik minat pasar. Namun hanya satu model yang memiliki keunggulan dan menjadi favorit banyak orang, yaitu Honda Vario 110 2020.",
                "Honda Beat eSP 2020 sekarang ini ada tiga tipe yang tersedia, yaitu :  Honda BeAT Sporty CW, Honda BeAT Sporty CBS dan Honda BeAT Sporty CBS ISS. Secara spesifikasi mesin, ketiga motor ini sama. Yang membedakan hanya di pilihan warna untuk masing-masing tipe.",
                "Honda Scoopy mengusung mesin 1 silinder berkapasitas 110cc, eSP, PGM-FI, SOHC 2 klep, berpendingin udara dan dilengkapi dengan transmisi matic. Motor ini dapat memuntahkan tenaga kuda sebesar 9,1 PS di putaran mesin 7.500 RPM dan torsi 9,4 Nm (0,96 kgf.m) di 6.000 RPM.",
                "Genio, generasi terbaru motor skutik Honda. Sebagai skuter matik generasi teranyar keluaran PT. Astra Honda Motor (AHM), tentu harus ada yang baru. Tiga konsep baru disematkan pada Honda Genio, yaitu desain casual dan fashionable, dimensi yang compact dan performa serta ragam fiturnya lengkap.",
                "Honda Supra X 125 merupakan motor yang pernah merajai jalanan saat itu, saat dimana Honda Supra X 125 menjadi motor bebek terlaris dan menjadi pilihan utama pecinta motor Honda. Seiring perjalanan waktu, Honda Supra X 125 harus menyerahkan mahkotanya pada All New Honda Beat.",
        "Honda All New Supra GTR 150 2020 akan menggunakan rangka berupa twin tube steel yang membuat desain motor bebek ini terlihat kekinian. Tentunya jenis ini memang identik dengan kesan konvensional sehingga kurang menarik.",
                "All New CBR150R menjadi sepeda motor sport full fairing dengan posisi berkendara terbaik di kelasnya. Ubahan terbaru mengarah pada gaya condong ke depan yang semakin agresif, menyuguhkan imajinasi pebalap yang siap melakukan start.",
                "Honda CBR250RR SP mengusung mesin terbaru 250cc yang lebih bertenaga dari generasi sebelumnya, dengan tenaga maksimal 30 kW (41 PS) @ 3.000 rpm dan torsi maksimum hingga 25 Nm (2,5 kgf.m) @11.000 rpm. Model ini dibekali dengan fitur Assist and Slipper Clutch yang berfungsi mencegah ban belakang selip karena engine brake saat penurunan gigi secara ekstrem, serta membuat pengendara dapat merasakan pengoperasian kopling yang semakin ringan.",
                "Hadirnya Honda CRF150L membawa tag line “Take You to Off Fun Ride” yang menunjukkan keberanian Honda dengan menghadirkan perfoma mesin 150 cc dan spesifikasi yang luar biasa dihadirkan untuk motor berkelas keluaran Honda ini",

    };
    private static int [] motorImage = {
            R.drawable.vario150,
            R.drawable.vario125,
            R.drawable.vario110,
            R.drawable.beat,
            R.drawable.scoopy,
            R.drawable.genio,
            R.drawable.supra125,
            R.drawable.supragtr,
            R.drawable.cbr150,
            R.drawable.cbr250,
            R.drawable.crf150
    };

    static ArrayList<Motor> getListData() {
        ArrayList<Motor> list = new ArrayList<>();
        for (int position = 0;position <motorName.length; position++){
            Motor motor = new Motor();
            motor.setName(motorName[position]);
            motor.setHarga(motorHarga[position]);
            motor.setDetail(motorDetail[position]);
            motor.setPhoto(motorImage[position]);
            list.add(motor);
        }
        return list;
    }
}
