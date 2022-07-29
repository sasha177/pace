import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LaunchComponent } from './launch/launch.component';
import { RouterModule, Routes } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SignupComponent } from './signup/signup.component';
import { AboutComponent } from './about/about.component';
import { DashboardHeaderComponent } from './dashboard-header/dashboard-header.component';
import { CreateTaskComponent } from './create-task/create-task.component';
import { CreateProjectComponent } from './create-project/create-project.component';
import { ProjectListComponent } from './project-list/project-list.component';
import { TaskListComponent } from './task-list/task-list.component';
import { WorkspaceComponent } from './workspace/workspace.component';
import { UserListComponent } from './user-list/user-list.component';
const appRoutes: Routes = [
  { path:'', component: LaunchComponent },
  { path:'signup', component: SignupComponent },
  { path:'dashboard', component: DashboardComponent },
  { path:'createtask', component: CreateTaskComponent },
  { path:'createproject', component: CreateProjectComponent },
  { path: 'workspace', component: WorkspaceComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LaunchComponent,
    FooterComponent,
    LoginComponent,
    DashboardComponent,
    SignupComponent,
    AboutComponent,
    DashboardHeaderComponent,
    CreateTaskComponent,
    CreateProjectComponent,
    ProjectListComponent,
    TaskListComponent,
    WorkspaceComponent,
    UserListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
