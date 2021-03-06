package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val h = hour.toInt()
        var minut = minute.toInt()
        var resultString = ""
        if (h in 0..12 && minut in 0..60){
            when {
                minut==0 -> resultString += digitToText(h) + " o' clock"
                minut == 30 -> resultString += "half past " + digitToText(h)
                minut == 15 -> resultString += "quarter past " + digitToText(h)
                minut == 45 -> resultString += if (h!=12) "quarter to " + digitToText(h+1) else "quarter to one"
                minut<30 -> {
                    resultString += digitToText(minut) + " minute"
                    if (minut!=1) resultString+="s"
                    resultString += " past " + digitToText(h)}
                else -> {
                    minut=60-minut
                    resultString += digitToText(minut) + " minute"
                    if (minut!=1) resultString+="s"
                    resultString += if (h!=12) " to " +  digitToText(h+1) else " to one"
                }
            }
        }
        return resultString
    }

    private fun digitToText(digit: Int): String{
        return when (digit){
            0 -> "zero"
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            10 -> "ten"
            11 -> "eleven"
            12 -> "twelve"
            13 -> "thirteen"
            14 -> "fourteen"
            15 -> "fifteen"
            16 -> "sixteen"
            17 -> "seventeen"
            18 -> "eighteen"
            19 -> "nineteen"
            20 -> "twenty"
            21 -> "twenty one"
            22 -> "twenty two"
            23 -> "twenty three"
            24 -> "twenty four"
            25 -> "twenty five"
            26 -> "twenty six"
            27 -> "twenty seven"
            28 -> "twenty eight"
            29 -> "twenty nine"
            else -> ""
        }
    }
}
