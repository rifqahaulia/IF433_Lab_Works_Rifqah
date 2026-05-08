package oop_77820_RifqahAulia.week11


// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// Nullable receiver extension
fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}