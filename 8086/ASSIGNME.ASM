.model small
.stack 100h
.data
.code
main proc
mov cx, 14
mov dx, ' '

A:
mov ah, 02h
int 21h
mov bx, dx
mov dx, ' '
int 21h
mov dx, bx


dec dx
loop A

mov ah,4ch
int 21h
END
