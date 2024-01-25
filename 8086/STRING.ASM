.model small
.stack 100h
.data
string_1 db 'Assolam-0lijum$'
string_2 db 'Pakistan Zindabad$'

.code
main proc
mov ax, @data
mov ds, ax

lea dx, string_1
mov ah, 09h
int 21h

mov ah, 2
mov dl, 0dh
int 21h

mov dl, 0ah
int 21h

lea dx, string_2
mov ah, 09h
int 21h

mov ah, 4ch
int 21h
main endp
end main
