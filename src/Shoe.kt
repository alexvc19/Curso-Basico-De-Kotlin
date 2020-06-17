
class Shoe( name: String,  description: String,  sku: Int, var brand:String ):
           Product(name,description,sku), ICrudActions{

    override fun create():String{
        saludar("Hola desde Shoe")
        return "Create shoe"
    }
    override fun read():String{
        return "Read shoe"
    }

    override fun update(): String {
        return "Update show"
    }

    override fun delete(): String {
        return "Delete shoe"
    }

    override fun toString(): String {
        return super.toString()+"\nSKU ID: $sku \nMarca: $brand \nModelo: $model \nSize: $size \nColor: $color"
    }
    init {
        println("SKU ID: $sku")
        println("Marca $brand")
    }
    var size: Int = 34
    set(value){
        if (value>= 34)
            field= value
        else
            field = 34
    }
    var color: String = "White"
    var model: String = "Boots"

    set(value){
        if(value.equals("Tenis"))
            field = "Boots"
            else field= value
        }
    }



