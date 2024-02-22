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
    val redditPost1: RedditPost = RedditPost("John Doe", "Hello")
    val redditPost2: RedditPost = RedditPost("Jane Doe", "Goodbye")
    val redditPost3: RedditPost = RedditPost("John Doe", "I am back")
    println(redditPost1.voteBalance)
    redditPost1.upVote()
    println(redditPost1.voteBalance)
    redditPost3.downVote()
    redditPost3.downVote()
    redditPost3.downVote()
    redditPost1.upVote()
    redditPost1.upVote()

    val listOfRedditPosts: List<RedditPost> = listOf(redditPost1, redditPost2, redditPost3)
    println(listOfRedditPosts.sorted())

}