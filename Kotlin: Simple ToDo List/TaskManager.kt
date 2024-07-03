// TaskManager.kt
class TaskManager {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun completeTask(index: Int) {
        if (index in tasks.indices) {
            tasks[index].isCompleted = true
        }
    }

    fun listTasks() {
        tasks.forEachIndexed { index, task ->
            println("${index + 1}. ${task.name} [${if (task.isCompleted) "Completed" else "Not Completed"}]")
        }
    }
}