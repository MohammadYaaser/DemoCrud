import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { WeekdaysListComponent } from './components/weekdays-list/weekdays-list.component';
import { DatesListComponent } from './components/dates-list/dates-list.component';
import { DatesFormComponent } from './components/dates-form/dates-form.component';

@NgModule({
  declarations: [
    AppComponent,
    WeekdaysListComponent,
    DatesListComponent,
    DatesFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
