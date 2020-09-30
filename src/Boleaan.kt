fun main() {
    var nilaiAkhir =  80
    var nilaiKehadiran =  70
    var nilaiExtra =  50

    val passnilaiAkhir = nilaiAkhir > 75 //true
    val pasnilaiKehadiran = nilaiKehadiran > 75 //false
    val passnilaiExtra = nilaiExtra > 45 //false

    val pass = pasnilaiKehadiran || passnilaiExtra
    println(pass)

    val nilaiUjian = 80
    val nilaiAwal = 80
    val nilaiTengah = 55

    val apakahLulusUjian = nilaiAkhir >70
    val apakahLulusAbsen = nilaiKehadiran > 70
    val apakahLulusExtra = nilaiExtra > 60
    val apaLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apaLulus)
}