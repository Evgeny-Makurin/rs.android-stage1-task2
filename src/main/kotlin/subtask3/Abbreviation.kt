package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var m=0
        for (i in a){if (b[m]==i || b[m].toLowerCase()==i){
            m++
            if (m==b.length) return "YES"}}
        return  "NO"
    }
}
