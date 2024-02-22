package Question_04

import java.util.Date

class RedditPost(
    _author: String,
    _title: String
): Comparable<RedditPost> {

    private val author: String = _author

    var voteBalance: Int = 1

    private val title: String = _title

    var timestamp: Date

    init {
        val currentDateTime: java.util.Date = java.util.Date()
        timestamp = currentDateTime
    }

    fun upVote() {
        voteBalance++
    }

    fun downVote() {
        voteBalance--
    }
    // Makes RedditPost sortable by voteBalance
    override fun compareTo(other: RedditPost): Int {
        return this.voteBalance - other.voteBalance
    }

    override fun toString(): String {
        return "$title (voteBalance=$voteBalance)"
    }

}