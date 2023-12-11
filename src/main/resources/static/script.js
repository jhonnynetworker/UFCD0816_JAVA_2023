// scripts.js
const taskList = document.getElementById('taskList');

function fetchTasks() {
  fetch('/api/') // Sua URL da API pode variar, dependendo de como está configurada
    .then(response => response.json())
    .then(tasks => {
      taskList.innerHTML = '';
      tasks.forEach(task => {
        const listItem = document.createElement('li');
        listItem.textContent = task.description;
        taskList.appendChild(listItem);
      });
    });
}

function createTask() {
  const taskDescription = document.getElementById('taskDescription').value;
  fetch('/api/', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ description: taskDescription, isCompleted: false }),
  })
  .then(fetchTasks) // Atualiza a lista de tarefas após a criação
  .then(() => {
    document.getElementById('taskDescription').value = ''; // Limpa o campo de entrada
  });
}

// Carrega as tarefas quando a página carrega
document.addEventListener('DOMContentLoaded', () => {
  fetchTasks();
});
