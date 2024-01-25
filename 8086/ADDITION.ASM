.model small
.stack 100h
.data
prompt_1 db 'Enter The First Digit : $'
prompt_2 db 'Enter The Second Digit : $'
prompt_3 db 'Sum of First and Second Digit : $'

.code
main proc
mov ax, @data
mov ds, ax

lea dx, prompt_1
mov ah, 9
int 21h

mov ah, 1
int 21h

mov bl, al
sub bl, 30h

mov ah, 2
mov dl, 0dh
int 21h

mov dl, 0ah
int 21h

lea dx, prompt_2
mov ah, 9
int 21h

mov ah, 1
int 21h

mov bh, al
sub bh, 30h

mov ah, 2
mov dl, 0dh
int 21h

mov dl, 0ah
int 21h

lea dx, prompt_3
mov ah, 9
int 21h

add bl, bh
add bl, 30h

mov ah, 2
mov dl, bl
int 21h

mov ah, 4ch
int 21h

main endp
end main
