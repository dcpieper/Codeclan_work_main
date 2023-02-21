import './App.css';
import React, {useState} from 'react';

function App() {

  const newPriority = (event) => {
    setNewTaskPriority(event.target.value)
  }

  const [tasks, setTasks] = useState([
    {name: 'Make dinner', priority: 'High'},
    {name: 'Wash car', priority: 'High'},
    {name: 'Vacuum', priority: 'Low'}
  ])

  const [newTask, setNewTask] = useState('');

  // const addTask = (index) => {
  //   const copyTasks = [...tasks]
  //   const updatedTask = {...copyTasks[index]}
  //   updatedTask.priority = 
  //   copyTasks[index] = updatedTask
  //   setTasks(copyTasks)
  // }

  const taskNodes = tasks.map((task, index)=>{
    return (
      <li key={index}><span>{task.name} </span>
      Priority: {task.priority}
      </li>
      )
  })
  const [newTaskPriority, setNewTaskPriority] = useState('');

  const handleTaskInput = (event) => {
    setNewTask(event.target.value)
    }

    const saveNewTask = (event) => {
      event.preventDefault();
      const copyTasks = [...tasks]
      copyTasks.push({name: newTask, priority: newTaskPriority})
      setTasks(copyTasks)
      setTasks(copyTasks)
      setNewTask('')
      
    }
  
  
  return (
    <div className="App">

      <h1>Todo List!</h1>
      <hr></hr>

      <ul class='todo_list'>
        {taskNodes}
      </ul>

      <form onSubmit={saveNewTask}>
        <label htmlFor='new-task'>Add a new task:</label>
        <input id='new-task' type='text' value={newTask} onChange={handleTaskInput}/>
        <input type='submit' value='Save New Task'/>
        <input type='radio' value='High' name='priority' onChange={newPriority} />High
        <input type='radio' value='Low' name='priority' onChange={newPriority}/>Low
      </form>

    </div>
  );
}

export default App;
