// Main function: the beginning and end of the project execution.
fun main() {
    // list of tasks -> object from Task data class, each task has title and status
    val listOfTasks = mutableListOf(
        Task("Submit assignment", true),
        Task("Clean the house", false),
        Task("Solve problems", true)
    )
    // loop through each task and print their status using a conditional
    listOfTasks.forEach {
        if (it.isDone) println("✅ ${it.title}") // it: reference to each task
        else println("❌ ${it.title}")
    }
}

// Task data class, each task has a title and status with default value
data class Task(val title: String? = "Task", val isDone: Boolean = false)