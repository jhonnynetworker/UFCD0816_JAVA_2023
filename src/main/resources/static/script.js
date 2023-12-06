const apiUrl = 'http://localhost:8080/';

async function getAllTasks() {
    const response = await fetch(apiUrl);
    const tasks = await response.json();
}

function addTask() {
    const taskDescription = document.getElementById('taskDescription').value;

    fetch('http://localhost:8080/api/tasks', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ description: taskDescription }),
    })
    .then(response => response.json())
    .then(data => {
        console.log('Task added successfully:', data);
        // You can update the UI or perform other actions as needed
    })
    .catch(error => {
        console.error('Error adding task:', error);
    });
}
