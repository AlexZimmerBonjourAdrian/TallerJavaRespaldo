import { Component, OnInit } from '@angular/core';

import { io } from 'socket.io-client';
const SOCKET_ENDPOINT = 'localhost:3000';

@Component({
  selector: 'app-chat-inbox',
  templateUrl: './chat-inbox.component.html',
  styleUrls: ['./chat-inbox.component.css']
})
export class ChatInboxComponent implements OnInit {

constructor() { }
socket= io(SOCKET_ENDPOINT,{
rejectUnauthorized: false });

ngOnInit() {
  
  this.setupSocketConnection();
 
  }


setupSocketConnection(){
  this.socket = io(SOCKET_ENDPOINT,rejectUnauthorized: false }));
  }

}
