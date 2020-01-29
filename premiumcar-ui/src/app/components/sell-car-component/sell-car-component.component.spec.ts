import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SellCarComponentComponent } from './sell-car-component.component';

describe('SellCarComponentComponent', () => {
  let component: SellCarComponentComponent;
  let fixture: ComponentFixture<SellCarComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SellCarComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SellCarComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
