.model small
.stack 0100h
.data
.code

mov ax, @data
mov ds, ax
mov cx, 001Eh
mov ah, 02h
mov dl, 'y'
a:int 21h
loop a
mov ax, 4c00h
int 21h
END
