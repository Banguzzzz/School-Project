.model small
.stack 0100h
.data
.code

mov ax, @data
mov dx, ax

mov cx, 10
mov dx, 48

A:
mov ah, 02h
int 21h
add dx, 17
int 21h
sub dx, 17
inc dx
loop A

mov ah, 4ch
int 21h
END
