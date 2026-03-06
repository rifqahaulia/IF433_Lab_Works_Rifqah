package oop_77820_RifqahAulia.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}