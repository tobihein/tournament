import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Inject, Injectable, Component } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Team } from '../entities/team';

@Injectable({
  providedIn: 'root'
})

export class TeamsService {

  constructor(private http: HttpClient) { }

  getTeams(): Observable<Team[]> {
    return this.http.get<Team[]>('api/teams')
  }

  safeNewTeam(team: Team): Observable<Team> {
    return this.http.put<Team>('api/teams', team)
  }
}
