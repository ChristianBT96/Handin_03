package Question_01

class Article(author: String, title: String) {
    val author: String = author
    val title: String = title

    override fun toString(): String {
        return "Article(author='$author', title='$title')"
    }

}