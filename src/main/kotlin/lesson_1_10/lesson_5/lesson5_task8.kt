package ru.fedorova.spring.lesson_1_10.lesson_5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main () {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()

    val quotes: Elements = doc.select(".sc-2aegk7-2")

    for (quote: Element in quotes) {
        println(quote.text() + "\n")
    }

}
