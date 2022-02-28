fun main(args: Array<String>){

}

fun atividade1():Unit{
    println("Digite o primeiro número:")
    val a = readLine()!!.toFloat()
    println("Digite o segundo número:")
    val b = readLine()!!.toFloat()
    println("Digite o terceiro número")
    val c = readLine()!!.toFloat()

    if (a + b > c && a + c > b && b + c > a) {
        println("Os três lados formam um triangulo!");
        if (a == b && a == c)
            println("Equilátero");
        else if (a == b || a == c || b == c)
            println("Isósceles");
        else
            println("Escaleno");
    }
    else
        println("Os três lados não formam um triangulo!");
}

fun atividade2():Unit {
    println("Digite um ano")
    val ano = readLine()!!.toInt()

    if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0))
        print("$ano é ano bissexto")
    else
        print("$ano não é ano bissexto")
}

fun atividade3():Unit{
    println("Telefonou para a vítima? 1/Sim ou 0/Não")
    val resp1= readLine()!!.toInt()
    println("Esteve no local do crime? 1/Sim ou 0/Não")
    val resp2= readLine()!!.toInt()
    println("Mora perto da vítima? 1/Sim ou 0/Não")
    val resp3= readLine()!!.toInt()
    println("Devia para a vítima? 1/Sim ou 0/Não")
    val resp4= readLine()!!.toInt()
    println("Já trabalhou com a vítima? 1/Sim ou 0/Não")
    val resp5= readLine()!!.toInt()

    val somaDasRespostas = resp1 + resp2 + resp3 + resp4 + resp5
    if (somaDasRespostas == 5)
        println("Assassino")
    else if (somaDasRespostas >= 3)
        println("Cúmplice")
    else if (somaDasRespostas == 2)
        println("Suspeito")
    else
        println("Inocente")


}

fun atividade4():Unit {
    println("Digite quantos litros quer abastecer")
    println("Digite A para álcool e G para gasolina")
    val alcool = readLine()!!.toString()
    val gasolina = readLine()!!.toString()
    val litros = readLine()!!.toFloat()
    var precoA = readLine()!!.toFloat()
    var precoG = readLine()!!.toFloat()
    val preco = readLine()!!.toInt()
    if (alcool == "A") precoA = litros * 4.5f;
    if (litros <= 20) precoA -= 4.5f * litros * 3 / 100
    else (litros >= 20); litros * 5 / 100
    if (gasolina == "G") precoG = litros * 6.9f
    if (litros <= 20) precoG -= 6.9f * litros * 4 / 100
    else (litros >= 20); litros * 6 / 100
    println("O preco a pagar é R${preco}2.f}")
}





















