import { Component, OnInit } from '@angular/core';
import {Weekdays} from "../../services/weekdays/weekdays";
import {WeekdaysService} from "../../services/weekdays/weekdays.service";

@Component({
  selector: 'app-weekdays-list',
  templateUrl: './weekdays-list.component.html',
  styleUrls: ['./weekdays-list.component.css']
})
export class WeekdaysListComponent implements OnInit {

  weekdays: Weekdays[];

  constructor(private weekdaysService: WeekdaysService) {
  }

  ngOnInit(): void {
    this.weekdaysService.finAll().subscribe(data => {
      this.weekdays = data;
    });
  }

}
