
import {Component} from "@angular/core";

@Component({
    moduleId: module.id,
    selector: 'my-app',
    template: `
      <h1>{{title}}</h1>
      <calendar></calendar>
  `,
    styleUrls: [ 'app.component.css' ],
})

export class AppComponent {
    title = 'Food roller';
}