import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Weekdays} from './weekdays';

@Injectable({
  providedIn: 'root'
})
export class WeekdaysService {

  private readonly weekdaysUrl: string;

  constructor(private http: HttpClient) {
    this.weekdaysUrl = 'http://localhost:8989/weekdays';
  }

  public finAll(): Observable<Weekdays[]> {
    return this.http.get<Weekdays[]>(this.weekdaysUrl);
  }
}
