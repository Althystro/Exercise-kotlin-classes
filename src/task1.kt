fun main() {

    var book = Book()
    book.title ="Harry Potter"
    book.author="Jk Rowing"
    book.yearPublished=2000
    book.printBook()
}


class Book{
    var title: String=""
    var author: String=""
    var yearPublished: Int=0

    fun printBook(){
        println("Title: "+title+" Author: " +author )
    }

}