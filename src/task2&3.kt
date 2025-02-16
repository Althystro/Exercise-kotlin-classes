fun main() {

    var newBook = Book2("Harry Potter", "Jk Rowing", 2000)

    newBook.printBook()

}



class Book2(var title:String,var author: String, var yearPublished:Int ){


    fun printBook(){
        println("Title: "+title+" Author: " +author )
    }

}