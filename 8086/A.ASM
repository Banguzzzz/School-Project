.model small
.stack 100h
.data
mov ax, @data
mov ds, ax
mov ah, 02h
mov dx, 'A'
int 21h
mov ax, 4c00h ;end
int 21h
END
