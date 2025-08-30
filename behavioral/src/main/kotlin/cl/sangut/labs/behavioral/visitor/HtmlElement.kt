package cl.sangut.labs.behavioral.visitor

sealed class HtmlElement

class Container(val elements: MutableList<HtmlElement> = mutableListOf()) : HtmlElement() {

    constructor(vararg units: HtmlElement) : this(mutableListOf()) {
        for (u in units) {
            this.elements.add(u)
        }
    }
}

data object Image : HtmlElement() {
    val src: String
        get() = "https://some.image"
}

data object Link : HtmlElement() {
    val href: String
        get() = "https://some.link"
}

data object Table : HtmlElement()
