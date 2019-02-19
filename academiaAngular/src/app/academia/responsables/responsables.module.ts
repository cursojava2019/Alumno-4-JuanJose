import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ResponsablesRoutingModule } from './responsables-routing.module';
import { ResponsablesComponent } from './responsables.component';
import { PageHeaderModule } from '../../shared';

@NgModule({
  declarations: [ResponsablesComponent],
  imports: [
    CommonModule,
    ResponsablesRoutingModule,
    PageHeaderModule
  ]
})
export class ResponsablesModule { }
