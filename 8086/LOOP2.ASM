.model small
.stack 0100h
.data

.code
main proc
mov cx, 10
mov dx, 57

l2:
mov ah, 2
int 21h

dec dx

loop l2
mov ah, 4ch
int 21h

main endp
end main
