fun main() {
    val rim = readLine();
    if (rim != null) {
        println(romanToInt(rim))
    }
}
fun romanToInt(s: String): Int {
    var list = mutableListOf<Int>()
    for (i in s) {
        when (i) {
            'I' -> list.add(1)
            'V' -> list.add(5)
            'X' -> list.add(10)
            'L' -> list.add(50)
            'C' -> list.add(100)
            'D' -> list.add(500)
            'M' -> list.add(1000)
        }
    }
    var sum = 0
    var count = 1
    while (true) {
        if (count>=list.size)
            try {
                sum += list.get(count)
                break;
            } catch (e: Exception) {
                sum += list.get(count-1)
                break;
            }
        if (list.get(count) > list.get(count - 1)) {
            sum += list.get(count) - list.get(count - 1)
                if (count + 2 <= list.size) count += 2 else break
        } else {
            sum += list.get(count - 1)
            count++
        }
    }
    return sum
}

