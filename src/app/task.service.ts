import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Task } from './task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private tasksUrl: string;

  constructor(private http: HttpClient) {
    this.tasksUrl = 'http://localhost:8080/tasks';
  }

  public findAll(): Observable<Task[]> {
    return this.http.get<Task[]>(this.tasksUrl);
  }

  public save(task: Task) {
    return this.http.post<Task>(this.tasksUrl, task);
  }
}
