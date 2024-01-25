.model small
.stack 0200h
.data
msg1 db 'Information$'

.code
mov ax, @data
mov ds, ax

mov ah, 3h
mov bh, 0h
int 10h

mov ah, 2h
mov bh, 0h
mov dl, 35
int 10h

mov ah, 09h
lea dx, msg1
int 21h

mov ah, 4ch
mov al, 00h
int 21h

END

