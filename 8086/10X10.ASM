.model small
.stack 0100h
.data
message db '**********',0dh,0ah, '$'

.code
main proc
mov ax, @data
mov bx, ax

lea dx, message
mov ah, 9

int 21h
int 21h
int 21h
int 21h
int 21h
int 21h
int 21h
int 21h
int 21h
int 21h

mov ah, 4ch
int 21h
main endp
end main
