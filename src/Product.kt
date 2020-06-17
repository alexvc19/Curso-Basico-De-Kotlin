import jdk.jfr.Description

abstract  class Product(var name: String, var description: String, var sku: Int) {


    override fun toString(): String {
        return "\nName: $name \nDescription: $description \nSKU $sku"

    }

    /*open fun create(): String {
        return "Create"
    }

    open fun read(): String {
        return "Read"
    }

    open fun update(): String {
        return "Updeate"
    }

    open fun delete(): String {
        return "Delete"
    }*/
    abstract fun create(): String

    abstract fun read(): String

    abstract fun update(): String

    abstract fun delete(): String
}

