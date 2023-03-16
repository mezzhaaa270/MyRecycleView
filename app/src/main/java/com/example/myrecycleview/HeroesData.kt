package com.example.myrecycleview

object HeroesData {
    private val data = arrayOf(
        arrayOf(
            "Soto Betawi",
            "Soto Betawi Enak",
            "https://i0.wp.com/resepkoki.id/wp-content/uploads/2019/11/Soto-Betawi-2.jpg?fit=750%2C1000&ssl=1"
        ),
        arrayOf(
            "Sate Ayam",
            "Sate Ayam Enak",
            "https://harianresep.com/wp-content/uploads/2021/11/resep-sate-ayam.jpg"
        ),
        arrayOf(
            "Nasi Padang",
            "Nasi Padang asal Malang",
            "https://awsimages.detik.net.id/community/media/visual/2019/04/24/de2758a6-ea38-4ae9-8c4b-f2b395a81a22_43.png?w=700&q=90"
        ),
        arrayOf(
            "Ayam Pak Gembus",
            "Ayam Pak Gembus Juara",
            "https://media-cdn.tripadvisor.com/media/photo-s/0c/71/db/2d/getlstd-property-photo.jpg"
        ),
        arrayOf(
            "Bebek Slamet",
            "Menunya ayam semua soalnya bebeknya slamet",
            "https://assets-pergikuliner.com/uploads/image/picture/145709/picture-1452569765.jpg"
        ),
        arrayOf(
            "Bubur Ayam",
            "Di sini kalo jual bubur gaboleh keras keras kak",
            "https://awsimages.detik.net.id/community/media/visual/2022/11/12/resep-bubur-ayam-claypot_43.jpeg?w=700&q=90"
        ),
        arrayOf(
            "Martabak",
            "Mari Kita Tabrak",
            "https://img.kurio.network/6Lp7PVjAHhhl-c_NHuL9VOQLqAo=/1200x1200/filters:quality(80)/https://kurio-img.kurioapps.com/21/01/06/8e04fa20-47e7-4e21-89f0-93ffa3e1394b.jpe"
        ),
        arrayOf(
            "Terang Bulan",
            "bahasa inggrisnya moonlight",
            "https://cdn.idntimes.com/content-images/post/20191205/34683052-133175584143376-1449077340960194560-n-e7a4522a2d6e08467eb12b546864436a.jpg"
        ),
        arrayOf(
            "Rawon",
            "Rawon Aye Jos Gandos",
            "https://img.okezone.com/okz/500/library/images/2023/02/12/7uc5xp801gss9g3p8xxk_13273.jpg"
        ),
        arrayOf(
            "Sop Ayam",
            "Sop Ayam rasa sapi wajar nggak sih?",
            "https://i0.wp.com/rasabunda.com/wp-content/uploads/2021/10/Sayur-Sop-Ayam.jpg?fit=450%2C600&ssl=1"
        )
    )


    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (aData in data) {
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]


                list.add(hero)
            }


            return list
        }
}
