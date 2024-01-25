.model small
.stack 0100h
.data
prompt db 'The 256 ASCII Characters are : $'

.code
main proc
mov ax, @data
mov ds, ax

lea dx, prompt
mov ah, 9
int 21h

mov cx, 256

mov ah, 2
mov dl, 0

@loop:
int 21h

inc dl
dec cx
jnz @loop

mov ah, 4ch
int 21h
main endp
end main
