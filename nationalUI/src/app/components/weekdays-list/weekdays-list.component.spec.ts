import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WeekdaysListComponent } from './weekdays-list.component';

describe('WeekdaysListComponent', () => {
  let component: WeekdaysListComponent;
  let fixture: ComponentFixture<WeekdaysListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WeekdaysListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WeekdaysListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
