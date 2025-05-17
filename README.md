# Pahlantara - Mengenal Pahlawan Nusantara - UTS Pemrograman Mobile ITBS-Abdul Hilman Thiusana

Pahlantara adalah aplikasi mobile sederhana berbasis Android yang bertujuan untuk memperkenalkan para pahlawan nasional Indonesia kepada pengguna. Aplikasi ini menyajikan informasi singkat dan detail mengenai beberapa tokoh penting dalam sejarah perjuangan kemerdekaan Indonesia.

## Struktur Proyek

Berikut adalah gambaran singkat struktur proyek Android Studio untuk aplikasi Pahlantara:

<img width="707" alt="Screenshot 2025-05-14 at 14 19 13" src="https://github.com/user-attachments/assets/05e7dac2-50e6-4cae-a1bd-eb57d7c19f06" />

## Penjelasan Kode

### 1. Penamaan Aplikasi

* **Nama Aplikasi:** Nama aplikasi "Pahlantara" didefinisikan dalam file `strings.xml` di dalam tag `<string name="app_name">Pahlantara</string>`. Nama ini akan ditampilkan di bawah ikon aplikasi di perangkat pengguna dan di Google Play Store.
* **Package Name:** Package name aplikasi (misalnya, `com.example.pahlantara`) didefinisikan dalam file `AndroidManifest.xml` pada atribut `package` di tag `<manifest>`. Package name harus unik dan digunakan sebagai identifikasi aplikasi.

### 2. Logo / Launcher

* **Ikon Aplikasi:** Ikon aplikasi (launcher icon) berada di dalam folder `mipmap-*`. Android menggunakan berbagai ukuran ikon ini untuk menyesuaikan dengan resolusi layar perangkat yang berbeda.
* **Definisi Ikon:** Ikon utama aplikasi didefinisikan dalam file `AndroidManifest.xml` pada atribut `android:icon` di tag `<application>`. Contoh: `android:icon="@mipmap/ic_launcher"`. `ic_launcher` adalah nama resource (tanpa ekstensi) dari salah satu file di folder `mipmap-*`.

### 3. Komponen Teks (`TextView`)

* Komponen `TextView` digunakan untuk menampilkan teks statis atau dinamis kepada pengguna.
* **Contoh Penggunaan:**
    ```xml
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/judul_login"
        android:textSize="20sp"
        android:textStyle="bold" />
    ```
* **Atribut Penting:**
    * `android:layout_width` dan `android:layout_height`: Mengatur dimensi komponen.
    * `android:text`: Mengatur teks yang ditampilkan. Nilai dapat berupa string langsung atau referensi ke string dari `strings.xml` (`@string/nama_string`).
    * `android:textSize`: Mengatur ukuran teks (biasanya dalam `sp` - scale-independent pixels).
    * `android:textStyle`: Mengatur gaya teks (misalnya, `bold`, `italic`).
    * `android:textColor`: Mengatur warna teks (dapat berupa nilai warna langsung atau referensi ke warna dari `colors.xml` - `@color/nama_warna`).
    * `android:layout_gravity`: Mengatur posisi komponen di dalam parent layout.

### 4. Komponen Tombol (`Button`)

* Komponen `Button` digunakan untuk menerima interaksi pengguna berupa klik.
* **Contoh Penggunaan:**
    ```xml
    <Button
        android:id="@+id/btn_masuk"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/tombol_masuk"
        android:backgroundTint="@color/blue"
        android:textColor="@color/white" />
    ```
* **Atribut Penting:**
    * `android:id`: Identifier unik untuk komponen, digunakan untuk berinteraksi dengan tombol dari kode Java.
    * `android:layout_width` dan `android:layout_height`: Mengatur dimensi tombol.
    * `android:text`: Mengatur teks pada tombol (dapat berupa string langsung atau referensi dari `strings.xml`).
    * `android:backgroundTint`: Mengatur warna latar belakang tombol (referensi dari `colors.xml`).
    * `android:textColor`: Mengatur warna teks pada tombol (referensi dari `colors.xml`).
    * `android:onClick`: (Alternatif untuk `OnClickListener` di Java) Menentukan nama method di Activity terkait yang akan dipanggil saat tombol diklik.

### 5. Komponen Gambar (`ImageView`)

* Komponen `ImageView` digunakan untuk menampilkan gambar.
* **Contoh Penggunaan:**
    ```xml
    <ImageView
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:src="@drawable/logo_tsmp"
        android:contentDescription="@string/logo_aplikasi" />
    ```
* **Atribut Penting:**
    * `android:layout_width` dan `android:layout_height`: Mengatur dimensi gambar.
    * `android:src`: Mengatur sumber gambar (referensi ke file drawable - `@drawable/nama_gambar`).
    * `android:contentDescription`: Memberikan deskripsi tekstual untuk gambar, penting untuk aksesibilitas (dibacakan oleh screen reader). Sebaiknya selalu menggunakan referensi dari `strings.xml`.
    * `android:scaleType`: Mengontrol bagaimana gambar diubah ukurannya agar sesuai dengan batas `ImageView`.

### 6. Layouts

* Layouts menentukan struktur visual antarmuka pengguna. Beberapa layout yang umum digunakan:
    * `LinearLayout`: Menyusun elemen secara horizontal atau vertikal.
    * `RelativeLayout`: Menyusun elemen berdasarkan posisi relatif terhadap elemen lain atau parent layout.
    * `ConstraintLayout`: Layout fleksibel yang memungkinkan penyusunan elemen dengan constraint (batasan) ke elemen lain atau parent.
    * `ScrollView`: Membuat area yang dapat digulir jika kontennya melebihi ukuran layar.
* Contoh penggunaan `LinearLayout`:
    ```xml
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center">
        </LinearLayout>
    ```

### 7. Styling (`styles.xml`)

* File `styles.xml` digunakan untuk mendefinisikan tema dan gaya visual yang dapat diterapkan ke seluruh aplikasi atau komponen individual.
* **Contoh Definisi Style:**
    ```xml
    <style name="JudulLayar">
        <item name="android:textSize">24sp</item>
        <item name="android:textStyle">bold</item>
        <item name="android:textColor">@color/black</item>
        <item name="android:layout_gravity">center_horizontal</item>
        <item name="android:layout_marginTop">16dp</item>
        <item name="android:layout_marginBottom">16dp</item>
    </style>
    ```
* **Penerapan Style pada Komponen:**
    ```xml
    <TextView
        style="@style/JudulLayar"
        android:text="@string/judul_daftar_pahlawan" />
    ```

### 8. Sumber Daya String (`strings.xml`)

* File `strings.xml` terletak di `res/values/` dan digunakan untuk menyimpan semua teks aplikasi. Ini memudahkan pengelolaan teks dan mendukung lokalisasi (penerjemahan aplikasi ke bahasa lain).
* **Contoh Definisi String:**
    ```xml
    <string name="judul_login">Login Aplikasi Mengenal Pahlawan</string>
    <string name="tombol_masuk">Masuk untuk lebih mengenal</string>
    <string name="logo_aplikasi">Logo Aplikasi</string>
    <string name="kembali">Kembali</string>
    <string name="pahlawan">Pahlawan</string>
    ```
* **Penggunaan di Layout:** `@string/nama_string`
* **Penggunaan di Kode Java:** `getString(R.string.nama_string)`

### 9. Sumber Daya Dimensi (`dimens.xml`)

* File `dimens.xml` terletak di `res/values/` dan digunakan untuk mendefinisikan nilai dimensi (ukuran, margin, padding) yang konsisten di seluruh aplikasi. Ini memudahkan perubahan ukuran secara global.
* **Contoh Definisi Dimensi:**
    ```xml
    <dimen name="margin_small">8dp</dimen>
    <dimen name="margin_medium">16dp</dimen>
    <dimen name="text_size_small">12sp</dimen>
    <dimen name="text_size_medium">16sp</dimen>
    ```
* **Penggunaan di Layout:** `@dimen/nama_dimensi`
* **Penggunaan di Kode Java:** `getResources().getDimensionPixelSize(R.dimen.nama_dimensi)` (untuk mendapatkan nilai dalam piksel)

### 10. Intent

* `Intent` adalah mekanisme untuk melakukan tindakan. Intent sering digunakan untuk memulai Activity baru (berpindah antar layar).
* **Contoh Penggunaan untuk Berpindah Activity (dari `MainActivity` ke `DaftarPahlawanActivity`):**
    ```java
    Intent intent = new Intent(MainActivity.this, DaftarPahlawanActivity.class);
    startActivity(intent);
    ```
* **Penjelasan Kode:**
    * `new Intent(MainActivity.this, DaftarPahlawanActivity.class)`: Membuat Intent yang akan memulai Activity `DaftarPahlawanActivity` dari `MainActivity`.
    * `startActivity(intent)`: Memulai Activity yang ditentukan oleh Intent.
* **Pengiriman Data Antar Activity:** Intent juga dapat membawa data antar Activity menggunakan `putExtra()`:
    ```java
    Intent intent = new Intent(DaftarPahlawanActivity.this, DetailPahlawanActivity.class);
    intent.putExtra("nama", namaPahlawan);
    intent.putExtra("detail", detailPahlawan);
    intent.putExtra("foto", resourceFoto);
    startActivity(intent);
    ```
* **Penerimaan Data di Activity Tujuan (`DetailPahlawanActivity`):**
    ```java
    Bundle extras = getIntent().getExtras();
    if (extras != null) {
        String nama = extras.getString("nama");
        String detail = extras.getString("detail");
        int foto = extras.getInt("foto");
        // Gunakan data yang diterima
    }
    ```

## Foto Aplikasi

<img width="487" alt="Screenshot 2025-05-17 at 11 04 47" src="https://github.com/user-attachments/assets/96d00322-ec62-4e94-af88-6244368aaf3f" />

<img width="487" alt="Screenshot 2025-05-17 at 11 05 39" src="https://github.com/user-attachments/assets/b71cd181-ca9f-4c99-9a6a-32e0dd1ad9f8" />

<img width="487" alt="Screenshot 2025-05-17 at 11 05 26" src="https://github.com/user-attachments/assets/0801b283-f181-4412-9849-8fe454d828f8" />

<img width="487" alt="Screenshot 2025-05-17 at 11 05 13" src="https://github.com/user-attachments/assets/ef87821f-dd51-403f-80e6-004610838a26" />

<img width="487" alt="Screenshot 2025-05-17 at 11 05 01" src="https://github.com/user-attachments/assets/26e708e0-4648-4f12-b0e8-c09805efb2ec" />

<img width="487" alt="Screenshot 2025-05-17 at 11 04 54" src="https://github.com/user-attachments/assets/de55f844-fdde-4186-8a5b-1364da8bf48d" />

<img width="487" alt="Screenshot 2025-05-17 at 11 04 47" src="https://github.com/user-attachments/assets/fd905143-a2c1-4a74-9ec9-093c71656af8" />


