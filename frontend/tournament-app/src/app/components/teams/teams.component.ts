import { Team } from './../../entities/team';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-teams',
  templateUrl: './teams.component.html',
  styleUrls: ['./teams.component.css']
})
export class TeamsComponent implements OnInit{
  team: Team = {
    id: 1,
    name: 'Windstorm'
  };
  ngOnInit(): void {

  }
}
