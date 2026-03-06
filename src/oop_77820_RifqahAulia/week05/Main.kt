package oop_77820_RifqahAulia.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("-------------------------")
    }

    val mathHelper = MathHelper()

    println("=== UJI METHOD OVERLOADING ===")
    println("Luas persegi (sisi = 4) = ${mathHelper.hitungLuas(4)}")
    println("Luas persegi panjang (panjang = 6, lebar = 3) = ${mathHelper.hitungLuas(6, 3)}")
    println("Luas lingkaran (jari-jari = 7.0) = ${mathHelper.hitungLuas(7.0)}")

    println("=== SISTEM PEMBAYARAN ===")
    val eWallet = EWallet(accountName = "Rifqah", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Rifqah", limit = 100000.0)

    val metodePembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (metode in metodePembayaran) {
        println("-------------------------")
        println("Metode pembayaran: ${metode::class.simpleName}")
        metode.processPayment(75000.0)

        when (metode) {
            is EWallet -> {
                println("EWallet terdeteksi, melakukan top up otomatis...")
                metode.topUp(50000.0)
                println("Mencoba pembayaran ulang...")
                metode.processPayment(75000.0)
            }

            is CreditCard -> {
                println("CreditCard tidak perlu top up.")
            }
        }
    }
}