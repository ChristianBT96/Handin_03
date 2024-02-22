package Question_01

// Write a class: Article
// An article has an author and a title
// Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method

fun main() {

    val article1: Article = Article("John Doe", "The Good Book")
    val article2: Article = Article("Jane Doe", "The Great Book")
    val article3: Article = Article("Jake Hammer", "The Better Book")
    val article4: Article = Article("Jamal Smith", "The Penultimate Book")
    val article5: Article = Article("Judy Johnson", "The Perfect Book")

    val listOfArticles: List<Article> = listOf(article1, article2, article3, article4, article5)

    listOfArticles.forEach {
        println(it)
    }

}

