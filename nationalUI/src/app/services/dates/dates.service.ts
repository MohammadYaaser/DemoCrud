import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Dates} from './dates';

@Injectable({
  providedIn: 'root'
})
export class DatesService {

  private readonly datesUrl: string;

  constructor(private http: HttpClient) {
    this.datesUrl = 'http://localhost:8989/dates';
  }

  public findAll(): Observable<Dates[]> {
    return this.http.get<Dates[]>(this.datesUrl);
  }

  public save(dates: Dates) {
    return this.http.post<Dates>(this.datesUrl, dates);
  }
}
