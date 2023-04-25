fun main() {
    print(fibonacci(3))
}
fun fibonacci(num : Int):Int{
    return if(num<2){
        num
    } else{
    fibonacci(num-1)+fibonacci(num-2)
    }
}
