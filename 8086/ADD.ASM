.model small
.stack 100h
.data
.code

main proc
mov ah, 1
int 21h
mov bl, dl

mov cl, '+'
mov dl, cl
mov ah, 2
int 21h

mov ah, 1
int 21h
mov ch, al
add bl, ch
sub bl, 48
mov ah, 2

mov dl, 0dh
int 21h
mov dl, 0ah
int 21h

mov dl, bl
int 21h
mov ah, 4ch
int 21h

main endp
end main
