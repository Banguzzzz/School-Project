.model small
.stack 100h
.data
prompt db 'Enter age : $'
minor_msg db 'MINOR'
legal_msg db 'LEGAL AGE'

.code
main proc
   mov ax, @data
   mov dx, OFFSET prompt
   lea bx, [age]

   print:
   lea dx, [print_msg]
   int 21h

   input:
   mov ah, 1
   int 21h
   mov [bx], al

   check_age:
   cmp [bx], 18
   jge legal

   lea dx, [minor_msg]
   int 21h
   jmp exit

   legal:lea dx, [legal_msg]
   int 21h

   exit:
   mov ah, 4ch
   int 21h
   main endp
   end main
   jmp exit
