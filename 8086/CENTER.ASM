.model small
.stack 0200h
.data
msg1 db 'Bulacan Agricultural State College', 0ah,'$'
msg2 db 'Barangay. Pinaod, San Ildefonso, Bulacan','$'

.code
mov ax, @data
mov ds, ax

mov ah, 3h
mov bh, 0h
int 10h

mov ah, 2h
mov bh, 0h
mov dl, 21
int 10h

mov ah, 09h
lea dx, msg1
int 21h

mov ah, 3h
mov bh, 0h
int 10h

mov ah, 2h
mov bh, 0h
mov dl, 21
int 10h

mov ah, 09h
lea dx, msg2
int 21h

mov ah, 4ch
mov al, 00h
int 21h

end






