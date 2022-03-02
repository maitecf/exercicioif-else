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
    println("Tipo de combustivel? :")
    var a = readLine()!!.toFloat()
    var g = readLine()!!.toFloat()
    var combustivel = readLine()!!.toFloat()
    println("Quantos litros ? :: ")
    var litro = readLine()!!.toFloat()
    var desconto1 = readLine()!!.toFloat()
    var desconto2 = readLine()!!.toFloat()
    var desconto3 = readLine()!!.toFloat()
    var desconto4 = readLine()!!.toFloat()
    var custo = readLine()!!.toFloat()
    var gasolina = readLine()!!.toFloat()

    if ((combustivel == a) && (litro <= 20) && (custo == 3.5F))
        desconto1 = (custo * 3) / 100

    println("Desconto do Combustivel")

    // 3.5 PREÇO DO ALCOOL

      if ((combustivel== a) && (litro >= 20 ) && (custo == 4.6F))
            desconto2 = (custo * 5) / 100

    println("Desconto de Combustivel")

    // 4.6 PREÇO Do ALCOOL

             if  ((combustivel == g ) && (litro<=20 ) && (custo==5.3F))
                  desconto3 = (custo * 4)/100

    else ((combustivel == g) && (litro>=20) && (custo==5.6F))
        desconto4 = (custo * 6) / 100
}





















