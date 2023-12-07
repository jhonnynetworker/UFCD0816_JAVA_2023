// script.js
const apiUrl = 'http://localhost:8080/tasks';

async function getAllTasks() {
    const response = await fetch(apiUrl);
    const tasks = await response.json();
    // Atualize o seu frontend com as tarefas recuperadas
}

async function addTodo() {
    const description = document.getElementById('new-todo').value;
    const response = await fetch(apiUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ description }),
    });
    const newTask = await response.json();
    // Adicione a nova tarefa ao seu frontend
}

// Implemente funções semelhantes para atualizar e excluir tarefas
