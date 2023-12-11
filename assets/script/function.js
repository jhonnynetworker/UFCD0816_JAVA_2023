function addTask() {
    var taskInput = document.getElementById("taskInput");
    var taskList = document.getElementById("taskList");

    if (taskInput.value.trim() !== "") {
        var newTask = document.createElement("li");
        newTask.innerHTML = taskInput.value + '<button onclick="removeTask(this)">Remover</button>';
        taskList.appendChild(newTask);
        taskInput.value = "";
    }
}

function removeTask(button) {
    var taskToRemove = button.parentNode;
    taskToRemove.parentNode.removeChild(taskToRemove);
}