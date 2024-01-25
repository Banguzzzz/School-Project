.model small
.stack 0100h
.data
X DB "Computer",13,10,'$'
.code

mov ax, @data
mov ds, ax
mov ah, 09h
mov dx, OFFSET X
int 21h

mov ax, 4c00h
int 21h
END


