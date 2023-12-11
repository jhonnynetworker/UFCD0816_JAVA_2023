/* // script.js
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
} */

// Implemente funções semelhantes para atualizar e excluir tarefas

// Função para listar tarefas
function listarTarefas() {
    fetch('http://localhost:8080/tarefas')
        .then(response => response.json())
        .then(tarefas => {
            const listaTarefas = document.getElementById('lista-tarefas');
            listaTarefas.innerHTML = '';

            tarefas.forEach(tarefa => {
                const li = document.createElement('li');
                li.textContent = tarefa.descricao;
                listaTarefas.appendChild(li);
            });
        })
        .catch(error => console.error('Erro ao buscar tarefas:', error));
}

// Chamar a função ao carregar a página
listarTarefas();

