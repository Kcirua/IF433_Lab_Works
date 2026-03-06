package oop_00000109253_AurickTantyrone.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------")
    }

    //////////////////////////////////
    val math = MathHelper()

    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi: $luasPersegi")

    val luasPersegiPanjang = math.hitungLuas(5, 10)
    println("Luas Persegi Panjang: $luasPersegiPanjang")

    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran: $luasLingkaran")

    /////////////////////////////////////
    val myEWallet = EWallet(accountName = "Gopay User", balance = 500000.0)
    val myCreditCard = CreditCard(accountName = "BCA Card", limit = 1100000.0)

    val paymentList: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    val tagihan = 755000.0
    println("Tagihan saat ini: Rp $tagihan\n")

    for (metode in paymentList) {
        metode.processPayment(tagihan)
        if (metode is EWallet) {
            println("=> (Sistem mendeteksi ini adalah E-Wallet, memanggil fungsi khusus...)")
            metode.topUp(300000.0)
        }
    }

    /////////////////////////////////////////////
    println("Tagihan saat ini: Rp $tagihan\n")

    for (metode in paymentList) {
        metode.processPayment(tagihan)

        if (metode is EWallet) {
            println("Terdeteksi sebagai E-Wallet! Melakukan Top Up otomatis...")
            metode.topUp(50000.0)

            println("Mencoba memproses pembayaran ulang...")
            metode.processPayment(tagihan)
        }
    }
}