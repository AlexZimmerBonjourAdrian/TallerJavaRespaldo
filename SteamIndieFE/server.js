var app = require('express')();
var http =require('http').createServer(app);
var io=require('socket.io')(http);

app.get('/',(req,res)=>res.send(''))

io.on('connection',(socket) => {
    console.log('a user connected');
    socket.on('message',(msg) =>{
        console.log(msg);
        socket.broadcast.emit('message-broadcast',msg);
    });
});


var io = require('socket.io') (http);
io.on ('connection',(socket)=> {
    console.log('a user connected');
});

http.listen(8080, ()=> {
    console.log('listing on *:8000');
});

socket.on('message', (msg) => {
    console.log(msg);
    socket.broadcast.emit('message-broadcast', msg);
   });