.model small
.stack 0100h
.data
.code

mov ax, @data
mov ds, ax

mov ah, 02h
mov dl, 'S'
int 21h
mov dl, 'a'
int 21h
mov dl, 'M'
int 21h

mov ax, 4c00h
int 21h
END
