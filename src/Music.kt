/**
 * Music represents any piece of music in the system: an album or a single.
 * Any class that implements Music must provide these two methods,
 * so every music type can be used the same way.
 */
interface Music {

    // Returns the total playing time of this music item.
    fun getPlayingTime(): Double

    // Returns every song in this music item (one song for a single, many for an album).
    fun getAllSongs(): List<Song>
}