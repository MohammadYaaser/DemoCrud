import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {WeekdaysListComponent} from './components/weekdays-list/weekdays-list.component';
import {DatesListComponent} from './components/dates-list/dates-list.component';
import {DatesFormComponent} from './components/dates-form/dates-form.component';


const routes: Routes = [
  { path: 'weekdays', component: WeekdaysListComponent},
  { path: 'dates', component: DatesListComponent},
  { path: 'addDates', component: DatesFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
