package busket

data class ListItem(
    val product: Product, var quantity: Int
)

data class Product(
    val name: String, val price: Int, val weight: Int
)

