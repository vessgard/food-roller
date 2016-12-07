
import {Component} from "@angular/core";
import {CalendarWeek} from "./calendar-week";

@Component({
    moduleId: module.id,
    selector: 'calendar',
    templateUrl: 'calendar.component.html',
    styleUrls: ['calendar.component.css'],
})

export class CalendarComponent {

    year: number;
    month: number;
    weeks: CalendarWeek[];

    constructor() {
        var dateNow = new Date();

        this.year = dateNow.getFullYear();
        this.month = dateNow.getMonth();

        this.weeks = this.getWeeks(this.year, this.month);
    }

    getWeeks(year : number, month: number): CalendarWeek[] {

        var weeks = [];

        var date = new Date(year, month, 0);


        var dopp = date.getDate();


        return weeks;
    }
}