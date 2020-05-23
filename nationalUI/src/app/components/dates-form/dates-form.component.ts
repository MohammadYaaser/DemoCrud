import { Component, OnInit } from '@angular/core';
import {Dates} from '../../services/dates/dates';
import {ActivatedRoute, Router} from '@angular/router';
import {DatesService} from '../../services/dates/dates.service';

@Component({
  selector: 'app-dates-form',
  templateUrl: './dates-form.component.html',
  styleUrls: ['./dates-form.component.css']
})
export class DatesFormComponent implements OnInit {

  dates: Dates;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private datesService: DatesService
  ) {
    this.dates = new Dates();
  }

  onSubmit() {
    console.log('All Dates' ); console.log(this.dates);
    this.datesService.save(this.dates).subscribe(result => this.gotoDatesList());
  }

  gotoDatesList() {
    this.router.navigate(['/dates']);
  }

  ngOnInit(): void {
  }

}
