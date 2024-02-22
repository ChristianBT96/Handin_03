package Question_04_5

import Question_04.RedditPost

class RedditFrontPage(redditPosts: MutableList<RedditPost>) {

    val redditPosts: MutableList<RedditPost> = redditPosts

    fun addPost(redditPost: RedditPost) {
        redditPosts.add(redditPost)
    }

    fun deletePostUsingIndex(indexNumber: Int) {
        if (indexNumber in 0 until redditPosts.size) {
            redditPosts.removeAt(indexNumber)
        } else {
            println("Invalid index")
        }
    }
}
