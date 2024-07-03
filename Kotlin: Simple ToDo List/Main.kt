// Main.kt
fun main() {
    val manager = TaskManager()
    manager.addTask(Task("Buy groceries"))
    manager.addTask(Task("Finish project"))
    manager.addTask(Task("Read book"))

    println("All Tasks:")
    manager.listTasks()

    println("\nCompleting the first task...")
    manager.completeTask(0)

    println("\nAll Tasks:")
    manager.listTasks()
}