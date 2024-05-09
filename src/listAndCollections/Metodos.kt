package listAndCollections

/**
 * Coleções - Grupo de valores variável
 * Uma coleção geralmente contém um número de objetos (também pode ser zero) do mesmo tipo.
 *
 * Os tipos de coleção abaixo serão tratados:
 * - List
 * - Set
 * - Map
 *
 * Coleções podem ser mutáveis ou imutáveis. Assim como as variáveis declaradas com var e val,
 * seguem o mesmo conceito.
 *
 * Mutáveis - Uma vez criada, podem ser alteradas para adicionar, remover ou atualizar valores.
 * Imutáveis - Uma vez criada, não é possível adicionar ou remover valores, somente obter.
 */
fun main() {
    val data = listaDeDados()

    // Tenho receitas na lista?
    println("Tenho uma lista? ${if (data.any()) "Sim" else "Não"}")

    // Tenho quantos elementos?
    println("Tenho ${data.count()} elementos")
    println(data.count { it.ingredientes.isEmpty() })

    // Primeiro elemento
    println("Primeiro elemento ${data.first().nome}")

    // Último elemento
    println("Último elemento ${data.last().nome}")

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())

    // Sum e SumOf
    println(listOf<Double>(1.6, 5.4).sum())
    println(data.sumOf { it.calorias })

    // Filter
    println(data.filter { it.calorias > 500 })

    // Take e TakeLast
    println("---------------------")

    data.take(2).map { println(it.nome) }
    println("---------------------")

    data.takeLast(2).filter { it.nome.startsWith("S") }.map { println(it.nome) }
    println("---------------------")

    // ForEach
    data.forEach { println(it.nome) }
    println("---------------------")
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // Max e min
    println(data.maxOf { it.calorias })
    println(data.minOf { it.calorias })
    println(listOf<Int>().maxOfOrNull { it })
    println("---------------------")

    // Map
    println(data.map { it.nome })
    println(data.map { ReceitaNumIngredientes(it.nome, it.ingredientes.count()) })

    // Average
    println(listOf<Int>(2, 4).average())
    println(data.map { it.calorias }.average())

    // Distinct Sorted Reversed
    val lst = listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 3, 3)

    println(lst.distinct())
    println(lst.sorted())
    println(lst.reversed())

}

// Retorna lista de dados
private fun listaDeDados(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 10),
                Ingrediente("Molho de tomate", 2),
                Ingrediente("Manjericão", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmigiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburger", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburger", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente(val nome: String, val quantidade: Int)
data class ReceitaNumIngredientes(val nome: String, val nIngrediente: Int)
