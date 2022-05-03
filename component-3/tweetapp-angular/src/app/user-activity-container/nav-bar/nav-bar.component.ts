import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {
  name : string;
  constructor() {}
  
  logout(){
    // console.log("logout called!")
    sessionStorage.clear();
  }

  ngOnInit(): void {
    this.name = sessionStorage.getItem('firstName').toLocaleUpperCase();
  }

}
