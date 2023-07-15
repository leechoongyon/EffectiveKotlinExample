package org.example.dsl

class QueryBuilder {
    // columns 자체는 readOnly
    private val columns: MutableList<String> = mutableListOf()
    private var tableName: String = ""
    private var condition: String = ""

    fun select(vararg cols: String) {
        columns.addAll(cols)
    }

    fun from(table: String) {
        tableName = table
    }

    fun where(cond: String) {
        condition = cond
    }

    fun buildQuery(): String {
        val selectClause = "SELECT ${columns.joinToString(", ")}"
        val fromClause = "FROM $tableName"
        val whereClause =
            if (condition.isNotEmpty()) {
                "WHERE $condition"
            } else {
                ""
            }
        return "$selectClause $fromClause $whereClause"
    }
}

/**
 * @param QueryBuilder () 확장함수를 의미. init 이 확장함수를 의미
 */
fun initQuery(init: QueryBuilder.() -> Unit): String {
    val builder = QueryBuilder()
    // 입력파라미터로 select, from, where 을 받아서 세팅 수행
    builder.init()
    // 쿼리 생성
    return builder.buildQuery()
}

fun main() {
    val query = initQuery {
        select("id", "name")
        from("test")
        where("name = 'test'")
    }
    println(query)
}
