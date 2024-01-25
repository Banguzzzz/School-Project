.model small
.stack 0100h
.data

.code
mov ax, @data
mov ds, ax

mov cx, 26
mov dx, 65
mov ah, 02h

la:
int 21h
inc dx
loop la

mov ah, 4ch
int 21h
END
