import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Team } from '../entities/team';

@Injectable({
  providedIn: 'root'
})
export class TeamsService {

  constructor(private http: HttpClient) { }

  getTeams(): Team[] {
    return [this.createTeam("34", "First"), this.createTeam("23345", "Second")]
  }

  private createTeam(teamId: string, teamName: string): Team {
    const team: Team  = {
      id: teamId,
      name: teamName
    };
    return team;
  }
}
