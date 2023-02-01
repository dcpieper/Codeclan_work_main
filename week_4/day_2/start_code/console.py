import pdb 
from models.task import Task
import repositories.task_repository as task_repository  

task_1 = Task("Learn Python", "Randolph", 60)
task_2 = Task("Fix Car', 'Jack' ,'20", "False'); DELETE FROM tasks; --", 120)

task_repository.save(task_1)
task_repository.save(task_2)

# result = task_repository.select(10)
# task_repository.delete_all()
# task_repository.delete(1)
task_2.mark_complete()
task_repository.update(task_2)

result = task_repository.select_all()

for task in result:
    print(task.__dict__)

pdb.set_trace()