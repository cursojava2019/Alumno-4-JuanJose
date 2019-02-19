import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ResponsablesComponent } from './responsables.component';

const routes: Routes = [
  {
      path: '',
      component: ResponsablesComponent
  },


];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ResponsablesRoutingModule { }
