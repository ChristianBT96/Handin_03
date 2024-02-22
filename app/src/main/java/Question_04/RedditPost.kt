package Question_04

import java.util.Date

class RedditPost(
    _author: String,
    voteBalance: Int,
    _title: String
) {

    private val author: String = _author

    var voteBalance: Int = voteBalance

    private val title: String = _title

    var timestamp: Date

    init {
        val currentDateTime: java.util.Date = java.util.Date()
        timestamp = currentDateTime
    }

}