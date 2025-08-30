package cl.sangut.labs.behavioral.visitor

fun collectLinks(page: Page): List<String> {
    // No need for intermediate variable there
    return LinksCrawler().run {
        page.accept(this)
        this.links
    }
}

// Same as above but shorter
private fun Page.accept(feature: LinksCrawler) = feature.visit(this)
