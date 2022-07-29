import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProjectService } from '../project.service';
import { Project } from '../project';

@Component({
  selector: 'app-create-project',
  templateUrl: './create-project.component.html',
  styleUrls: ['./create-project.component.css']
})
export class CreateProjectComponent implements OnInit {

  project: Project;
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private projectService: ProjectService) {
    this.project = new Project();
  }

  onSubmit() {
    this.projectService.save(this.project).subscribe(result => this.gotoProjectList());
  }

  gotoProjectList() {
    this.router.navigate(['/dashboard']);
  }
  ngOnInit(): void {
  }
}
