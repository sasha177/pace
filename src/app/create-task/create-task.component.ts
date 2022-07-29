import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { TaskService } from '../task.service';
import { Task } from '../task';

@Component({
  selector: 'app-create-task',
  templateUrl: './create-task.component.html',
  styleUrls: ['./create-task.component.css']
})

export class CreateTaskComponent implements OnInit {

  task: Task;
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private taskService: TaskService) {
    this.task = new Task();
  }

  onSubmit() {
    this.taskService.save(this.task).subscribe(result => this.gotoTaskList());
  }

  gotoTaskList() {
    this.router.navigate(['/dashboard']);
  }
  ngOnInit(): void {
  }
}
