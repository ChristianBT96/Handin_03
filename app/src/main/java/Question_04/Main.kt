package Question_04

// Write a class: RedditPost
// A Redditpost has :
//      A date of which is has been posted
//      An author
//      A balance of upvotes / downvotes
//      A Title
// When a new instance of RedditPost is instantiated:
//      The current date will be generated.
//      The balance of upvotes and downvotes starts at 1.
//      The title and author has to be provided by the constructor.
//      Ensure all attributes are private, but accesible by getters & setters.
// Implement functionality such that redditposts can be sorted by upvotes/downvotes


fun main() {
    val redditPost1: RedditPost = RedditPost("HE", 0, "Hello")

    println(redditPost1)

}