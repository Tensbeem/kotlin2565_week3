fun IfElseExpression(){

    val number = -50
    val result = if (number>10){
        println("Positive number")
    }else{
        print("Nagative number")
    }
}

fun IfElseExpression2(){
    val remain = 1
    val result = if(remain>0) "มีสินค้า" else "สินค้าหมด"
    println(result)
}

fun IfElseExpression3(){
    val number = 60

    val result = if(number<0){
        "Nagative number"
    }else if (number in 0..9){
        "Simgle digit number"
    }else if (number in 10..99){
        "Double digit number"
    }else {
        "number has more digit"
    }
    println(result)
}