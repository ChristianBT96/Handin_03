package Question_04_5

import Question_04.RedditPost

// Write a class: RedditFrontPage
// The RedditFrontPage has:
// A List of all RedditPosts
// A method in RedditFrontPage deletes a RedditPost from the list, by its index number

fun main() {

    val redditPost1: RedditPost = RedditPost("John Doe", "Hello")
    val redditPost2: RedditPost = RedditPost("Jane Doe", "Goodbye")
    val redditPost3: RedditPost = RedditPost("John Doe", "I am back")

    val redditFrontPage: RedditFrontPage = RedditFrontPage(mutableListOf(redditPost1, redditPost2, redditPost3))
    println(redditFrontPage.redditPosts)
    redditFrontPage.addPost(RedditPost("John Doe", "Now I am really leaving"))
    println(redditFrontPage.redditPosts)
    redditFrontPage.deletePostUsingIndex(1)
    redditFrontPage.deletePostUsingIndex(2)
    println(redditFrontPage.redditPosts)

}

