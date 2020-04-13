package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val array: Array<Int> = arrayOf(1, 2, 0)
        while (array[0]*array[1]<n){
            array[1]=array[1]+array[0]
            array[0]=array[1]-array[0]
        }
        if (array[0]*array[1]==n) array[2]=1
        return array.toIntArray()
    }
}
