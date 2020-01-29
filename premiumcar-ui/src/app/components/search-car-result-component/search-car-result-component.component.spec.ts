import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchCarResultComponentComponent } from './search-car-result-component.component';

describe('SearchCarResultComponentComponent', () => {
  let component: SearchCarResultComponentComponent;
  let fixture: ComponentFixture<SearchCarResultComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchCarResultComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchCarResultComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
