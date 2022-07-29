import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user.service';
import { User } from '../user';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  user: User;
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private userService1: UserService) {
    this.user = new User();
  }

  onSubmit() {
    this.userService1.save(this.user).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/dashboard']);
  }
  ngOnInit(): void {
  }

}
