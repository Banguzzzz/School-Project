.model small
.stack 0100h
.data
square db '**********',13,10, '$'

.code
main proc
mov ax, @data
mov ds, ax

lea dx, square
mov ah, 9h

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
