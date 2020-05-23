import { Component, OnInit } from '@angular/core';
import {Dates} from '../../services/dates/dates';
import {DatesService} from "../../services/dates/dates.service";

@Component({
  selector: 'app-dates-list',
  templateUrl: './dates-list.component.html',
  styleUrls: ['./dates-list.component.css']
})

export class DatesListComponent implements OnInit {

  dates: Dates[];

  constructor(private datesService: DatesService) {
  }

  ngOnInit(): void {
    this.datesService.findAll().subscribe(data => {
      this.dates = data;
    });
  }

}
