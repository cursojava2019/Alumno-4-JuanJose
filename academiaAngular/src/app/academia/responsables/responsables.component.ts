import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';

@Component({
  selector: 'app-responsables',
  templateUrl: './responsables.component.html',
  styleUrls: ['./responsables.component.scss'],
  animations: [routerTransition()]
})
export class ResponsablesComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
