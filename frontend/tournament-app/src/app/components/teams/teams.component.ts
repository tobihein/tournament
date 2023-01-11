import { TeamsService } from './../../services/teams.service';
import { Team } from './../../entities/team';
import { Component, OnInit, Injectable } from '@angular/core';

@Component({
  selector: 'app-teams',
  templateUrl: './teams.component.html',
  styleUrls: ['./teams.component.css']
})
@Injectable()
export default class TeamsComponent implements OnInit{
  constructor(private teamsService: TeamsService) {

  }

  teams: Team[] = []
  ngOnInit(): void {
    this.teamsService.getTeams().subscribe(
      response => {
        this.teams=response
      }
    )
  }
}
