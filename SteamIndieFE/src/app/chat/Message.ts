import{FormControl, FormGroup} from '@angular/forms'
export class Message{
    info=new FormGroup({
        User: new FormControl(''),
        Message: new FormControl(''),
    });
}