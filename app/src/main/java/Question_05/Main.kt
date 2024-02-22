package Question_05


// Write a program that takes a list of words as input and prints the frequency of each word.

fun main() {
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
    wordFrequencyCounter(words)

}

fun wordFrequencyCounter(listOfStrings: List<String>)  {

    val wordFrequency = mutableMapOf<String, Int>()

    for (word in listOfStrings) {
        // if the word is already in the map, increment the frequency by 1
        // This is done using ".containsKey()" to check if the word is already in the map
        if (wordFrequency.containsKey(word)) {
            // "!!" is the non-null assertion operator
            // It converts any value to a non-null type and throws an exception if the value is null
            // It is used to tell the compiler that the programmer believes that the value will never be null
            // it is used here because we are sure that the word is in the map else the if statement would not have been true
            wordFrequency[word] = wordFrequency[word]!! + 1
        } else {
            wordFrequency[word] = 1
        }
    }

    for ((word, frequency) in wordFrequency) {
        println("$word: $frequency")
    }

}


