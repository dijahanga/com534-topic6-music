//TASK1

//fun main() {
//    val album = Album(
//        listOf(
//            Song("Hello", "Adele", 4.55),
//            Song("God's Plan", "Drake", 3.19),
//            Song("Someone Like You", "Adele", 4.45)
//        )
//    )
//
//    // Artist with matching songs
//    println(album.filterByArtist("Adele"))
//
//    // Artist with no songs on the album, so this prints an empty list
//    println(album.filterByArtist("Taylor Swift"))
//}

//TASK3
fun main() {
    // Create several Song objects
    val song1 = Song("Hello", "Adele", 4.55)
    val song2 = Song("Rolling in the Deep", "Adele", 3.48)
    val song3 = Song("God's Plan", "Drake", 3.19)
    val song4 = Song("Hotline Bling", "Drake", 4.27)
    val song5 = Song("Someone Like You", "Adele", 4.45)

    // Create one Single and one Album
    val single = Single(song3, song4)
    val album = Album(listOf(song1, song2, song5))

    // Put both in a List<Music>. This works because both classes implement Music.
    val musicCollection: List<Music> = listOf(single, album)

    // Same method calls on each item, but each class handles them its own way (polymorphism)
    musicCollection.forEach { music ->
        println("Type: ${music::class.simpleName}")
        println("Total playing time: ${music.getPlayingTime()}")
        println("Songs:")
        music.getAllSongs().forEach { song ->
            println("  - ${song.title} by ${song.artist} (${song.playingTime})")
        }
        println()
    }
}