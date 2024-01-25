.model small
.stack 0100h
.data
.code

mov ax, @data
mov ds, ax

mov ah, 02h
mov dl, 'I'
int 21h
mov dl, 0Ah
int 21h
mov dl, 0Dh
int 21h
mov dl, 'T'
int 21h
mov dl, 0ah
int 21h
mov dl, 0dh
int 21h
mov dl, 'E'
int 21h

mov ax, 4c00h
int 21h
END

